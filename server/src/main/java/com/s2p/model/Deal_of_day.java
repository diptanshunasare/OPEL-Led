package com.s2p.model;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Deal_of_day {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id ;

    @Column(length = 60)
    private String title ;

    @Column (length = 5)
    private long actual_price ;

    @Column (length = 5)
    private long offer_price ;

    @Column(length = 5)
    private long offer_percentage ;

    @Column(length = 600)
    private String imageurl;

    @Column(length = 600)
    private String description ;

        @OneToOne
        @JoinColumn(name = "product_id")
        private Product product ;

        @CreationTimestamp
        @Column(name = "createdOn", nullable = false, updatable = false)
        private Date createdOn;

        @UpdateTimestamp
        @Column(name = "modifiedOn")
        private Date modifiedOn;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getActual_price() {
        return actual_price;
    }

    public void setActual_price(long actual_price) {
        this.actual_price = actual_price;
    }

    public long getOffer_price() {
        return offer_price;
    }

    public void setOffer_price(long offer_price) {
        this.offer_price = offer_price;
    }

    public long getOffer_percentage() {
        return offer_percentage;
    }

    public void setOffer_percentage(long offer_percentage) {
        this.offer_percentage = offer_percentage;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    @Override
    public String toString() {
        return "Deal_of_day{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", actual_price=" + actual_price +
                ", offer_price=" + offer_price +
                ", offer_percentage=" + offer_percentage +
                ", imageurl='" + imageurl + '\'' +
                ", product=" + product +
                ", createdOn=" + createdOn +
                ", modifiedOn=" + modifiedOn +
                ", description-" +description+
                '}';

    }

}
