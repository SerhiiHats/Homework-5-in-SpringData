package com.exempl.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Organization {
    @Id ()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrganization;
    private String nameOrganization;

    public Organization() {
    }

    public Organization(String nameOrganization) {
        this.nameOrganization = nameOrganization;
    }

    public Organization(Long idOrganization, String nameOrganization) {
        this.idOrganization = idOrganization;
        this.nameOrganization = nameOrganization;
    }

    public Long getIdOrganization() {
        return idOrganization;
    }

    public void setIdOrganization(Long idOrganization) {
        this.idOrganization = idOrganization;
    }

    public String getNameOrganization() {
        return nameOrganization;
    }

    public void setNameOrganization(String nameOrganization) {
        this.nameOrganization = nameOrganization;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "idOrganization=" + idOrganization +
                ", nameOrganization='" + nameOrganization + '\'' +
                '}';
    }
}

