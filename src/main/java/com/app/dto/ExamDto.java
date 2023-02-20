package com.app.dto;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@Builder
@ToString
public class ExamDto {

    private String email;
    private Long examNumber;
    private List<QuestionDto> questions;
}
