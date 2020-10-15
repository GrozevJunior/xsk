package com.sap.xsk.xsaccess.ds.model.privilege;

import java.sql.Timestamp;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sap.xsk.xsaccess.ds.api.IXSKPrivilegeCoreService;

@Table(name= IXSKPrivilegeCoreService.XSK_PRIVILEGES_TABLE_NAME)
public class XSKPrivilegeDefinition {

    @Id
    @Column(name = "NAME", columnDefinition = "VARCHAR", nullable = false, length = 255)
    private String name;

    @Column(name = "DESCRIPTION", columnDefinition = "VARCHAR", nullable = false, length = 255)
    private String description;

    @Column(name = "ACCESS_CREATED_BY", columnDefinition = "VARCHAR", nullable = false, length = 32)
    private String createdBy;

    @Column(name = "ACCESS_CREATED_AT", columnDefinition = "TIMESTAMP", nullable = false)
    private Timestamp createdAt;

    public XSKPrivilegeDefinition() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        XSKPrivilegeDefinition that = (XSKPrivilegeDefinition) o;
        return  name.equals(that.name) &&
                description.equals(that.description) &&
                createdBy.equals(that.createdBy) &&
                createdAt.equals(that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, createdBy, createdAt);
    }
}