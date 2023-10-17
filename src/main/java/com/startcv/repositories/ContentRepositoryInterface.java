package com.startcv.repositories;

import com.startcv.entities.ContentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentRepositoryInterface extends JpaRepository<ContentEntity, Long> {
}