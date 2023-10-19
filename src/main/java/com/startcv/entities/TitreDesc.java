package com.startcv.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "titre_desc")
public class TitreDesc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 250)
    @NotNull
    @Column(name = "titre", nullable = false, length = 250)
    private String titre;

    @Size(max = 700)
    @Column(name = "description", length = 700)
    private String description;

    @Column(name = "competences_id")
    private Integer competencesId;

    @Column(name = "content_id")
    private Integer contentId;

    @Column(name = "images_id")
    private Integer imagesId;

    @Column(name = "sites_id")
    private Integer sitesId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCompetencesId() {
        return competencesId;
    }

    public void setCompetencesId(Integer competencesId) {
        this.competencesId = competencesId;
    }

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public Integer getImagesId() {
        return imagesId;
    }

    public void setImagesId(Integer imagesId) {
        this.imagesId = imagesId;
    }

    public Integer getSitesId() {
        return sitesId;
    }

    public void setSitesId(Integer sitesId) {
        this.sitesId = sitesId;
    }

}