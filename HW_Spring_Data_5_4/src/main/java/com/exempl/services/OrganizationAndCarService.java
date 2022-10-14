package com.exempl.services;

import com.exempl.entities.OrganizationAndCar;
import com.exempl.entities.dto.DTOOrganizationAndCar;
import com.exempl.repositories.OrganizationAndCarRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrganizationAndCarService implements IOrganizationAndCarService {

    OrganizationAndCarRepository organizationAndCarRepository;


    public OrganizationAndCarService(OrganizationAndCarRepository organizationAndCarRepository) {
        this.organizationAndCarRepository = organizationAndCarRepository;
    }

    @Override
    public List<DTOOrganizationAndCar> findFullOrganizationAndCarDto() {
        List<OrganizationAndCar> list = organizationAndCarRepository.getAllFullListOrganizationAndCar();
        return convertorEntityInDto(list);
    }

    @Override
    public List<DTOOrganizationAndCar> findFullOrganizationAndCarDtoStartNameOrganization(String likeName) {
        List<OrganizationAndCar> list = organizationAndCarRepository
                .getAllFullListOrganizationAndCarStatNameOrganization(likeName);
        return convertorEntityInDto(list);
    }

    @Override
    public List<DTOOrganizationAndCar> findFullOrganizationAndCarDtoOrganizationNameContaining(String likeName) {
        List<OrganizationAndCar> list = organizationAndCarRepository
                .getAllFullListOrganizationAndCarOrganizationNameContaining(likeName);
        return convertorEntityInDto(list);
    }

    private List<DTOOrganizationAndCar> convertorEntityInDto(List<OrganizationAndCar> list) {
        List<DTOOrganizationAndCar> listDto = new ArrayList<>();
        for (OrganizationAndCar car : list) {
            DTOOrganizationAndCar dtoEntity = new DTOOrganizationAndCar();
            dtoEntity.setIdCarDto(car.getIdCar());
            dtoEntity.setNameOrganizationDto(car.getNameOrganization());
            dtoEntity.setFullNameCarDto(car.getMarkaCar().concat(" ").concat(car.getModelCar()));
            dtoEntity.setStateNumberCarDto(car.getStateNumberCar());
            dtoEntity.setFuelTypeCarDto(car.getFuelTypeCar());
            dtoEntity.setIdOrganizationDto(car.getIdOrganization());
            listDto.add(dtoEntity);
        }
        return listDto;
    }

}
