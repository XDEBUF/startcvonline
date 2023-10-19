package com.startcv.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "titre_desc", schema = "public", catalog = "cvonline")
public class TitreDescEntity {
    private String titre;
    private int id;
    private String description;
    private Integer competencesId;
    private Integer contentId;
    private Integer imagesId;
    private Integer sitesId;
    private CompetencesEntity competencesByCompetencesId;
    private ContentEntity contentByContentId;
    private ImagesEntity imagesByImagesId;
    private SitesEntity sitesBySitesId;

    @Basic
    @Column(name = "titre", nullable = false, length = -1)
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "description", nullable = true, length = -1)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "competences_id", nullable = true)
    public Integer getCompetencesId() {
        return competencesId;
    }

    public void setCompetencesId(Integer competencesId) {
        this.competencesId = competencesId;
    }

    @Basic
    @Column(name = "content_id", nullable = true)
    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    @Basic
    @Column(name = "images_id", nullable = true)
    public Integer getImagesId() {
        return imagesId;
    }

    public void setImagesId(Integer imagesId) {
        this.imagesId = imagesId;
    }

    @Basic
    @Column(name = "sites_id", nullable = true)
    public Integer getSitesId() {
        return sitesId;
    }

    public void setSitesId(Integer sitesId) {
        this.sitesId = sitesId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TitreDescEntity that = (TitreDescEntity) o;
        return id == that.id && Objects.equals(titre, that.titre) && Objects.equals(description, that.description) && Objects.equals(competencesId, that.competencesId) && Objects.equals(contentId, that.contentId) && Objects.equals(imagesId, that.imagesId) && Objects.equals(sitesId, that.sitesId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titre, id, description, competencesId, contentId, imagesId, sitesId);
    }

    @ManyToOne
    @JoinColumn(name = "competences_id", referencedColumnName = "competences_id")
    public CompetencesEntity getCompetencesByCompetencesId() {
        return competencesByCompetencesId;
    }

    public void setCompetencesByCompetencesId(CompetencesEntity competencesByCompetencesId) {
        this.competencesByCompetencesId = competencesByCompetencesId;
    }

    @ManyToOne
    @JoinColumn(name = "content_id", referencedColumnName = "content_id")
    public ContentEntity getContentByContentId() {
        return contentByContentId;
    }

    public void setContentByContentId(ContentEntity contentByContentId) {
        this.contentByContentId = contentByContentId;
    }

    @ManyToOne
    @JoinColumn(name = "images_id", referencedColumnName = "id_image")
    public ImagesEntity getImagesByImagesId() {
        return imagesByImagesId;
    }

    public void setImagesByImagesId(ImagesEntity imagesByImagesId) {
        this.imagesByImagesId = imagesByImagesId;
    }

    @ManyToOne
    @JoinColumn(name = "sites_id", referencedColumnName = "site_id")
    public SitesEntity getSitesBySitesId() {
        return sitesBySitesId;
    }

    public void setSitesBySitesId(SitesEntity sitesBySitesId) {
        this.sitesBySitesId = sitesBySitesId;
    }
}
