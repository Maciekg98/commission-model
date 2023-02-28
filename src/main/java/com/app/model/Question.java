package com.app.model;

import com.app.model.enums.TypeOfQuestion;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "questionIdGenerator")
    @SequenceGenerator(name = "questionIdGenerator", allocationSize = 150, initialValue = 50, sequenceName = "question_id_sequence")
    private Long id;
    private String content;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private QuestionCategory questionCategory;

    @Enumerated(EnumType.STRING)
    private TypeOfQuestion typeOfQuestion;

    @Version
    private long version;

    @OneToMany(mappedBy = "owner", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private Set<Answer> answers = new HashSet<>();

    @ManyToMany(mappedBy = "questions",cascade = {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REMOVE})
    @JsonIgnore
    Set<Exam> exams;


    public Question(String content, QuestionCategory questionCategory, TypeOfQuestion typeOfQuestion, Set<Answer> answers) {
        this.content = content;
        this.questionCategory = questionCategory;
        this.typeOfQuestion = typeOfQuestion;
        this.answers = answers;
        answers.forEach(a -> a.setOwner(this));
    }


    //TODO zrobic addAnswerWithValidation
}