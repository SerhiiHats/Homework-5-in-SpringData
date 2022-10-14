package com.exempl.entities;

public class Employee {
    private long idEmployee;
    private String lastNameEmployee;
    private String firstNameEmployee;
    private String middleNameEmployee;
    private int numberSignatureEmployee;
    private String jobTitleEmployee;
    private long idOrganization;

    public Employee() {
    }

    public Employee(long idEmployee, String lastNameEmployee, String firstNameEmployee, String middleNameEmployee,
                    int numberSignatureEmployee, String jobTitleEmployee, long idOrganization) {
        this.idEmployee = idEmployee;
        this.lastNameEmployee = lastNameEmployee;
        this.firstNameEmployee = firstNameEmployee;
        this.middleNameEmployee = middleNameEmployee;
        this.numberSignatureEmployee = numberSignatureEmployee;
        this.jobTitleEmployee = jobTitleEmployee;
        this.idOrganization = idOrganization;
    }

    public long getIdEmployee() {
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

    public long getIdOrganization() {
        return idOrganization;
    }

    public void setIdOrganization(long idOrganization) {
        this.idOrganization = idOrganization;
    }

    public Employee(String lastNameEmployee, String firstNameEmployee,
                    String middleNameEmployee, int numberSignatureEmployee, String jobTitleEmployee, long idOrganization) {
        this.lastNameEmployee = lastNameEmployee;
        this.firstNameEmployee = firstNameEmployee;
        this.middleNameEmployee = middleNameEmployee;
        this.numberSignatureEmployee = numberSignatureEmployee;
        this.jobTitleEmployee = jobTitleEmployee;
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
