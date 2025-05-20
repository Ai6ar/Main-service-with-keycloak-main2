package com.bitlab.lmsbackend.controller;

import com.bitlab.lmsbackend.dto.CourseDto;
import com.bitlab.lmsbackend.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
@RequiredArgsConstructor
public class CourseController {
    private final CourseService service;

    @GetMapping
    public ResponseEntity<List<CourseDto>> list() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CourseDto> get(@PathVariable Long id) {
        return ResponseEntity.ok(service.getCourse(id));
    }

    @PostMapping
    public ResponseEntity<CourseDto> create(@RequestBody CourseDto dto) {
        return ResponseEntity.ok(service.createCourse(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CourseDto> update(@PathVariable Long id, @RequestBody CourseDto dto) {
        return ResponseEntity.ok(service.updateCourse(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.deleteCourse(id);
        return ResponseEntity.ok().build();
    }
}
