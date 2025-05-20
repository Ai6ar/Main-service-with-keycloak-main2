package com.bitlab.lmsbackend.mapper;

import com.bitlab.lmsbackend.dto.CourseDto;
import com.bitlab.lmsbackend.entity.Course;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring")
public interface CourseMapper {
    CourseDto toDto(Course course);
    Course toEntity(CourseDto dto);
    List<CourseDto> toDtoList(List<Course> courses);
}
