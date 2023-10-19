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
public class TitreDescRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void insertTitreDescWithQuery(TitreDescEntity titre) {
        entityManager.createNativeQuery("INSERT INTO titre_desc (titre, description, competences,content,images ,sites) VALUES (?,?,?,?,?,?)")
                .setParameter(1, titre.getTitre())
                .setParameter(2, titre.getDescription())
                .setParameter(3, titre.getCompetencesId())
                .setParameter(4, titre.getContentId())
                .setParameter(5, titre.getImagesId())
                .setParameter(6, titre.getSitesId())
                .executeUpdate();
    }
}
