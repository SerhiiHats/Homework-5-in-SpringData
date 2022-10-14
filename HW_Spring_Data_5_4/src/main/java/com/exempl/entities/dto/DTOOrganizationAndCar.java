package com.exempl.entities.dto;

public class DTOOrganizationAndCar {

    private Long idCarDto;
    private String nameOrganizationDto;
    private String fullNameCarDto;
    private String stateNumberCarDto;
    private int fuelTypeCarDto;
    private Long idOrganizationDto;

    public DTOOrganizationAndCar() {
    }

    public DTOOrganizationAndCar(Long idCarDto, String nameOrganizationDto, String fullNameCarDto, String stateNumberCarDto, int fuelTypeCarDto, Long idOrganizationDto) {
        this.idCarDto = idCarDto;
        this.nameOrganizationDto = nameOrganizationDto;
        this.fullNameCarDto = fullNameCarDto;
        this.stateNumberCarDto = stateNumberCarDto;
        this.fuelTypeCarDto = fuelTypeCarDto;
        this.idOrganizationDto = idOrganizationDto;
    }

    public Long getIdCarDto() {
        return idCarDto;
    }

    public void setIdCarDto(Long idCarDto) {
        this.idCarDto = idCarDto;
    }

    public String getNameOrganizationDto() {
        return nameOrganizationDto;
    }

    public void setNameOrganizationDto(String nameOrganizationDto) {
        this.nameOrganizationDto = nameOrganizationDto;
    }

    public String getFullNameCarDto() {
        return fullNameCarDto;
    }

    public void setFullNameCarDto(String fullNameCarDto) {
        this.fullNameCarDto = fullNameCarDto;
    }

    public String getStateNumberCarDto() {
        return stateNumberCarDto;
    }

    public void setStateNumberCarDto(String stateNumberCarDto) {
        this.stateNumberCarDto = stateNumberCarDto;
    }

    public int getFuelTypeCarDto() {
        return fuelTypeCarDto;
    }

    public void setFuelTypeCarDto(int fuelTypeCarDto) {
        this.fuelTypeCarDto = fuelTypeCarDto;
    }

    public Long getIdOrganizationDto() {
        return idOrganizationDto;
    }

    public void setIdOrganizationDto(Long idOrganizationDto) {
        this.idOrganizationDto = idOrganizationDto;
    }

    @Override
    public String toString() {
        return "DTOOrganizationAndCar{" +
                "idCarDto=" + idCarDto +
                ", nameOrganizationDto='" + nameOrganizationDto + '\'' +
                ", fullNameCarDto='" + fullNameCarDto + '\'' +
                ", stateNumberCarDto='" + stateNumberCarDto + '\'' +
                ", fuelTypeCarDto=" + fuelTypeCarDto +
                ", idOrganizationDto=" + idOrganizationDto +
                '}';
    }
}
