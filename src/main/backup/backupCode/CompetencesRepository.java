package com.startcv.services.backupCode;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * Boolean publiable;
 *     private String category;
 *     private Collection<CompetencesEntity> competencesByContentId;
 *     private Collection<ImagesEntity> imagesByContentId;
 *     private IntervalsDatesEntity intervalsDatesByContentId;
 *     private Collection<SitesEntity> sitesByContentId;
 *     private Collection<TitreDescEntity> titreDescsByContentId;
 *
 * **/
@Repository
public class CompetencesRepository  {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void insertCompetencesWithQuery(CompetencesEntity competences) {
        entityManager.createNativeQuery("INSERT INTO competences (titre, content) VALUES (?,?)")
                .setParameter(1, competences.getTitreId())
                .setParameter(2, competences.getContentId())
                .executeUpdate();
    }
}
