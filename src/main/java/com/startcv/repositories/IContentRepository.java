package com.startcv.repositories;

import com.startcv.entities.Content;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IContentRepository extends JpaRepository<Content, Long> {
}
