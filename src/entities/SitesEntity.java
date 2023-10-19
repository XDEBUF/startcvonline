package com.startcv.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "sites", schema = "public", catalog = "cvonline")
public class SitesEntity {
    private int siteId;
    private String urlSite;
    private int titreId;
    private Integer contentId;
    private ContentEntity contentByContentId;
    private Collection<TitreDescEntity> titreDescsBySiteId;
    protected SitesEntity(){

    }
    public SitesEntity(boolean a){
        titreDescsBySiteId = new ArrayList<TitreDescEntity>();
    }
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "site_id", nullable = false)
    public int getSiteId() {
        return siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    @Basic
    @Column(name = "URL_site", nullable = false, length = -1)
    public String getUrlSite() {
        return urlSite;
    }

    public void setUrlSite(String urlSite) {
        this.urlSite = urlSite;
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
        SitesEntity that = (SitesEntity) o;
        return siteId == that.siteId && titreId == that.titreId && Objects.equals(urlSite, that.urlSite) && Objects.equals(contentId, that.contentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(siteId, urlSite, titreId, contentId);
    }

    @ManyToOne
    @JoinColumn(name = "content_id", referencedColumnName = "content_id")
    public ContentEntity getContentByContentId() {
        return contentByContentId;
    }

    public void setContentByContentId(ContentEntity contentByContentId) {
        this.contentByContentId = contentByContentId;
    }

    @OneToMany(mappedBy = "sitesBySitesId")
    public Collection<TitreDescEntity> getTitreDescsBySiteId() {
        return titreDescsBySiteId;
    }

    public void setTitreDescsBySiteId(Collection<TitreDescEntity> titreDescsBySiteId) {
        this.titreDescsBySiteId = titreDescsBySiteId;
    }
}
