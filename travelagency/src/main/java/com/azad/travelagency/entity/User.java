package com.azad.travelagency.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "password")
    private String password;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email", unique = true)
    private String email;
    @Column(name = "mobile", unique = true)
    private String mobile;
    @Column(name = "reg_Date", unique = true)
private Date registrationDate;
    @ManyToOne
    @JoinColumn(name = "role_id",nullable = false)
    private Role role;
    @ManyToOne
    @JoinColumn(name = "address_id",nullable = false)
    private Address address;
    @ManyToOne
    @JoinColumn(name = "eduQual_id",nullable = false)
    private EduQualification eduQualification ;
    @ManyToOne
    @JoinColumn(name = "jobHis_id",nullable = true)
    private JobHistory jobHistory;
    @ManyToOne
    @JoinColumn(name = "technical_id",nullable = true)
    private TechnicalTraining technicalTraining;
    @ManyToOne
    @JoinColumn(name = "referances_id",nullable = false)
    private Referances referances;
    @ManyToOne
    @JoinColumn(name = "contactperson_id",nullable = false)
    private EmplyerContactPerson emplyerContactPerson;
    @ManyToOne
    @JoinColumn(name = "project_id",nullable = true)
    private Project project;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public EduQualification getEduQualification() {
        return eduQualification;
    }

    public void setEduQualification(EduQualification eduQualification) {
        this.eduQualification = eduQualification;
    }

    public JobHistory getJobHistory() {
        return jobHistory;
    }

    public void setJobHistory(JobHistory jobHistory) {
        this.jobHistory = jobHistory;
    }

    public TechnicalTraining getTechnicalTraining() {
        return technicalTraining;
    }

    public void setTechnicalTraining(TechnicalTraining technicalTraining) {
        this.technicalTraining = technicalTraining;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Referances getReferances() {
        return referances;
    }

    public void setReferances(Referances referances) {
        this.referances = referances;
    }

    public EmplyerContactPerson getEmplyerContactPerson() {
        return emplyerContactPerson;
    }

    public void setEmplyerContactPerson(EmplyerContactPerson emplyerContactPerson) {
        this.emplyerContactPerson = emplyerContactPerson;
    }
}
