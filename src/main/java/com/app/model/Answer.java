package com.app.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "answerIdGenerator")
    @SequenceGenerator(name = "answerIdGenerator", allocationSize = 200, initialValue = 100, sequenceName = "answer_id_sequence")
    private Long id;
    private String content;
    private boolean correct;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "Question_id")
    @JsonIgnore
    private Question owner;


    public Answer(String content, boolean correct) {
        this.content = content;
        this.correct = correct;
    }

}