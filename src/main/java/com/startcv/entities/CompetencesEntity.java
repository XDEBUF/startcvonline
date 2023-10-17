package com.startcv.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Competences", schema = "public", catalog = "cvonline")
public class CompetencesEntity {
    private int competencesId;
    private int titreId;
    private Integer contentId;
    private ContentEntity contentByContentId;
    private Collection<TitreDescEntity> titreDescsByCompetencesId;
    protected CompetencesEntity(){

    }

    public CompetencesEntity(boolean a){
        titreDescsByCompetencesId = new ArrayList<TitreDescEntity>();
    }
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "competences_id", nullable = false)
    public int getCompetencesId() {
        return competencesId;
    }

    public void setCompetencesId(int competencesId) {
        this.competencesId = competencesId;
    }

    @Basic
    @Column(name = "titre_id", nullable = false)
    public int getTitreId() {
        return titreId;
    }

    public void setTitreId(int titreId) {
        this.titreId = titreId;
    }

    @Basic
    @Column(name = "content_id", nullable = true)
    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompetencesEntity that = (CompetencesEntity) o;
        return competencesId == that.competencesId && titreId == that.titreId && Objects.equals(contentId, that.contentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(competencesId, titreId, contentId);
    }

    @ManyToOne
    @JoinColumn(name = "content_id", referencedColumnName = "content_id")
    public ContentEntity getContentByContentId() {
        return contentByContentId;
    }

    public void setContentByContentId(ContentEntity contentByContentId) {
        this.contentByContentId = contentByContentId;
    }

    @OneToMany(mappedBy = "competencesByCompetencesId")
    public Collection<TitreDescEntity> getTitreDescsByCompetencesId() {
        return titreDescsByCompetencesId;
    }

    public void setTitreDescsByCompetencesId(Collection<TitreDescEntity> titreDescsByCompetencesId) {
        this.titreDescsByCompetencesId = titreDescsByCompetencesId;
    }
}
