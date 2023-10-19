package com.startcv.entities;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "intervals_dates", schema = "public", catalog = "cvonline")
public class IntervalsDatesEntity {
    private Date dateDebut;
    private int intervalsDateId;
    private Date dateFin;
    private Boolean enCours;
    private Integer contentId;
    private ContentEntity contentByIntervalsDateId;

    @Basic
    @Column(name = "date_debut", nullable = false)
    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "intervals_date_id", nullable = false)
    public int getIntervalsDateId() {
        return intervalsDateId;
    }

    public void setIntervalsDateId(int intervalsDateId) {
        this.intervalsDateId = intervalsDateId;
    }

    @Basic
    @Column(name = "date_fin", nullable = true)
    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    @Basic
    @Column(name = "en_cours", nullable = true)
    public Boolean getEnCours() {
        return enCours;
    }

    public void setEnCours(Boolean enCours) {
        this.enCours = enCours;
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
        IntervalsDatesEntity that = (IntervalsDatesEntity) o;
        return intervalsDateId == that.intervalsDateId && Objects.equals(dateDebut, that.dateDebut) && Objects.equals(dateFin, that.dateFin) && Objects.equals(enCours, that.enCours) && Objects.equals(contentId, that.contentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateDebut, intervalsDateId, dateFin, enCours, contentId);
    }

    @OneToOne
    @JoinColumn(name = "intervals_date_id", referencedColumnName = "content_id", nullable = false)
    public ContentEntity getContentByIntervalsDateId() {
        return contentByIntervalsDateId;
    }

    public void setContentByIntervalsDateId(ContentEntity contentByIntervalsDateId) {
        this.contentByIntervalsDateId = contentByIntervalsDateId;
    }
}
