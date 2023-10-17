package com.startcv.repositories;

import com.startcv.entities.IntervalsDatesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IIntervalsDatesRepository extends JpaRepository<IntervalsDatesEntity, Long> {
}
