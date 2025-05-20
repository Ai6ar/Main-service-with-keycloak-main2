package com.bitlab.lmsbackend.service;

import com.bitlab.lmsbackend.dto.CourseDto;
import com.bitlab.lmsbackend.entity.Course;
import com.bitlab.lmsbackend.exception.ResourceNotFoundException;
import com.bitlab.lmsbackend.mapper.CourseMapper;
import com.bitlab.lmsbackend.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {
    private final CourseRepository courseRepository;
    private final CourseMapper courseMapper;

    public CourseDto createCourse(CourseDto dto) {
        Course course = courseMapper.toEntity(dto);
        course.setCreatedTime(LocalDateTime.now());
        Course saved = courseRepository.save(course);
        return courseMapper.toDto(saved);
    }

    public CourseDto getCourse(Long id) {
        Course course = courseRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Course not found: " + id));
        return courseMapper.toDto(course);
    }

    public List<CourseDto> getAll() {
        return courseMapper.toDtoList(courseRepository.findAll());
    }

    public CourseDto updateCourse(Long id, CourseDto dto) {
        Course course = courseRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Course not found: " + id));
        course.setName(dto.getName());
        course.setDescription(dto.getDescription());
        course.setUpdatedTime(LocalDateTime.now());
        return courseMapper.toDto(courseRepository.save(course));
    }

    public void deleteCourse(Long id) {
        courseRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Course not found: " + id));
        courseRepository.deleteById(id);
    }
}
