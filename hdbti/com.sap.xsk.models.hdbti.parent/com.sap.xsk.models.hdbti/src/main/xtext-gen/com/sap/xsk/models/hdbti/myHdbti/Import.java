/**
 * generated by Xtext 2.18.0
 */
package com.sap.xsk.models.hdbti.myHdbti;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sap.xsk.models.hdbti.myHdbti.Import#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see com.sap.xsk.models.hdbti.myHdbti.MyHdbtiPackage#getImport()
 * @model
 * @generated
 */
public interface Import extends EObject
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link com.sap.xsk.models.hdbti.myHdbti.ImportConfig}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see com.sap.xsk.models.hdbti.myHdbti.MyHdbtiPackage#getImport_Values()
   * @model containment="true"
   * @generated
   */
  EList<ImportConfig> getValues();

} // Import
