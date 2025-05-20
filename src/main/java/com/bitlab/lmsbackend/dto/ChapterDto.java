package com.bitlab.lmsbackend.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChapterDto {
    private Long id;
    private Long courseId;
    private String name;
    private String description;
    private int order;
}
