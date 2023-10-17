package com.startcv.services;

import com.startcv.repositories.IContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContentService {
    @Autowired
    IContentRepository contentRepository;

    public IContentRepository getContentRepository() {
        return this.contentRepository;
    }

}
