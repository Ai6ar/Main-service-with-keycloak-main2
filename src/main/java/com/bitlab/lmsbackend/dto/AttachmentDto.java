package com.bitlab.lmsbackend.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AttachmentDto {
    private Long id;
    private Long lessonId;
    private String name;
    private String url;
}
