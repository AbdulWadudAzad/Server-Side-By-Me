package com.azad.travelagency.entity;

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
    @Column(name = "emp_status")
    private String empStatus;            // 1. Part-time 2. Full-time
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
    @Column(name = "category")
    private String category;
    @Column(name = "start_Date", unique = true)
    private Date startDate;
    @Column(name = "end_date")
    private Date endDate;
    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private User user;
    @ManyToOne
    @JoinColumn(name = "jobCategory_id",nullable = false)
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

    public String getEmpStatus() {
        return empStatus;
    }

    public void setEmpStatus(String empStatus) {
        this.empStatus = empStatus;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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
