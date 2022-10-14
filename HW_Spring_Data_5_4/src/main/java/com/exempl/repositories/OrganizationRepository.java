package com.exempl.repositories;

import com.exempl.entities.Organization;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrganizationRepository extends CrudRepository<Organization, Long> {

    List<Organization> findOrganizationByNameOrganizationStartsWith(String nameOrganization);

    List<Organization> findOrganizationByNameOrganizationContainingIgnoreCase(String nameOrganization);


}
