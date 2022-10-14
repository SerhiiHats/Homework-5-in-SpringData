package com.exempl.entities;

public class Car {
    private long idCar;
    private String markaCar;
    private String modelCar;
    private String stateNumberCar;
    private int fuelTypeCar;
    private long idOrganization;

    public Car() {
    }

    public Car(long idCar, String markaCar, String modelCar, String stateNumberCar, int fuelTypeCar, long idOrganization) {
        this.idCar = idCar;
        this.markaCar = markaCar;
        this.modelCar = modelCar;
        this.stateNumberCar = stateNumberCar;
        this.fuelTypeCar = fuelTypeCar;
        this.idOrganization = idOrganization;
    }

    public Car(String markaCar, String modelCar, String stateNumberCar, int fuelTypeCar, long idOrganization) {
        this.markaCar = markaCar;
        this.modelCar = modelCar;
        this.stateNumberCar = stateNumberCar;
        this.fuelTypeCar = fuelTypeCar;
        this.idOrganization = idOrganization;
    }

    public long getIdCar() {
        return idCar;
    }

    public void setIdCar(long idCar) {
        this.idCar = idCar;
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

    public long getIdOrganization() {
        return idOrganization;
    }

    public void setIdOrganization(long idOrganization) {
        this.idOrganization = idOrganization;
    }

    @Override
    public String toString() {
        return "Car{" +
                "idCar=" + idCar +
                ", markaCar='" + markaCar + '\'' +
                ", modelCar='" + modelCar + '\'' +
                ", stateNumberCar='" + stateNumberCar + '\'' +
                ", fuelTypeCar=" + fuelTypeCar +
                ", idOrganization=" + idOrganization +
                '}';
    }
}
