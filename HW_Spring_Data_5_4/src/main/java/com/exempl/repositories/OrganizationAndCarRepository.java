package com.exempl.repositories;

import com.exempl.entities.OrganizationAndCar;
import com.exempl.entities.OrganizationAndEmployee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrganizationAndCarRepository extends CrudRepository<OrganizationAndCar, Long> {

    @Query(value = "SELECT c.id_car, o.name_organization, c.marka_car, c.model_car, c.state_number_car, " +
            "c.fuel_type_car, c.id_organization " +
            "FROM car c INNER JOIN organization o on c.id_organization = o.id_organization", nativeQuery = true)
    List<OrganizationAndCar> getAllFullListOrganizationAndCar();
//
    @Query(value = "SELECT c.id_car, o.name_organization, c.marka_car, c.model_car, c.state_number_car, c.fuel_type_car, " +
            "c.id_organization FROM car c INNER JOIN organization o on c.id_organization = o.id_organization " +
            "WHERE o.name_organization LIKE " + "?1%", nativeQuery = true)
    List<OrganizationAndCar> getAllFullListOrganizationAndCarStatNameOrganization(String likeName);

    @Query(value = "SELECT c.id_car, o.name_organization, c.marka_car, c.model_car, c.state_number_car, c.fuel_type_car, " +
            "c.id_organization FROM car c INNER JOIN organization o on c.id_organization = o.id_organization " +
            "WHERE o.name_organization LIKE " + "%?1%", nativeQuery = true)
    List<OrganizationAndCar> getAllFullListOrganizationAndCarOrganizationNameContaining(String likeName);

//    @Query(value = "SELECT e.id_employee, o.name_organization, e.job_title_employee, e.last_name_employee, e.first_name_employee, " +
//            "e.middle_name_employee, e.number_signature_employee, o.id_organization " +
//            "FROM employee e INNER JOIN organization o on e.id_organization = o.id_organization " +
//            "WHERE o.id_organization =?1", nativeQuery = true)
//    List<OrganizationAndEmployee> getAllFullListOrganizationAndCarPoKluchu(long idOrganization);


}
