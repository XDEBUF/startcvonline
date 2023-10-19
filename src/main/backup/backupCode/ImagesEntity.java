package com.startcv.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "images", schema = "public", catalog = "cvonline")
public class ImagesEntity {
    private int idImage;
    private String urlImg;
    private int titreId;
    private Integer contentId;
    private ContentEntity contentByContentId;
    private Collection<TitreDescEntity> titreDescsByIdImage;

    private String titreImg;

    private String descImg;

    @Column(name = "desc_img", length = Integer.MAX_VALUE)
    public String getDescImg() {
        return descImg;
    }

    public void setDescImg(String descImg) {
        this.descImg = descImg;
    }

    @Column(name = "titre_img", length = Integer.MAX_VALUE)
    public String getTitreImg() {
        return titreImg;
    }

    public void setTitreImg(String titreImg) {
        this.titreImg = titreImg;
    }

    protected ImagesEntity(){

    }
    public ImagesEntity(boolean a){
        titreDescsByIdImage = new ArrayList<TitreDescEntity>();
    }
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_image", nullable = false)
    public int getIdImage() {
        return idImage;
    }

    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }

    @Basic
    @Column(name = "url_img", nullable = true, length = -1)
    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
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
        ImagesEntity that = (ImagesEntity) o;
        return idImage == that.idImage && titreId == that.titreId && Objects.equals(urlImg, that.urlImg) && Objects.equals(contentId, that.contentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idImage, urlImg, titreId, contentId);
    }

    @ManyToOne
    @JoinColumn(name = "content_id", referencedColumnName = "content_id")
    public ContentEntity getContentByContentId() {
        return contentByContentId;
    }

    public void setContentByContentId(ContentEntity contentByContentId) {
        this.contentByContentId = contentByContentId;
    }

    @OneToMany(mappedBy = "imagesByImagesId")
    public Collection<TitreDescEntity> getTitreDescsByIdImage() {
        return titreDescsByIdImage;
    }

    public void setTitreDescsByIdImage(Collection<TitreDescEntity> titreDescsByIdImage) {
        this.titreDescsByIdImage = titreDescsByIdImage;
    }
}
