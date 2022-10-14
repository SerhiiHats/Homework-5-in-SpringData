package com.exempl.services;

import com.exempl.entities.Organization;
import com.exempl.repositories.OrganizationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrganizationService {
    final OrganizationRepository organizationRepository;

    public OrganizationService(OrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
    }

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

    public List<Organization> getAllOrganization() {
        return (List<Organization>) organizationRepository.findAll();
    }

    public Optional<Organization> getOrganizationBuId(Long idOrganization) {
        return organizationRepository.findById(idOrganization);
    }

    public void deleteOrganizationById(Long idOrganization) {
        organizationRepository.deleteById(idOrganization);
    }


}
