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
public class IntervalsDatesRepository  {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void insertIntervalsDatesWithQuery(IntervalsDatesEntity intervalsDates) {
        entityManager.createNativeQuery("INSERT INTO intervals_dates (date_debut, date_fin, en_cours, content) VALUES (?,?,?,?)")
                .setParameter(1, intervalsDates.getDateDebut())
                .setParameter(2, intervalsDates.getDateFin())
                .setParameter(3, intervalsDates.getEnCours())
                .setParameter(4, intervalsDates.getContentId())
                .executeUpdate();
    }
}
