package com.app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class QuestionDto {
    //TODO do uzupełnienia
    private int id;
    private String content;

    //jak rozegrac te odpowiedzi single- multi- i otwarte? ENUMS?

}
