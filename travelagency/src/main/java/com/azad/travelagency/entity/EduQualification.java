package com.azad.travelagency.entity;


import javax.persistence.*;

@Entity
@Table(name ="eduqualification")
public class EduQualification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "examname")
    private String examName;
    @Column(name = "board")
    private String boardName;
    @Column(name = "grade")
    private String grade;
    @Column(name = "passing_year")
    private String pass_Year;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getPass_Year() {
        return pass_Year;
    }

    public void setPass_Year(String pass_Year) {
        this.pass_Year = pass_Year;
    }
}
