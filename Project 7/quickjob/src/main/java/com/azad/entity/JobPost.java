package com.azad.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="jobpost")
public class JobPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "jobtitle")
    private String jobTitle;
    @Column(name = "employment_status")
    private String employmentStatus;            // 1. Part-time 2. Full-time
    @Column(name = "vacancy")
    private Long vacancy;
    @Column(name = "edu_req")
    private String eduRecquirment;     //educational recquirment
    @Column(name = "additional_req")
    private String additionalRecquirment;
    @Column(name = "jobResponsibilities")
    private String job_response;
    @Column(name = "salary")
    private Long salary;
    @Column(name = "comp_benefit")
    private String compensationOtherBenefit;
    @Column(name = "published_date", unique = true)
    private Date publishedDate;
    @Column(name = "deadline")
    private Date deadLine;

    //------------Foreign Key----------------------
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "jobCategory_id")
    private JobCategory jobCategory;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public Long getVacancy() {
        return vacancy;
    }

    public void setVacancy(Long vacancy) {
        this.vacancy = vacancy;
    }

    public String getEduRecquirment() {
        return eduRecquirment;
    }

    public void setEduRecquirment(String eduRecquirment) {
        this.eduRecquirment = eduRecquirment;
    }

    public String getAdditionalRecquirment() {
        return additionalRecquirment;
    }

    public void setAdditionalRecquirment(String additionalRecquirment) {
        this.additionalRecquirment = additionalRecquirment;
    }

    public String getJob_response() {
        return job_response;
    }

    public void setJob_response(String job_response) {
        this.job_response = job_response;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getCompensationOtherBenefit() {
        return compensationOtherBenefit;
    }

    public void setCompensationOtherBenefit(String compensationOtherBenefit) {
        this.compensationOtherBenefit = compensationOtherBenefit;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public Date getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(Date deadLine) {
        this.deadLine = deadLine;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public JobCategory getJobCategory() {
        return jobCategory;
    }

    public void setJobCategory(JobCategory jobCategory) {
        this.jobCategory = jobCategory;
    }
}
