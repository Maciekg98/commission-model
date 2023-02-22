package com.app.command;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@NoArgsConstructor
public class GenerateExamCommand {
    private String email;
    private Long examNumber;
    private List<Long> questions;
}
