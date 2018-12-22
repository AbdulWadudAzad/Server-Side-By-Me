package com.azad.travelagency.entity;


import javax.persistence.*;

@Entity
@Table(name = "package")
public class Package {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "distination")
    private String distination;
    @Column(name = "amount")
    private Long amount;
}
