package com.exempl.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OrganizationAndEmployee {

    @Id
    @GeneratedValue
    private Long idEmployee;
    private String nameOrganization;
    private String jobTitleEmployee;
    private String lastNameEmployee;
    private String firstNameEmployee;
    private String middleNameEmployee;
    private int numberSignatureEmployee;
    private Long idOrganization;

    public OrganizationAndEmployee() {
    }

    public OrganizationAndEmployee(Long idEmployee, String nameOrganization, String jobTitleEmployee, String lastNameEmployee, String firstNameEmployee, String middleNameEmployee, int numberSignatureEmployee, Long idOrganization) {
        this.idEmployee = idEmployee;
        this.nameOrganization = nameOrganization;
        this.jobTitleEmployee = jobTitleEmployee;
        this.lastNameEmployee = lastNameEmployee;
        this.firstNameEmployee = firstNameEmployee;
        this.middleNameEmployee = middleNameEmployee;
        this.numberSignatureEmployee = numberSignatureEmployee;
        this.idOrganization = idOrganization;
    }

    public Long getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Long ididEmployee) {
        this.idEmployee = ididEmployee;
    }


    public String getNameOrganization() {
        return nameOrganization;
    }

    public void setNameOrganization(String nameOrganization) {
        this.nameOrganization = nameOrganization;
    }

    public String getJobTitleEmployee() {
        return jobTitleEmployee;
    }

    public void setJobTitleEmployee(String jobTitleEmployee) {
        this.jobTitleEmployee = jobTitleEmployee;
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

    public Long getIdOrganization() {
        return idOrganization;
    }

    public void setIdOrganization(Long idOrganization) {
        this.idOrganization = idOrganization;
    }

    @Override
    public String toString() {
        return "OrganizationAndEmployee{" +
                "id=" + idEmployee +
                ", nameOrganization='" + nameOrganization + '\'' +
                ", jobTitleEmployee='" + jobTitleEmployee + '\'' +
                ", lastNameEmployee='" + lastNameEmployee + '\'' +
                ", firstNameEmployee='" + firstNameEmployee + '\'' +
                ", middleNameEmployee='" + middleNameEmployee + '\'' +
                ", numberSignatureEmployee=" + numberSignatureEmployee +
                ", idOrganization=" + idOrganization +
                '}';
    }
}
