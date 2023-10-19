package com.startcv.repositories;

import com.startcv.entities.IntervalsDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IIntervalsDatesRepository extends JpaRepository<IntervalsDate, Long> {
}
