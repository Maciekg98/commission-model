package com.app.util;

import com.app.dto.AnswerDto;
import com.app.dto.ExamDto;
import com.app.dto.QuestionDto;
import com.app.model.Answer;
import com.app.model.Exam;
import com.app.model.Question;
import lombok.experimental.UtilityClass;

import java.util.stream.Collectors;

@UtilityClass
public class ExamMapper {

    public ExamDto mapExamToExamDto(Exam exam){
        return ExamDto.builder()
                .id(exam.getId())
                .questions(exam.getQuestions()
                        .stream()
                        .map(ExamMapper::mapQuestionToQuestionDto)
                        .collect(Collectors.toList()))
                .build();
    }

    public QuestionDto mapQuestionToQuestionDto(Question question) {
        return QuestionDto.builder()
                .id(question.getId())
                .content(question.getContent())
                .questionCategory(question.getQuestionCategory().getCategoryName())
                .typeOfQuestion(String.valueOf(question.getTypeOfQuestion()))
                .answers(question.getAnswers()
                        .stream()
                        .map(ExamMapper::mapAnswerToAnswerDto)
                        .collect(Collectors.toList()))
                .build();
    }

    public AnswerDto mapAnswerToAnswerDto(Answer answer){
        return AnswerDto.builder()
                .id(answer.getId())
                .content(answer.getContent())
                .isCorrect(answer.isCorrect())
                .build();
    }


}
