package com.startcv.services.backupCode;

import com.startcv.entities.ImagesEntity;
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
public class ImagesRepository  {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void insertImagesWithQuery(ImagesEntity images) {
        entityManager.createNativeQuery("INSERT INTO images (url_img, titre,content) VALUES (?,?,?)")
                .setParameter(1, images.getUrlImg())
                .setParameter(2, images.getTitreDescsByIdImage())
                .setParameter(3, images.getContentId())
                .executeUpdate();
    }
}
