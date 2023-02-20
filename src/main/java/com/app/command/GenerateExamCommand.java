package com.app.command;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class GenerateExamCommand {
    private String email;
    private Long examNumber;
    private List<Long> questions;
}
