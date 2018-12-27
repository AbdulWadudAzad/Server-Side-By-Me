package com.azad.travelagency.entity;

import javax.persistence.*;

@Entity
@Table(name ="referances")
public class Referances {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "referance_name")
    private String referanceName;
    @Column(name = "company")
    private String company;
    @Column(name = "position")
    private Long position;
    @Column(name = "email")
    private String email;
    @Column(name = "mobile")
    private String address;
    @Column(name = "address")
    private Long mobile;
    @Column(name = "relationship")
    private String relationship;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReferanceName() {
        return referanceName;
    }

    public void setReferanceName(String referanceName) {
        this.referanceName = referanceName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Long getPosition() {
        return position;
    }

    public void setPosition(Long position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }
}
