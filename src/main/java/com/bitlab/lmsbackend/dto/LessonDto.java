package com.bitlab.lmsbackend.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LessonDto {
    private Long id;
    private Long chapterId;
    private String name;
    private String description;
    private String content;
    private int order;
}
