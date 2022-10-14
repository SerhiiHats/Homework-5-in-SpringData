package com.exempl.entities.dto;

public class DTOOrganizationAndEmployee {
    private Long idEmployeeDto;
    private String nameOrganizationDto;
    private String jobTitleEmployeeDto;
    private String fullNameEmployeeDto;
    private int numberSignatureEmployeeDto;
    private Long idOrganizationDto;

    public DTOOrganizationAndEmployee() {
    }

    public DTOOrganizationAndEmployee(Long idEmployeeDto, String nameOrganizationDto, String jobTitleEmployeeDto, String fullNameEmployeeDto, int numberSignatureEmployeeDto, Long idOrganizationDto) {
        this.idEmployeeDto = idEmployeeDto;
        this.nameOrganizationDto = nameOrganizationDto;
        this.jobTitleEmployeeDto = jobTitleEmployeeDto;
        this.fullNameEmployeeDto = fullNameEmployeeDto;
        this.numberSignatureEmployeeDto = numberSignatureEmployeeDto;
        this.idOrganizationDto = idOrganizationDto;
    }

    public Long getIdEmployeeDto() {
        return idEmployeeDto;
    }

    public void setIdEmployeeDto(Long idEmployeeDto) {
        this.idEmployeeDto = idEmployeeDto;
    }

    public String getNameOrganizationDto() {
        return nameOrganizationDto;
    }

    public void setNameOrganizationDto(String nameOrganizationDto) {
        this.nameOrganizationDto = nameOrganizationDto;
    }

    public String getJobTitleEmployeeDto() {
        return jobTitleEmployeeDto;
    }

    public void setJobTitleEmployeeDto(String jobTitleEmployeeDto) {
        this.jobTitleEmployeeDto = jobTitleEmployeeDto;
    }

    public String getFullNameEmployeeDto() {
        return fullNameEmployeeDto;
    }

    public void setFullNameEmployeeDto(String fullNameEmployeeDto) {
        this.fullNameEmployeeDto = fullNameEmployeeDto;
    }

    public int getNumberSignatureEmployeeDto() {
        return numberSignatureEmployeeDto;
    }

    public void setNumberSignatureEmployeeDto(int numberSignatureEmployeeDto) {
        this.numberSignatureEmployeeDto = numberSignatureEmployeeDto;
    }

    public Long getIdOrganizationDto() {
        return idOrganizationDto;
    }

    public void setIdOrganizationDto(Long idOrganizationDto) {
        this.idOrganizationDto = idOrganizationDto;
    }

    @Override
    public String toString() {
        return "DTOOrganizationAndEmployee{" +
                "idEmployeeDto=" + idEmployeeDto +
                ", nameOrganizationDto='" + nameOrganizationDto + '\'' +
                ", jobTitleEmployeeDto='" + jobTitleEmployeeDto + '\'' +
                ", fullNameEmployeeDto='" + fullNameEmployeeDto + '\'' +
                ", numberSignatureEmployeeDto=" + numberSignatureEmployeeDto +
                ", idOrganizationDto=" + idOrganizationDto +
                '}';
    }
}
