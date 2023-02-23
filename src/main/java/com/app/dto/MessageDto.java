package com.app.dto;

import lombok.*;



@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MessageDto {

    private String from;
    private String to;
    private String subject;
    private String text;
}
