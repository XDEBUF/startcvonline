package com.startcv.services.backupCode;

import com.startcv.entities.SitesEntity;
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
public class SitesRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void insertSitesWithQuery(SitesEntity sites) {
        entityManager.createNativeQuery("INSERT INTO sites (url_site, titre,content) VALUES (?,?,?)")
                .setParameter(1, sites.getUrlSite())
                .setParameter(2, sites.getTitreDescsBySiteId())
                .setParameter(3, sites.getContentId())
                .executeUpdate();
    }
}
