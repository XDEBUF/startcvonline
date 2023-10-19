package com.startcv.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "competences")
public class Competence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "competences_id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "titre_id", nullable = false)
    private Integer titreId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "content_id")
    private Content content;

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTitreId() {
        return titreId;
    }

    public void setTitreId(Integer titreId) {
        this.titreId = titreId;
    }

}