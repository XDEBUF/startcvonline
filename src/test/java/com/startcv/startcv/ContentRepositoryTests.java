package com.startcv.startcv;

import com.startcv.entities.*;
import com.startcv.repositories.IContentRepository;
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
        private IContentRepository contentRepository;
    @Test
    @DisplayName("Test la création d'un contenu")
    public void create() {

        contentService = new ContentService();
        Content content = new Content();
        content.setCategory("Formation");
        content.setPubliable(Boolean.TRUE);



        Image image1 = new Image();
        image1.setUrlImg("http://www.picasa.com");
        image1.setContent(content);


        Competence cp1 = new Competence();
        Site st1 = new Site();
        st1.setUrlSite(("http://google.com"));
        st1.setContent(content);

        IntervalsDate ide1 = new IntervalsDate();
        ide1.setDateDebut(Date.valueOf("2011-01-01").toLocalDate());
        ide1.setEnCours(Boolean.TRUE);
        ide1.setContent(content);

        contentRepository.save(content);
        String res = content.getId()+" "+
        content.getCategory()+" "+
        content.getPubliable()+" ";
        System.out.println(res);
    }
    /*@Test
    @DisplayName("Test la création d'un contenu")
    public void display(){
        Conten content = new Conten(true);
            content.getContentId();
            content.getCategory();
            content.getPubliable();
            content.getIntervalsDatesByContentId().getDateDebut();
            content.getIntervalsDatesByContentId().getDateFin();
            content.getIntervalsDatesByContentId().getEnCours();
            content.getSitesByContentId();
            content.getImagesByContentId().toArray();
            content.getCompetencesByContentId().toArray();
            content.getTitreDescsByContentId().toArray();
    }*/


    /*public Optional<Conten> getContentByiD(Long id){

            Optional<Conten>content = contentRepository.findById(id);

            return Optional.of(content.get());
    }*/

   /* public void setContentService(ContentService contentService) {
        this.contentService = contentService;
    }*/
}
