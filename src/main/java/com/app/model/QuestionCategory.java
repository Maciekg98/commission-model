package com.app.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class QuestionCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "questionCategoryIdGenerator")
    @SequenceGenerator(name = "questionCategoryIdGenerator", allocationSize = 100, initialValue = 1, sequenceName = "question_category_id_sequence")
    private Long id;

    private String categoryName;

    @OneToMany(mappedBy = "questionCategory", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JsonIgnore
    private Set<Question> question;

    public QuestionCategory(String categoryName) {
        this.categoryName = categoryName;
    }
}
