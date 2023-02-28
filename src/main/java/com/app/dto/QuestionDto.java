package com.app.dto;

import com.app.model.Answer;
import com.app.model.Question;
import com.app.model.enums.TypeOfQuestion;
import com.app.util.ExamMapper;
import lombok.*;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QuestionDto {
    private Long id;
    private String content;
    private String questionCategory;
    private String typeOfQuestion;
    private long version;
    private int numberOfAnswers;
    private List<AnswerDto> answers;

    public QuestionDto(Question question) {
        this.id = question.getId();
        this.content = question.getContent();
        this.questionCategory = question.getQuestionCategory().getCategoryName();
        this.typeOfQuestion = question.getTypeOfQuestion().toString();
        this.numberOfAnswers = question.getAnswers().size();
        this.answers = question.getAnswers().stream().map(ExamMapper::mapAnswerToAnswerDto).collect(Collectors.toList());
    }
}
