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
public class ContentRepository {

    @PersistenceContext
    private EntityManager entityManager;



    @Transactional
    public void insertContentWithQuery(ContentEntity content) {
        entityManager.createNativeQuery("INSERT INTO content (category, competences, images,intervals,sites, titre,publiable) VALUES (?,?,?,?,?,?,?)")
                .setParameter(1, content.getCategory())
                .setParameter(2, content.getCompetencesByContentId())
                .setParameter(3, content.getImagesByContentId())
                .setParameter(4, content.getIntervalsDatesByContentId())
                .setParameter(5, content.getSitesByContentId())
                .setParameter(6, content.getTitreDescsByContentId())
                .setParameter(7, content.getPubliable())
                .executeUpdate();
    }
}
