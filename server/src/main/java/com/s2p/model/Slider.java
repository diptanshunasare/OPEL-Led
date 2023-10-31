package com.s2p.model;


import javax.persistence.*;

@Entity
public class Slider {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    public long id ;

    @Column (length = 600)
    public String imgUrl ;

    @Override
    public String toString() {
        return "Slider{" +
                "id=" + id +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
