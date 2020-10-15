package com.sap.xsk.hdbti.model;

import java.util.List;

import com.sap.xsk.hdb.ds.model.XSKDataStructureModel;

public class XSKTableImportArtifact  extends XSKDataStructureModel {
    private List<XSKTableImportConfigurationDefinition> importConfigurationDefinition;

    private List<XSKTableImportToCsvRelation> tableImportToCsvRelations;

    public List<XSKTableImportToCsvRelation> getTableImportToCsvRelations() {
        return tableImportToCsvRelations;
    }

    public void setTableImportToCsvRelations(List<XSKTableImportToCsvRelation> tableImportToCsvRelations) {
        this.tableImportToCsvRelations = tableImportToCsvRelations;
    }

    public List<XSKTableImportConfigurationDefinition> getImportConfigurationDefinition() {
        return importConfigurationDefinition;
    }

    public void setImportConfigurationDefinition(List<XSKTableImportConfigurationDefinition> importConfigurationDefinition) {
        this.importConfigurationDefinition = importConfigurationDefinition;
    }
}
