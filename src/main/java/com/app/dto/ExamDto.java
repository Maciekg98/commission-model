package com.app.dto;

import lombok.*;

import java.util.List;

@Data
@Builder
@ToString
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ExamDto {

    private String email;
    private Long examNumber;
    private List<QuestionDto> questions;
}
