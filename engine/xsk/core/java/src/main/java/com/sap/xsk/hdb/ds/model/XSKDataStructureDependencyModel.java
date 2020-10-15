/**
 * Copyright (c) 2010-2018 SAP
 */
package com.sap.xsk.hdb.ds.model;

/**
 * Dependency element of the DataStructureModel.
 */
public class XSKDataStructureDependencyModel {

	private String name;

	private String type;

	/**
	 * The constructor from fields.
	 *
	 * @param name            the name
	 * @param type            the type
	 */
	public XSKDataStructureDependencyModel(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	/**
	 * Getter for the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter for the name.
	 *
	 * @param name            the name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter for the type.
	 *
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Setter for the type.
	 *
	 * @param type            the type
	 */
	public void setType(String type) {
		this.type = type;
	}

}
