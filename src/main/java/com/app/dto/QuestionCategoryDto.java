package com.app.dto;

import com.app.model.QuestionCategory;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class QuestionCategoryDto {
    private Long id;
    private String categoryName;

    public QuestionCategoryDto(QuestionCategory questionCategory) {
        this.id = questionCategory.getId();
        this.categoryName = questionCategory.getCategoryName();
    }
}