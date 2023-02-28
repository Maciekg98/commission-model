package com.app.dto;

import com.app.model.Exam;
import com.app.model.Question;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExamDto {
    private Long id;
    private String name;
    private List<QuestionDto> questions;


}