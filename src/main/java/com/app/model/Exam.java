package com.app.model;

import com.app.dto.QuestionDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Exam {
    @Id
    @GeneratedValue(strategy =  GenerationType.SEQUENCE, generator = "examIdGenerator")
    @SequenceGenerator(name = "examIdGenerator",allocationSize = 100,initialValue = 50,sequenceName = "exam_id_sequence")
    private Long id;
    @ManyToMany(/*mappedBy = "exams",*/cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE})
    List<Question> questions;

    public Exam(List<Question> questions) {
        this.questions = questions;
    }
}