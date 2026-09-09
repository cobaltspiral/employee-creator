package com.cobaltspiral.employee_creator.contract.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "contracts")
public class Contract {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String contractType;

    @Column
    private LocalDate startDate;

    @Column
    private LocalDate endDate;

    @Column
    private String partTimeOrFullTime;

    public Long getId() {
        return id;
    }

    public String getContractType() {
        return contractType;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getPartTimeOrFullTime() {
        return partTimeOrFullTime;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setPartTimeOrFullTime(String partTimeOrFullTime) {
        this.partTimeOrFullTime = partTimeOrFullTime;
    }

}
