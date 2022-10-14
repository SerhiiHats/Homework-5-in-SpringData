package com.exempl.entities;

public class Organization {
    private long idOrganization;
    private String nameOrganization;

    public Organization() {
    }

    public Organization(String nameOrganization) {
        this.nameOrganization = nameOrganization;
    }

    public Organization(long idOrganization, String nameOrganization) {
        this.idOrganization = idOrganization;
        this.nameOrganization = nameOrganization;
    }

    public long getIdOrganization() {
        return idOrganization;
    }

    public void setIdOrganization(long idOrganization) {
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

