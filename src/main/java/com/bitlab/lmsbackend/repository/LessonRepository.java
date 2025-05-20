package com.bitlab.lmsbackend.repository;

import com.bitlab.lmsbackend.entity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Long> {
}
