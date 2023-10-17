package com.startcv.repositories;

import com.startcv.entities.TitreDescEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITitreDescRepository extends JpaRepository<TitreDescEntity, Long> {
}
