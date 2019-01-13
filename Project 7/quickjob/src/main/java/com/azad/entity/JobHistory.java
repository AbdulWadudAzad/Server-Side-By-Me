package com.azad.entity;


import javax.persistence.*;

@Entity
@Table(name ="jobhistory")
public class JobHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "company")
    private String company;
    @Column(name = "jobposition")
    private String jobPosition;
    @Column(name = "salary")
    private Long salary;
    @Column(name = "year_work")
    private String yearWork;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getYearWork() {
        return yearWork;
    }

    public void setYearWork(String yearWork) {
        this.yearWork = yearWork;
    }
}
