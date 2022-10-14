package com.exempl.services;

import com.exempl.entities.OrganizationAndCar;
import com.exempl.entities.dto.DTOOrganizationAndCar;

import java.util.List;

public interface IOrganizationAndCarService {

    List<DTOOrganizationAndCar> findFullOrganizationAndCarDto();

    List<DTOOrganizationAndCar> findFullOrganizationAndCarDtoStartNameOrganization(String likeName);


    public List<DTOOrganizationAndCar> findFullOrganizationAndCarDtoOrganizationNameContaining(String likeName);
}
