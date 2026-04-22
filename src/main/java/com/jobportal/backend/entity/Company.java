package com.jobportal.backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "companies")
@Getter @Setter
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, unique = true)
    private String name ;

    @Column(name = "logo" , length = 500)
    private String logo ;

    @Column(name = "industry", nullable = false, length = 100)
    private String industry ;

    @Column(name = "size", nullable = false, length = 50)
    private String size;

    @Column(name = "rating", precision = 3, scale = 2, nullable = false)
    private BigDecimal rating;

    @Column(name = "locations", length = 1000)
    private String locations ;

    @Column(name = "founded",nullable = false)
    private Integer founded;

    @Lob
    @Column(name = "description")
    private String description ;

    @Column(name = "employees")
    private Integer employees ;

    @Column(name = "website", length = 500)
    private String website ;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false)
    private Instant created_at ;

    @Column(name = "created_by", nullable = false, length = 20)
    private String created_by ;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private Instant updated_at;

    @Column(name = "updated_by", length = 20)
    private String updated_by;


    // Getters and Setters
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getLogo() {
//        return logo;
//    }
//
//    public void setLogo(String logo) {
//        this.logo = logo;
//    }
//
//    public String getIndustry() {
//        return industry;
//    }
//
//    public void setIndustry(String industry) {
//        this.industry = industry;
//    }
//
//    public String getSize() {
//        return size;
//    }
//
//    public void setSize(String size) {
//        this.size = size;
//    }
//
//    public BigDecimal getRating() {
//        return rating;
//    }
//
//    public void setRating(BigDecimal rating) {
//        this.rating = rating;
//    }
//
//    public String getLocations() {
//        return locations;
//    }
//
//    public void setLocations(String locations) {
//        this.locations = locations;
//    }
//
//    public Integer getFounded() {
//        return founded;
//    }
//
//    public void setFounded(Integer founded) {
//        this.founded = founded;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public Integer getEmployees() {
//        return employees;
//    }
//
//    public void setEmployees(Integer employees) {
//        this.employees = employees;
//    }
//
//    public String getWebsite() {
//        return website;
//    }
//
//    public void setWebsite(String website) {
//        this.website = website;
//    }
//
//    public Instant getCreated_at() {
//        return created_at;
//    }
//
//    public void setCreated_at(Instant created_at) {
//        this.created_at = created_at;
//    }
//
//    public String getCreated_by() {
//        return created_by;
//    }
//
//    public void setCreated_by(String created_by) {
//        this.created_by = created_by;
//    }
//
//    public Instant getUpdated_at() {
//        return updated_at;
//    }
//
//    public void setUpdated_at(Instant updated_at) {
//        this.updated_at = updated_at;
//    }
//
//    public String getUpdated_by() {
//        return updated_by;
//    }
//
//    public void setUpdated_by(String updated_by) {
//        this.updated_by = updated_by;
//    }
}