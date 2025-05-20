package com.bitlab.lmsbackend.mapper;

import com.bitlab.lmsbackend.dto.AttachmentDto;
import com.bitlab.lmsbackend.entity.Attachment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring")
public interface AttachmentMapper {
    @Mapping(source = "lesson.id", target = "lessonId")
    AttachmentDto toDto(Attachment attachment);
    @Mapping(source = "lessonId", target = "lesson.id")
    Attachment toEntity(AttachmentDto dto);
    List<AttachmentDto> toDtoList(List<Attachment> attachments);
}
