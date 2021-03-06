/**
 * generated by Xtext 2.18.0
 */
package com.sap.xsk.models.xsodata.xsOData.impl;

import com.sap.xsk.models.xsodata.xsOData.Navigation;
import com.sap.xsk.models.xsodata.xsOData.XsODataPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Navigation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.sap.xsk.models.xsodata.xsOData.impl.NavigationImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link com.sap.xsk.models.xsodata.xsOData.impl.NavigationImpl#getAlias <em>Alias</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NavigationImpl extends MinimalEObjectImpl.Container implements Navigation
{
  /**
   * The default value of the '{@link #getAssociation() <em>Association</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssociation()
   * @generated
   * @ordered
   */
  protected static final String ASSOCIATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAssociation() <em>Association</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssociation()
   * @generated
   * @ordered
   */
  protected String association = ASSOCIATION_EDEFAULT;

  /**
   * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlias()
   * @generated
   * @ordered
   */
  protected static final String ALIAS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlias()
   * @generated
   * @ordered
   */
  protected String alias = ALIAS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NavigationImpl()
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
    return XsODataPackage.Literals.NAVIGATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAssociation()
  {
    return association;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssociation(String newAssociation)
  {
    String oldAssociation = association;
    association = newAssociation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XsODataPackage.NAVIGATION__ASSOCIATION, oldAssociation, association));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAlias()
  {
    return alias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlias(String newAlias)
  {
    String oldAlias = alias;
    alias = newAlias;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XsODataPackage.NAVIGATION__ALIAS, oldAlias, alias));
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
      case XsODataPackage.NAVIGATION__ASSOCIATION:
        return getAssociation();
      case XsODataPackage.NAVIGATION__ALIAS:
        return getAlias();
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
      case XsODataPackage.NAVIGATION__ASSOCIATION:
        setAssociation((String)newValue);
        return;
      case XsODataPackage.NAVIGATION__ALIAS:
        setAlias((String)newValue);
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
      case XsODataPackage.NAVIGATION__ASSOCIATION:
        setAssociation(ASSOCIATION_EDEFAULT);
        return;
      case XsODataPackage.NAVIGATION__ALIAS:
        setAlias(ALIAS_EDEFAULT);
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
      case XsODataPackage.NAVIGATION__ASSOCIATION:
        return ASSOCIATION_EDEFAULT == null ? association != null : !ASSOCIATION_EDEFAULT.equals(association);
      case XsODataPackage.NAVIGATION__ALIAS:
        return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (association: ");
    result.append(association);
    result.append(", alias: ");
    result.append(alias);
    result.append(')');
    return result.toString();
  }

} //NavigationImpl
