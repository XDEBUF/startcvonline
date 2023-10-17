package com.startcv.services;

import com.startcv.entities.ContentEntity;
import com.startcv.repositories.ContentRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ContentService {
    @Autowired
    ContentRepositoryInterface contentRepository;

    public ContentRepositoryInterface getContentRepository() {
        return this.contentRepository;
    }
    public void saveContent(ContentEntity content) {
       this.getContentRepository().save(content);
    }
}
