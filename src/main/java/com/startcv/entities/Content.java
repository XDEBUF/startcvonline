package com.startcv.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "content")
public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "content_id", nullable = false)
    private Integer id;

    @Column(name = "publiable")
    private Boolean publiable;

    @Size(max = 150)
    @Column(name = "category", length = 150)
    private String category;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getPubliable() {
        return publiable;
    }

    public void setPubliable(Boolean publiable) {
        this.publiable = publiable;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}