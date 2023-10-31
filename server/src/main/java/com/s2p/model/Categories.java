package com.s2p.model;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

@Entity
@Table
public class Categories {
    @Id
    private long id ;

    @Column(nullable = false , length = 255)
    private String parentId ;

    @Column(nullable = false , length = 50)
    private String name ;

    @Column(nullable = false , length = 5000)
    private String slug ;

    @JoinTable(name="category_product", joinColumns = {
            @JoinColumn(name="categories_id")
    },
            inverseJoinColumns = {
                    @JoinColumn(name="product_id")
            })
    @ElementCollection
    Set<Categories> categories = new HashSet<Categories>();


    private boolean isDelete ;

    private Date createdOn ;

    private String createdBy ;

    private Date modifiedOn ;

    private String modifiedBy ;

    public Categories() {
    }

    public Categories(Categories categories) {

    }

    public long getId() {

        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "id='" + id + '\'' +
                ", parentId='" + parentId + '\'' +
                ", name='" + name + '\'' +
                ", slug='" + slug + '\'' +
                ", isDelete=" + isDelete +
                ", createdOn=" + createdOn +
                ", createdBy='" + createdBy + '\'' +
                ", modifiedOn=" + modifiedOn +
                ", modifiedBy='" + modifiedBy + '\'' +
                '}';
    }
}
