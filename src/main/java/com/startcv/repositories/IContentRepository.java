package com.startcv.repositories;

import com.startcv.entities.ContentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IContentRepository extends JpaRepository<ContentEntity, Long> {
    @Query(value="SELECT c FROM content c WHERE c.category = ?", nativeQuery = true)
    public ContentEntity findByCategory(String category);

}