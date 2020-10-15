/**
 * generated by Xtext 2.18.0
 */
package com.sap.xsk.models.hdbtable.hdbTable.impl;

import com.sap.xsk.models.hdbtable.hdbTable.HdbTableModel;
import com.sap.xsk.models.hdbtable.hdbTable.HdbTablePackage;
import com.sap.xsk.models.hdbtable.hdbTable.Table;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.sap.xsk.models.hdbtable.hdbTable.impl.HdbTableModelImpl#getTableElement <em>Table Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HdbTableModelImpl extends MinimalEObjectImpl.Container implements HdbTableModel
{
  /**
   * The cached value of the '{@link #getTableElement() <em>Table Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTableElement()
   * @generated
   * @ordered
   */
  protected Table tableElement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HdbTableModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return HdbTablePackage.Literals.HDB_TABLE_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Table getTableElement()
  {
    return tableElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTableElement(Table newTableElement, NotificationChain msgs)
  {
    Table oldTableElement = tableElement;
    tableElement = newTableElement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HdbTablePackage.HDB_TABLE_MODEL__TABLE_ELEMENT, oldTableElement, newTableElement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTableElement(Table newTableElement)
  {
    if (newTableElement != tableElement)
    {
      NotificationChain msgs = null;
      if (tableElement != null)
        msgs = ((InternalEObject)tableElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HdbTablePackage.HDB_TABLE_MODEL__TABLE_ELEMENT, null, msgs);
      if (newTableElement != null)
        msgs = ((InternalEObject)newTableElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HdbTablePackage.HDB_TABLE_MODEL__TABLE_ELEMENT, null, msgs);
      msgs = basicSetTableElement(newTableElement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HdbTablePackage.HDB_TABLE_MODEL__TABLE_ELEMENT, newTableElement, newTableElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case HdbTablePackage.HDB_TABLE_MODEL__TABLE_ELEMENT:
        return basicSetTableElement(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case HdbTablePackage.HDB_TABLE_MODEL__TABLE_ELEMENT:
        return getTableElement();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case HdbTablePackage.HDB_TABLE_MODEL__TABLE_ELEMENT:
        setTableElement((Table)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case HdbTablePackage.HDB_TABLE_MODEL__TABLE_ELEMENT:
        setTableElement((Table)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case HdbTablePackage.HDB_TABLE_MODEL__TABLE_ELEMENT:
        return tableElement != null;
    }
    return super.eIsSet(featureID);
  }

} //HdbTableModelImpl
