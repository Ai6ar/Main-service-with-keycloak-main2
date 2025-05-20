package com.bitlab.lmsbackend.mapper;

import com.bitlab.lmsbackend.dto.LessonDto;
import com.bitlab.lmsbackend.entity.Lesson;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring")
public interface LessonMapper {
    @Mapping(source = "chapter.id", target = "chapterId")
    LessonDto toDto(Lesson lesson);
    @Mapping(source = "chapterId", target = "chapter.id")
    Lesson toEntity(LessonDto dto);
    List<LessonDto> toDtoList(List<Lesson> lessons);
}
