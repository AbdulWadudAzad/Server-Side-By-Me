package com.azad.entity;

import javax.persistence.*;

@Entity
@Table(name ="address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user_add")
    private String addre;
    @Column(name = "post_code")
    private String postCode;
    @Column(name = "division")
    private String division;
    @Column(name = "country")
    private String country;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddre() {
        return addre;
    }

    public void setAddre(String addre) {
        this.addre = addre;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
