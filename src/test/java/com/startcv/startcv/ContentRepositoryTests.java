package com.startcv.startcv;

import com.startcv.entities.*;
import com.startcv.repositories.ContentRepositoryInterface;
import com.startcv.services.ContentService;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Date;


@SpringBootTest
    @RunWith(MockitoJUnitRunner.class)
public class ContentRepositoryTests {
        @InjectMocks
        private ContentService contentService;
        @Mock
        private ContentRepositoryInterface contentRepository;
    @Test
    @DisplayName("Test la création d'un contenu")
    public void create() {

        contentService = new ContentService();
        ContentEntity content = new ContentEntity(true);
        content.setCategory("Formation");
        content.setPubliable(Boolean.TRUE);

        TitreDescEntity titreimg1 = new TitreDescEntity();
        titreimg1.setTitre("image google site");
        titreimg1.setDescription("Un essai de publication d'image");

        ImagesEntity image1 = new ImagesEntity(true);
        image1.setUrlImg("http://www.google.com");
        titreimg1.setImagesId(image1.getIdImage());
        image1.getTitreDescsByIdImage().add(titreimg1);
        image1.setContentId(content.getContentId());

        TitreDescEntity titreComp1 = new TitreDescEntity();
        titreComp1.setTitre("Java");
        titreComp1.setDescription("ce site est réalisé en JAVA pour la partie BACKEND");

        CompetencesEntity cp1 = new CompetencesEntity(true);
        titreComp1.setCompetencesId(cp1.getCompetencesId());
        cp1.getTitreDescsByCompetencesId().add(titreComp1);
        cp1.setContentId(content.getContentId());

        TitreDescEntity titreSite1 = new TitreDescEntity();
        titreSite1.setTitre("new site");
        titreSite1.setDescription("un essai de site");

        SitesEntity st1 = new SitesEntity(true);
        titreSite1.setSitesId(st1.getSiteId());
        st1.setUrlSite(("http://google.com"));
        st1.getTitreDescsBySiteId().add(titreSite1);
        st1.setContentId(content.getContentId());

        IntervalsDatesEntity ide1 = new IntervalsDatesEntity();
        ide1.setDateDebut(Date.valueOf("2001-01-01"));
        ide1.setEnCours(Boolean.TRUE);
        ide1.setContentId(content.getContentId());

        TitreDescEntity titreContent1 = new TitreDescEntity();
        titreContent1.setTitre("Formation JAVA");
        titreContent1.setDescription("Un essai de publication de contenu");
        content.getImagesByContentId().add(image1);
        content.getTitreDescsByContentId().add(titreContent1);
        content.getCompetencesByContentId().add(cp1);
        content.getSitesByContentId().add(st1);
        contentRepository.save(content);

    }

    public ContentService getContentService() {
        return contentService;
    }

    public void setContentService(ContentService contentService) {
        this.contentService = contentService;
    }
}
