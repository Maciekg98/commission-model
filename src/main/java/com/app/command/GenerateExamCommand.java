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
    private String emailFrom;
    private String emailTo;
    private String subject;
    private List<Long> questions;
}
