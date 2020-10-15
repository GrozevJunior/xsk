/**
 * generated by Xtext 2.18.0
 */
package com.sap.xsk.models.hdbdd.model.impl;

import com.sap.xsk.models.hdbdd.model.ModelPackage;
import com.sap.xsk.models.hdbdd.model.TypeDefinition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.sap.xsk.models.hdbdd.model.impl.TypeDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.sap.xsk.models.hdbdd.model.impl.TypeDefinitionImpl#getFieldType <em>Field Type</em>}</li>
 *   <li>{@link com.sap.xsk.models.hdbdd.model.impl.TypeDefinitionImpl#getFieldLength <em>Field Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeDefinitionImpl extends MinimalEObjectImpl.Container implements TypeDefinition
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getFieldType() <em>Field Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldType()
   * @generated
   * @ordered
   */
  protected static final String FIELD_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFieldType() <em>Field Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldType()
   * @generated
   * @ordered
   */
  protected String fieldType = FIELD_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getFieldLength() <em>Field Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldLength()
   * @generated
   * @ordered
   */
  protected static final int FIELD_LENGTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getFieldLength() <em>Field Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldLength()
   * @generated
   * @ordered
   */
  protected int fieldLength = FIELD_LENGTH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeDefinitionImpl()
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
    return ModelPackage.Literals.TYPE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TYPE_DEFINITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFieldType()
  {
    return fieldType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFieldType(String newFieldType)
  {
    String oldFieldType = fieldType;
    fieldType = newFieldType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TYPE_DEFINITION__FIELD_TYPE, oldFieldType, fieldType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getFieldLength()
  {
    return fieldLength;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFieldLength(int newFieldLength)
  {
    int oldFieldLength = fieldLength;
    fieldLength = newFieldLength;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TYPE_DEFINITION__FIELD_LENGTH, oldFieldLength, fieldLength));
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
      case ModelPackage.TYPE_DEFINITION__NAME:
        return getName();
      case ModelPackage.TYPE_DEFINITION__FIELD_TYPE:
        return getFieldType();
      case ModelPackage.TYPE_DEFINITION__FIELD_LENGTH:
        return getFieldLength();
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
      case ModelPackage.TYPE_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case ModelPackage.TYPE_DEFINITION__FIELD_TYPE:
        setFieldType((String)newValue);
        return;
      case ModelPackage.TYPE_DEFINITION__FIELD_LENGTH:
        setFieldLength((Integer)newValue);
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
      case ModelPackage.TYPE_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ModelPackage.TYPE_DEFINITION__FIELD_TYPE:
        setFieldType(FIELD_TYPE_EDEFAULT);
        return;
      case ModelPackage.TYPE_DEFINITION__FIELD_LENGTH:
        setFieldLength(FIELD_LENGTH_EDEFAULT);
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
      case ModelPackage.TYPE_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ModelPackage.TYPE_DEFINITION__FIELD_TYPE:
        return FIELD_TYPE_EDEFAULT == null ? fieldType != null : !FIELD_TYPE_EDEFAULT.equals(fieldType);
      case ModelPackage.TYPE_DEFINITION__FIELD_LENGTH:
        return fieldLength != FIELD_LENGTH_EDEFAULT;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", fieldType: ");
    result.append(fieldType);
    result.append(", fieldLength: ");
    result.append(fieldLength);
    result.append(')');
    return result.toString();
  }

} //TypeDefinitionImpl
