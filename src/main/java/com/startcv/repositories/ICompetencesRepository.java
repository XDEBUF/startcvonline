package com.startcv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICompetencesRepository extends JpaRepository<Competence, Long> {
}
