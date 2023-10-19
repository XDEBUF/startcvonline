package com.startcv.services;

import com.startcv.entities.IContentRepository;
import com.startcv.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ContentService {
    @Autowired
    IContentRepository contentRepository;
    @Autowired
    IImageRepository imageRepository;
    @Autowired
    ISitesRepository sitesRepository;
    @Autowired
    ICompetencesRepository competencesRepository;
    @Autowired
    IIntervalsDatesRepository intervalsDatesRepository;
    @Autowired
    ITitreDescRepository titreDescRepository;
     public Optional<ContentEntity> getContentByiD(Long id){

         Optional<ContentEntity>content = contentRepository.findById(id);

          return Optional.of(content.get());

     }

}
