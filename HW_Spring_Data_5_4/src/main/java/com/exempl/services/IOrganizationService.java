package com.exempl.services;

import com.exempl.entities.Organization;

import java.util.List;
import java.util.Optional;

public interface IOrganizationService {
    Organization createOrUpdateOrganization(Organization organization);

    List<Organization> getAllOrganization();

    Optional<Organization> getOrganizationBuId(Long idOrganization);

    void deleteOrganizationById(Long idOrganization);

    List<Organization> findOrganizationNameIsWith(String nameOrganization);

    List<Organization> findOrganizationNameContaining(String nameOrganization);
}
