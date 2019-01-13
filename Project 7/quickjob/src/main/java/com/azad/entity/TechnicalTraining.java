package com.azad.entity;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="technical_training")
public class TechnicalTraining {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "trainingname")
    private String trainingName;
    @Column(name = "instituation")
    private String instituationName;
    @Column(name = "start_date")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date startDate;
    @Column(name = "end_date")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date endDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTrainingName() {
        return trainingName;
    }

    public void setTrainingName(String trainingName) {
        this.trainingName = trainingName;
    }

    public String getInstituationName() {
        return instituationName;
    }

    public void setInstituationName(String instituationName) {
        this.instituationName = instituationName;
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
}
