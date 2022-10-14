package com.exempl.services;

import com.exempl.entities.OrganizationAndEmployee;
import com.exempl.entities.dto.DTOOrganizationAndEmployee;
import com.exempl.repositories.OrganizationAndEmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrganizationAndEmployeeService implements IOrganizationAndEmployeeService {

    OrganizationAndEmployeeRepository organizationAndEmployeeRepository;

    public OrganizationAndEmployeeService(OrganizationAndEmployeeRepository organizationAndEmployeeRepository) {
        this.organizationAndEmployeeRepository = organizationAndEmployeeRepository;
    }

    //    public List<OrganizationAndEmployee> findFullListOrganizationAndEmployee(){
//        return organizationAndEmployeeRepository.getAllFullListOrganizationAndEmployee();
//    }
    @Override
    public List<DTOOrganizationAndEmployee> findFullOrganizationAndEmployeeDto() {
        List<OrganizationAndEmployee> list = organizationAndEmployeeRepository.getAllFullListOrganizationAndEmployee();
        return convertorEntityInDto(list);
    }

    @Override
    public List<DTOOrganizationAndEmployee> findFullOrganizationAndEmployeeDtoStartNameOrganization(String likeName) {
        List<OrganizationAndEmployee> list = organizationAndEmployeeRepository
                .getAllFullListOrganizationAndEmployeeStatNameOrganization(likeName);
        return convertorEntityInDto(list);
    }

    @Override
    public List<DTOOrganizationAndEmployee> findFullOrganizationAndEmployeeDtoOrganizationNameContaining(String likeName) {
        List<OrganizationAndEmployee> list = organizationAndEmployeeRepository
                .getAllFullListOrganizationAndEmployeeOrganizationNameContaining(likeName);
        return convertorEntityInDto(list);
    }

    @Override
    public List<DTOOrganizationAndEmployee> findFullOrganizationAndEmployeePoKluchu(long idOrganization) {
        List<OrganizationAndEmployee> list = organizationAndEmployeeRepository
                .getAllFullListOrganizationAndEmployeePoKluchu(idOrganization);
        return convertorEntityInDto(list);
    }

    private List<DTOOrganizationAndEmployee> convertorEntityInDto(List<OrganizationAndEmployee> list) {
        List<DTOOrganizationAndEmployee> listDto = new ArrayList<>();
        for (OrganizationAndEmployee o : list) {
            DTOOrganizationAndEmployee dtoEntity = new DTOOrganizationAndEmployee();
            dtoEntity.setIdEmployeeDto(o.getIdEmployee());
            dtoEntity.setNameOrganizationDto(o.getNameOrganization());
            dtoEntity.setJobTitleEmployeeDto(o.getJobTitleEmployee());
            dtoEntity.setFullNameEmployeeDto(o.getLastNameEmployee().concat(" ").concat(o.getFirstNameEmployee())
                    .concat(" ").concat(o.getMiddleNameEmployee()));
            dtoEntity.setNumberSignatureEmployeeDto(o.getNumberSignatureEmployee());
            dtoEntity.setIdOrganizationDto(o.getIdOrganization());
            listDto.add(dtoEntity);
        }
        return listDto;
    }

}
