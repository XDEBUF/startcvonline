package com.startcv.services;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.startcv.entities.ContentEntity;
/**
 * Atomiser les requêtes
 * et creer des interfaces
 * pour rassembler les elements à inserer
 * lire https://www.baeldung.com/spring-data-jpa-query
 * */
public class PostContentServices {

    @Modifying
    @Query(
            value =
                    "insert into content (publiable, category) values (:publiable, :categorie)",
            nativeQuery = true)
    void insertContent(@Param("name") String name, @Param("age") Integer age,
                    @Param("status") Integer status, @Param("email") String email) {
    }
}
