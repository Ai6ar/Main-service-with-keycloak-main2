package com.bitlab.lmsbackend.repository;

import com.bitlab.lmsbackend.entity.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChapterRepository extends JpaRepository<Chapter, Long> {
}
