package com.startcv.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "sites")
public class Site {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "site_id", nullable = false)
    private Integer id;

    @Size(max = 200)
    @NotNull
    @Column(name = "url_site", nullable = false, length = 200)
    private String urlSite;

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

    public String getUrlSite() {
        return urlSite;
    }

    public void setUrlSite(String urlSite) {
        this.urlSite = urlSite;
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