package com.app.command;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@Builder
@ToString
public class GenerateExamCommand {
    private String email;
    private Long examNumber;
    private List<Long> questions;
}
