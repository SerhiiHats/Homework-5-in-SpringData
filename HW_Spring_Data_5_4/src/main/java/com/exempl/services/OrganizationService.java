package com.exempl.services;

import com.exempl.entities.Organization;
import com.exempl.repositories.OrganizationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrganizationService implements IOrganizationService {
    final OrganizationRepository organizationRepository;

    public OrganizationService(OrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
    }

    @Override
    public Organization createOrUpdateOrganization(Organization organization) {

        if (organization.getNameOrganization().equals("")) {
            return organization;
        }

        if (organization.getIdOrganization() == null) {
            organization = organizationRepository.save(organization);
            return organization;
        }
        Optional<Organization> tempOrganization = organizationRepository.findById(organization.getIdOrganization());
        if (tempOrganization.isPresent()) {
            Organization newOrganization = tempOrganization.get();
            newOrganization.setNameOrganization(organization.getNameOrganization());
            newOrganization = organizationRepository.save(newOrganization);
            return newOrganization;
        } else {
            organization = organizationRepository.save(organization);
            return organization;
        }

    }

    @Override
    public List<Organization> getAllOrganization() {
        return (List<Organization>) organizationRepository.findAll();
    }

    @Override
    public Optional<Organization> getOrganizationBuId(Long idOrganization) {
        return organizationRepository.findById(idOrganization);
    }

    @Override
    public void deleteOrganizationById(Long idOrganization) {
        organizationRepository.deleteById(idOrganization);
    }

    @Override
    public List<Organization> findOrganizationNameIsWith(String nameOrganization) {
        return organizationRepository.findOrganizationByNameOrganizationStartsWith(nameOrganization);
    }

    @Override
    public List<Organization> findOrganizationNameContaining(String nameOrganization) {
        return organizationRepository.findOrganizationByNameOrganizationContainingIgnoreCase(nameOrganization);
    }


}
