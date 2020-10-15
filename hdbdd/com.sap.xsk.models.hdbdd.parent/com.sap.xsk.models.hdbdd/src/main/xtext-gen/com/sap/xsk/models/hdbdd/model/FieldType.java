/**
 * generated by Xtext 2.18.0
 */
package com.sap.xsk.models.hdbdd.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sap.xsk.models.hdbdd.model.FieldType#isKey <em>Key</em>}</li>
 *   <li>{@link com.sap.xsk.models.hdbdd.model.FieldType#getFieldPredefinedType <em>Field Predefined Type</em>}</li>
 * </ul>
 *
 * @see com.sap.xsk.models.hdbdd.model.ModelPackage#getFieldType()
 * @model
 * @generated
 */
public interface FieldType extends Field
{
  /**
   * Returns the value of the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' attribute.
   * @see #setKey(boolean)
   * @see com.sap.xsk.models.hdbdd.model.ModelPackage#getFieldType_Key()
   * @model
   * @generated
   */
  boolean isKey();

  /**
   * Sets the value of the '{@link com.sap.xsk.models.hdbdd.model.FieldType#isKey <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' attribute.
   * @see #isKey()
   * @generated
   */
  void setKey(boolean value);

  /**
   * Returns the value of the '<em><b>Field Predefined Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field Predefined Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field Predefined Type</em>' attribute.
   * @see #setFieldPredefinedType(String)
   * @see com.sap.xsk.models.hdbdd.model.ModelPackage#getFieldType_FieldPredefinedType()
   * @model
   * @generated
   */
  String getFieldPredefinedType();

  /**
   * Sets the value of the '{@link com.sap.xsk.models.hdbdd.model.FieldType#getFieldPredefinedType <em>Field Predefined Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field Predefined Type</em>' attribute.
   * @see #getFieldPredefinedType()
   * @generated
   */
  void setFieldPredefinedType(String value);

} // FieldType
