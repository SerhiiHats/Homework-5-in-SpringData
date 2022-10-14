package com.exempl.services;

import com.exempl.entities.OrganizationAndEmployee;
import com.exempl.entities.dto.DTOOrganizationAndEmployee;

import java.util.List;

public interface IOrganizationAndEmployeeService {

    List<DTOOrganizationAndEmployee> findFullOrganizationAndEmployeeDto();

    List<DTOOrganizationAndEmployee> findFullOrganizationAndEmployeeDtoStartNameOrganization(String likeName);

    List<DTOOrganizationAndEmployee> findFullOrganizationAndEmployeeDtoOrganizationNameContaining(String likeName);

    List<DTOOrganizationAndEmployee> findFullOrganizationAndEmployeePoKluchu(long idOrganization);
}
