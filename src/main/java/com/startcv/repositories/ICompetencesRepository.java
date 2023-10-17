package com.startcv.repositories;

import com.startcv.entities.CompetencesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICompetencesRepository extends JpaRepository<CompetencesEntity, Long> {
}
