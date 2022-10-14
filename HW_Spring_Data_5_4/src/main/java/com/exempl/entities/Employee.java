package com.exempl.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmployee;
    private String lastNameEmployee;
    private String firstNameEmployee;
    private String middleNameEmployee;
    private int numberSignatureEmployee;
    private String jobTitleEmployee;
    private Long idOrganization;

    public Employee() {
    }

    public Employee(Long idEmployee, String lastNameEmployee, String firstNameEmployee, String middleNameEmployee,
                    int numberSignatureEmployee, String jobTitleEmployee, Long idOrganization) {
        this.idEmployee = idEmployee;
        this.lastNameEmployee = lastNameEmployee;
        this.firstNameEmployee = firstNameEmployee;
        this.middleNameEmployee = middleNameEmployee;
        this.numberSignatureEmployee = numberSignatureEmployee;
        this.jobTitleEmployee = jobTitleEmployee;
        this.idOrganization = idOrganization;
    }

    public Employee(String lastNameEmployee, String firstNameEmployee,
                    String middleNameEmployee, int numberSignatureEmployee, String jobTitleEmployee, Long idOrganization) {
        this.lastNameEmployee = lastNameEmployee;
        this.firstNameEmployee = firstNameEmployee;
        this.middleNameEmployee = middleNameEmployee;
        this.numberSignatureEmployee = numberSignatureEmployee;
        this.jobTitleEmployee = jobTitleEmployee;
        this.idOrganization = idOrganization;
    }

    public Long getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(long idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getLastNameEmployee() {
        return lastNameEmployee;
    }

    public void setLastNameEmployee(String lastNameEmployee) {
        this.lastNameEmployee = lastNameEmployee;
    }

    public String getFirstNameEmployee() {
        return firstNameEmployee;
    }

    public void setFirstNameEmployee(String firstNameEmployee) {
        this.firstNameEmployee = firstNameEmployee;
    }

    public String getMiddleNameEmployee() {
        return middleNameEmployee;
    }

    public void setMiddleNameEmployee(String middleNameEmployee) {
        this.middleNameEmployee = middleNameEmployee;
    }

    public int getNumberSignatureEmployee() {
        return numberSignatureEmployee;
    }

    public void setNumberSignatureEmployee(int numberSignatureEmployee) {
        this.numberSignatureEmployee = numberSignatureEmployee;
    }

    public String getJobTitleEmployee() {
        return jobTitleEmployee;
    }

    public void setJobTitleEmployee(String jobTitleEmployee) {
        this.jobTitleEmployee = jobTitleEmployee;
    }

    public Long getIdOrganization() {
        return idOrganization;
    }

    public void setIdOrganization(Long idOrganization) {
        this.idOrganization = idOrganization;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idEmployee=" + idEmployee +
                ", lastNameEmployee='" + lastNameEmployee + '\'' +
                ", firstNameEmployee='" + firstNameEmployee + '\'' +
                ", middleNameEmployee='" + middleNameEmployee + '\'' +
                ", numberSignatureEmployee=" + numberSignatureEmployee +
                ", jobTitleEmployee='" + jobTitleEmployee + '\'' +
                ", idOrganization=" + idOrganization +
                '}';
    }
}
