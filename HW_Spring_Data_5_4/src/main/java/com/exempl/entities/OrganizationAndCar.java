package com.exempl.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OrganizationAndCar {
    @Id
    @GeneratedValue
    private Long idCar;
    private String nameOrganization;
    private String markaCar;
    private String modelCar;
    private String stateNumberCar;
    private int fuelTypeCar;
    private Long idOrganization;

    public OrganizationAndCar() {
    }

    public OrganizationAndCar(Long idCar, String nameOrganization, String markaCar, String modelCar, String stateNumberCar, int fuelTypeCar, Long idOrganization) {
        this.idCar = idCar;
        this.nameOrganization = nameOrganization;
        this.markaCar = markaCar;
        this.modelCar = modelCar;
        this.stateNumberCar = stateNumberCar;
        this.fuelTypeCar = fuelTypeCar;
        this.idOrganization = idOrganization;
    }

    public Long getIdCar() {
        return idCar;
    }

    public void setIdCar(Long idCar) {
        this.idCar = idCar;
    }

    public String getNameOrganization() {
        return nameOrganization;
    }

    public void setNameOrganization(String nameOrganization) {
        this.nameOrganization = nameOrganization;
    }

    public String getMarkaCar() {
        return markaCar;
    }

    public void setMarkaCar(String markaCar) {
        this.markaCar = markaCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getStateNumberCar() {
        return stateNumberCar;
    }

    public void setStateNumberCar(String stateNumberCar) {
        this.stateNumberCar = stateNumberCar;
    }

    public int getFuelTypeCar() {
        return fuelTypeCar;
    }

    public void setFuelTypeCar(int fuelTypeCar) {
        this.fuelTypeCar = fuelTypeCar;
    }

    public Long getIdOrganization() {
        return idOrganization;
    }

    public void setIdOrganization(Long idOrganization) {
        this.idOrganization = idOrganization;
    }

    @Override
    public String toString() {
        return "OrganizationAndCar{" +
                "idCar=" + idCar +
                ", nameOrganization='" + nameOrganization + '\'' +
                ", markaCar='" + markaCar + '\'' +
                ", modelCar='" + modelCar + '\'' +
                ", stateNumberCar='" + stateNumberCar + '\'' +
                ", fuelTypeCar=" + fuelTypeCar +
                ", idOrganization=" + idOrganization +
                '}';
    }
}
