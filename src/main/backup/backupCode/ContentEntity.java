package com.startcv.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.*;

@Entity
@Table(name = "content", schema = "public", catalog = "cvonline")
public class ContentEntity {

    private int contentId;
    private Boolean publiable;
    private String category;
    private Collection<CompetencesEntity> competencesByContentId;
    private Collection<ImagesEntity> imagesByContentId;
    private IntervalsDatesEntity intervalsDatesByContentId;
    private Collection<SitesEntity> sitesByContentId;
    private Collection<TitreDescEntity> titreDescsByContentId;

    private String titreCt;

    private String descCt;

    private Set<Competence> competences = new LinkedHashSet<>();

    private Set<Image> images = new LinkedHashSet<>();

    private IntervalsDate intervalsDate;

    private Set<Site> sites = new LinkedHashSet<>();

    @OneToMany(mappedBy = "content")
    public Set<Site> getSites() {
        return sites;
    }

    public void setSites(Set<Site> sites) {
        this.sites = sites;
    }

    @OneToOne(mappedBy = "contentEntity")
    public IntervalsDate getIntervalsDate() {
        return intervalsDate;
    }

    public void setIntervalsDate(IntervalsDate intervalsDate) {
        this.intervalsDate = intervalsDate;
    }

    @OneToMany(mappedBy = "content")
    public Set<Image> getImages() {
        return images;
    }

    public void setImages(Set<Image> images) {
        this.images = images;
    }

    @OneToMany(mappedBy = "content")
    public Set<Competence> getCompetences() {
        return competences;
    }

    public void setCompetences(Set<Competence> competences) {
        this.competences = competences;
    }

    @Column(name = "desc_ct", length = Integer.MAX_VALUE)
    public String getDescCt() {
        return descCt;
    }

    public void setDescCt(String descCt) {
        this.descCt = descCt;
    }

    @NotNull
    @Column(name = "titre_ct", nullable = false, length = Integer.MAX_VALUE)
    public String getTitreCt() {
        return titreCt;
    }

    public void setTitreCt(String titreCt) {
        this.titreCt = titreCt;
    }

    protected ContentEntity(){}
    public ContentEntity(boolean a){
        competencesByContentId = new ArrayList<CompetencesEntity>();
        imagesByContentId = new ArrayList<ImagesEntity>();
        sitesByContentId = new ArrayList<SitesEntity>();
        titreDescsByContentId = new ArrayList<TitreDescEntity>();
    }
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "content_id", nullable = false)
    public int getContentId() {
        return contentId;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    @Basic
    @Column(name = "publiable", nullable = true)
    public Boolean getPubliable() {
        return publiable;
    }

    public void setPubliable(Boolean publiable) {
        this.publiable = publiable;
    }

    @Basic
    @Column(name = "category", nullable = true, length = -1)
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContentEntity that = (ContentEntity) o;
        return contentId == that.contentId && Objects.equals(publiable, that.publiable) && Objects.equals(category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentId, publiable, category);
    }

    @OneToMany(mappedBy = "contentByContentId")
    public Collection<CompetencesEntity> getCompetencesByContentId() {
        return competencesByContentId;
    }

    public void setCompetencesByContentId(Collection<CompetencesEntity> competencesByContentId) {
        this.competencesByContentId = competencesByContentId;
    }

    @OneToMany(mappedBy = "contentByContentId")
    public Collection<ImagesEntity> getImagesByContentId() {
        return imagesByContentId;
    }

    public void setImagesByContentId(Collection<ImagesEntity> imagesByContentId) {
        this.imagesByContentId = imagesByContentId;
    }

    @OneToOne(mappedBy = "contentByIntervalsDateId")
    public IntervalsDatesEntity getIntervalsDatesByContentId() {
        return intervalsDatesByContentId;
    }

    public void setIntervalsDatesByContentId(IntervalsDatesEntity intervalsDatesByContentId) {
        this.intervalsDatesByContentId = intervalsDatesByContentId;
    }

    @OneToMany(mappedBy = "contentByContentId")
    public Collection<SitesEntity> getSitesByContentId() {
        return sitesByContentId;
    }

    public void setSitesByContentId(Collection<SitesEntity> sitesByContentId) {
        this.sitesByContentId = sitesByContentId;
    }

    @OneToMany(mappedBy = "contentByContentId")
    public Collection<TitreDescEntity> getTitreDescsByContentId() {
        return titreDescsByContentId;
    }

    public void setTitreDescsByContentId(Collection<TitreDescEntity> titreDescsByContentId) {
        this.titreDescsByContentId = titreDescsByContentId;
    }
}
