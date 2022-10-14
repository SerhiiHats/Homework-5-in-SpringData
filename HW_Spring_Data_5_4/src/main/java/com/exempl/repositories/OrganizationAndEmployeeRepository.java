package com.exempl.repositories;

import com.exempl.entities.OrganizationAndEmployee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrganizationAndEmployeeRepository extends CrudRepository<OrganizationAndEmployee, Long> {

    @Query(value = "SELECT e.id_employee, o.name_organization, e.job_title_employee, e.last_name_employee, e.first_name_employee, " +
            "e.middle_name_employee, e.number_signature_employee, o.id_organization " +
            "FROM employee e INNER JOIN organization o on e.id_organization = o.id_organization", nativeQuery = true)
    List<OrganizationAndEmployee> getAllFullListOrganizationAndEmployee();

    @Query(value = "SELECT e.id_employee, o.name_organization, e.job_title_employee, e.last_name_employee, e.first_name_employee, " +
            "e.middle_name_employee, e.number_signature_employee, o.id_organization " +
            "FROM employee e INNER JOIN organization o on e.id_organization = o.id_organization " +
            "WHERE o.name_organization LIKE " + "?1%", nativeQuery = true)
    List<OrganizationAndEmployee> getAllFullListOrganizationAndEmployeeStatNameOrganization(String likeName);

    @Query(value = "SELECT e.id_employee, o.name_organization, e.job_title_employee, e.last_name_employee, e.first_name_employee, " +
            "e.middle_name_employee, e.number_signature_employee, o.id_organization " +
            "FROM employee e INNER JOIN organization o on e.id_organization = o.id_organization " +
            "WHERE o.name_organization LIKE " + "%?1%", nativeQuery = true)
    List<OrganizationAndEmployee> getAllFullListOrganizationAndEmployeeOrganizationNameContaining(String likeName);

    @Query(value = "SELECT e.id_employee, o.name_organization, e.job_title_employee, e.last_name_employee, e.first_name_employee, " +
            "e.middle_name_employee, e.number_signature_employee, o.id_organization " +
            "FROM employee e INNER JOIN organization o on e.id_organization = o.id_organization " +
            "WHERE o.id_organization =?1", nativeQuery = true)
    List<OrganizationAndEmployee> getAllFullListOrganizationAndEmployeePoKluchu(long idOrganization);


}
