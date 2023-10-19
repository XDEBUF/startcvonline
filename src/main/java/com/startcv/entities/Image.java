package com.startcv.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "images")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_image", nullable = false)
    private Integer id;

    @Size(max = 150)
    @Column(name = "url_img", length = 150)
    private String urlImg;

    @NotNull
    @Column(name = "titre_id", nullable = false)
    private Integer titreId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "content_id")
    private Content content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    public Integer getTitreId() {
        return titreId;
    }

    public void setTitreId(Integer titreId) {
        this.titreId = titreId;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

}