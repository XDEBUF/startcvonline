package com.startcv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISitesRepository extends JpaRepository<Site, Long> {
}
