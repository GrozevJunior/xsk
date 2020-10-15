/**
 * generated by Xtext 2.18.0
 */
package com.sap.xsk.models.hdbtable.hdbTable.impl;

import com.sap.xsk.models.hdbtable.hdbTable.ColumnType;
import com.sap.xsk.models.hdbtable.hdbTable.HdbTableFactory;
import com.sap.xsk.models.hdbtable.hdbTable.HdbTableModel;
import com.sap.xsk.models.hdbtable.hdbTable.HdbTablePackage;
import com.sap.xsk.models.hdbtable.hdbTable.Table;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HdbTablePackageImpl extends EPackageImpl implements HdbTablePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hdbTableModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass columnTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.sap.xsk.models.hdbtable.hdbTable.HdbTablePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private HdbTablePackageImpl()
  {
    super(eNS_URI, HdbTableFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link HdbTablePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static HdbTablePackage init()
  {
    if (isInited) return (HdbTablePackage)EPackage.Registry.INSTANCE.getEPackage(HdbTablePackage.eNS_URI);

    // Obtain or create and register package
    HdbTablePackageImpl theHdbTablePackage = (HdbTablePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HdbTablePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HdbTablePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theHdbTablePackage.createPackageContents();

    // Initialize created meta-data
    theHdbTablePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theHdbTablePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(HdbTablePackage.eNS_URI, theHdbTablePackage);
    return theHdbTablePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHdbTableModel()
  {
    return hdbTableModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHdbTableModel_TableElement()
  {
    return (EReference)hdbTableModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColumnType()
  {
    return columnTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumnType_ColumnName()
  {
    return (EAttribute)columnTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumnType_ColumnSqlType()
  {
    return (EAttribute)columnTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumnType_ColumnLength()
  {
    return (EAttribute)columnTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColumnType_ColumnNullable()
  {
    return (EAttribute)columnTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTable()
  {
    return tableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTable_Schema()
  {
    return (EAttribute)tableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTable_SchemaName()
  {
    return (EAttribute)tableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTable_Type()
  {
    return (EAttribute)tableEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTable_TypeValue()
  {
    return (EAttribute)tableEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTable_Description()
  {
    return (EAttribute)tableEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTable_DescriptionText()
  {
    return (EAttribute)tableEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTable_Columns()
  {
    return (EAttribute)tableEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTable_ColumnsValues()
  {
    return (EReference)tableEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTable_PrimaryKeyColumns()
  {
    return (EAttribute)tableEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTable_TablePrimaryKeyColumnsValues()
  {
    return (EAttribute)tableEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HdbTableFactory getHdbTableFactory()
  {
    return (HdbTableFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    hdbTableModelEClass = createEClass(HDB_TABLE_MODEL);
    createEReference(hdbTableModelEClass, HDB_TABLE_MODEL__TABLE_ELEMENT);

    columnTypeEClass = createEClass(COLUMN_TYPE);
    createEAttribute(columnTypeEClass, COLUMN_TYPE__COLUMN_NAME);
    createEAttribute(columnTypeEClass, COLUMN_TYPE__COLUMN_SQL_TYPE);
    createEAttribute(columnTypeEClass, COLUMN_TYPE__COLUMN_LENGTH);
    createEAttribute(columnTypeEClass, COLUMN_TYPE__COLUMN_NULLABLE);

    tableEClass = createEClass(TABLE);
    createEAttribute(tableEClass, TABLE__SCHEMA);
    createEAttribute(tableEClass, TABLE__SCHEMA_NAME);
    createEAttribute(tableEClass, TABLE__TYPE);
    createEAttribute(tableEClass, TABLE__TYPE_VALUE);
    createEAttribute(tableEClass, TABLE__DESCRIPTION);
    createEAttribute(tableEClass, TABLE__DESCRIPTION_TEXT);
    createEAttribute(tableEClass, TABLE__COLUMNS);
    createEReference(tableEClass, TABLE__COLUMNS_VALUES);
    createEAttribute(tableEClass, TABLE__PRIMARY_KEY_COLUMNS);
    createEAttribute(tableEClass, TABLE__TABLE_PRIMARY_KEY_COLUMNS_VALUES);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(hdbTableModelEClass, HdbTableModel.class, "HdbTableModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHdbTableModel_TableElement(), this.getTable(), null, "tableElement", null, 0, 1, HdbTableModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(columnTypeEClass, ColumnType.class, "ColumnType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getColumnType_ColumnName(), ecorePackage.getEString(), "columnName", null, 0, 1, ColumnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColumnType_ColumnSqlType(), ecorePackage.getEString(), "columnSqlType", null, 0, 1, ColumnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColumnType_ColumnLength(), ecorePackage.getEInt(), "columnLength", null, 0, 1, ColumnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColumnType_ColumnNullable(), ecorePackage.getEString(), "columnNullable", null, 0, 1, ColumnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTable_Schema(), ecorePackage.getEBoolean(), "schema", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTable_SchemaName(), ecorePackage.getEString(), "schemaName", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTable_Type(), ecorePackage.getEBoolean(), "type", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTable_TypeValue(), ecorePackage.getEString(), "typeValue", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTable_Description(), ecorePackage.getEBoolean(), "description", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTable_DescriptionText(), ecorePackage.getEString(), "descriptionText", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTable_Columns(), ecorePackage.getEBoolean(), "columns", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTable_ColumnsValues(), this.getColumnType(), null, "columnsValues", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTable_PrimaryKeyColumns(), ecorePackage.getEBoolean(), "primaryKeyColumns", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTable_TablePrimaryKeyColumnsValues(), ecorePackage.getEString(), "tablePrimaryKeyColumnsValues", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //HdbTablePackageImpl
