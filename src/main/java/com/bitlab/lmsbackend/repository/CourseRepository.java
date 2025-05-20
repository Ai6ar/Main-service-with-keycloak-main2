package com.bitlab.lmsbackend.repository;

import com.bitlab.lmsbackend.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
