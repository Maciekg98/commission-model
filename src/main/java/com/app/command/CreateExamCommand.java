package com.app.command;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class CreateExamCommand {
    private String name;
    private Set<Long> listOfQuestionIds;
}