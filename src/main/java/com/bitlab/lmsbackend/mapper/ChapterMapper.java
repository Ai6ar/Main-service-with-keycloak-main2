package com.bitlab.lmsbackend.mapper;

import com.bitlab.lmsbackend.dto.ChapterDto;
import com.bitlab.lmsbackend.entity.Chapter;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring")
public interface ChapterMapper {
    @Mapping(source = "course.id", target = "courseId")
    ChapterDto toDto(Chapter chapter);
    @Mapping(source = "courseId", target = "course.id")
    Chapter toEntity(ChapterDto dto);
    List<ChapterDto> toDtoList(List<Chapter> chapters);
}
