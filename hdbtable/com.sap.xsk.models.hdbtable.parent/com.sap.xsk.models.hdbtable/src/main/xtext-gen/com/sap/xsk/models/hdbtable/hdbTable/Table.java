/**
 * generated by Xtext 2.18.0
 */
package com.sap.xsk.models.hdbtable.hdbTable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sap.xsk.models.hdbtable.hdbTable.Table#isSchema <em>Schema</em>}</li>
 *   <li>{@link com.sap.xsk.models.hdbtable.hdbTable.Table#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link com.sap.xsk.models.hdbtable.hdbTable.Table#isType <em>Type</em>}</li>
 *   <li>{@link com.sap.xsk.models.hdbtable.hdbTable.Table#getTypeValue <em>Type Value</em>}</li>
 *   <li>{@link com.sap.xsk.models.hdbtable.hdbTable.Table#isDescription <em>Description</em>}</li>
 *   <li>{@link com.sap.xsk.models.hdbtable.hdbTable.Table#getDescriptionText <em>Description Text</em>}</li>
 *   <li>{@link com.sap.xsk.models.hdbtable.hdbTable.Table#isColumns <em>Columns</em>}</li>
 *   <li>{@link com.sap.xsk.models.hdbtable.hdbTable.Table#getColumnsValues <em>Columns Values</em>}</li>
 *   <li>{@link com.sap.xsk.models.hdbtable.hdbTable.Table#isPrimaryKeyColumns <em>Primary Key Columns</em>}</li>
 *   <li>{@link com.sap.xsk.models.hdbtable.hdbTable.Table#getTablePrimaryKeyColumnsValues <em>Table Primary Key Columns Values</em>}</li>
 * </ul>
 *
 * @see com.sap.xsk.models.hdbtable.hdbTable.HdbTablePackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject
{
  /**
   * Returns the value of the '<em><b>Schema</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Schema</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Schema</em>' attribute.
   * @see #setSchema(boolean)
   * @see com.sap.xsk.models.hdbtable.hdbTable.HdbTablePackage#getTable_Schema()
   * @model
   * @generated
   */
  boolean isSchema();

  /**
   * Sets the value of the '{@link com.sap.xsk.models.hdbtable.hdbTable.Table#isSchema <em>Schema</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Schema</em>' attribute.
   * @see #isSchema()
   * @generated
   */
  void setSchema(boolean value);

  /**
   * Returns the value of the '<em><b>Schema Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Schema Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Schema Name</em>' attribute.
   * @see #setSchemaName(String)
   * @see com.sap.xsk.models.hdbtable.hdbTable.HdbTablePackage#getTable_SchemaName()
   * @model
   * @generated
   */
  String getSchemaName();

  /**
   * Sets the value of the '{@link com.sap.xsk.models.hdbtable.hdbTable.Table#getSchemaName <em>Schema Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Schema Name</em>' attribute.
   * @see #getSchemaName()
   * @generated
   */
  void setSchemaName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(boolean)
   * @see com.sap.xsk.models.hdbtable.hdbTable.HdbTablePackage#getTable_Type()
   * @model
   * @generated
   */
  boolean isType();

  /**
   * Sets the value of the '{@link com.sap.xsk.models.hdbtable.hdbTable.Table#isType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #isType()
   * @generated
   */
  void setType(boolean value);

  /**
   * Returns the value of the '<em><b>Type Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Value</em>' attribute.
   * @see #setTypeValue(String)
   * @see com.sap.xsk.models.hdbtable.hdbTable.HdbTablePackage#getTable_TypeValue()
   * @model
   * @generated
   */
  String getTypeValue();

  /**
   * Sets the value of the '{@link com.sap.xsk.models.hdbtable.hdbTable.Table#getTypeValue <em>Type Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Value</em>' attribute.
   * @see #getTypeValue()
   * @generated
   */
  void setTypeValue(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(boolean)
   * @see com.sap.xsk.models.hdbtable.hdbTable.HdbTablePackage#getTable_Description()
   * @model
   * @generated
   */
  boolean isDescription();

  /**
   * Sets the value of the '{@link com.sap.xsk.models.hdbtable.hdbTable.Table#isDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #isDescription()
   * @generated
   */
  void setDescription(boolean value);

  /**
   * Returns the value of the '<em><b>Description Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description Text</em>' attribute.
   * @see #setDescriptionText(String)
   * @see com.sap.xsk.models.hdbtable.hdbTable.HdbTablePackage#getTable_DescriptionText()
   * @model
   * @generated
   */
  String getDescriptionText();

  /**
   * Sets the value of the '{@link com.sap.xsk.models.hdbtable.hdbTable.Table#getDescriptionText <em>Description Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description Text</em>' attribute.
   * @see #getDescriptionText()
   * @generated
   */
  void setDescriptionText(String value);

  /**
   * Returns the value of the '<em><b>Columns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Columns</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns</em>' attribute.
   * @see #setColumns(boolean)
   * @see com.sap.xsk.models.hdbtable.hdbTable.HdbTablePackage#getTable_Columns()
   * @model
   * @generated
   */
  boolean isColumns();

  /**
   * Sets the value of the '{@link com.sap.xsk.models.hdbtable.hdbTable.Table#isColumns <em>Columns</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Columns</em>' attribute.
   * @see #isColumns()
   * @generated
   */
  void setColumns(boolean value);

  /**
   * Returns the value of the '<em><b>Columns Values</b></em>' containment reference list.
   * The list contents are of type {@link com.sap.xsk.models.hdbtable.hdbTable.ColumnType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Columns Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns Values</em>' containment reference list.
   * @see com.sap.xsk.models.hdbtable.hdbTable.HdbTablePackage#getTable_ColumnsValues()
   * @model containment="true"
   * @generated
   */
  EList<ColumnType> getColumnsValues();

  /**
   * Returns the value of the '<em><b>Primary Key Columns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primary Key Columns</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primary Key Columns</em>' attribute.
   * @see #setPrimaryKeyColumns(boolean)
   * @see com.sap.xsk.models.hdbtable.hdbTable.HdbTablePackage#getTable_PrimaryKeyColumns()
   * @model
   * @generated
   */
  boolean isPrimaryKeyColumns();

  /**
   * Sets the value of the '{@link com.sap.xsk.models.hdbtable.hdbTable.Table#isPrimaryKeyColumns <em>Primary Key Columns</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primary Key Columns</em>' attribute.
   * @see #isPrimaryKeyColumns()
   * @generated
   */
  void setPrimaryKeyColumns(boolean value);

  /**
   * Returns the value of the '<em><b>Table Primary Key Columns Values</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table Primary Key Columns Values</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table Primary Key Columns Values</em>' attribute list.
   * @see com.sap.xsk.models.hdbtable.hdbTable.HdbTablePackage#getTable_TablePrimaryKeyColumnsValues()
   * @model unique="false"
   * @generated
   */
  EList<String> getTablePrimaryKeyColumnsValues();

} // Table
