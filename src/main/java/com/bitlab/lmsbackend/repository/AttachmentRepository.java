package com.bitlab.lmsbackend.repository;

import com.bitlab.lmsbackend.entity.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttachmentRepository extends JpaRepository<Attachment, Long> {
}
