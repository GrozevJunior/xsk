/**
 * generated by Xtext 2.18.0
 */
package com.sap.xsk.models.hdbti.myHdbti.impl;

import com.sap.xsk.models.hdbti.myHdbti.GroupType;
import com.sap.xsk.models.hdbti.myHdbti.HdbdtiModel;
import com.sap.xsk.models.hdbti.myHdbti.Import;
import com.sap.xsk.models.hdbti.myHdbti.ImportConfig;
import com.sap.xsk.models.hdbti.myHdbti.MyHdbtiFactory;
import com.sap.xsk.models.hdbti.myHdbti.MyHdbtiPackage;

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
public class MyHdbtiPackageImpl extends EPackageImpl implements MyHdbtiPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hdbdtiModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass groupTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importConfigEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

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
   * @see com.sap.xsk.models.hdbti.myHdbti.MyHdbtiPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MyHdbtiPackageImpl()
  {
    super(eNS_URI, MyHdbtiFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link MyHdbtiPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MyHdbtiPackage init()
  {
    if (isInited) return (MyHdbtiPackage)EPackage.Registry.INSTANCE.getEPackage(MyHdbtiPackage.eNS_URI);

    // Obtain or create and register package
    MyHdbtiPackageImpl theMyHdbtiPackage = (MyHdbtiPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MyHdbtiPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MyHdbtiPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theMyHdbtiPackage.createPackageContents();

    // Initialize created meta-data
    theMyHdbtiPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMyHdbtiPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MyHdbtiPackage.eNS_URI, theMyHdbtiPackage);
    return theMyHdbtiPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHdbdtiModel()
  {
    return hdbdtiModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHdbdtiModel_ImportElement()
  {
    return (EReference)hdbdtiModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGroupType()
  {
    return groupTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGroupType_Value()
  {
    return (EAttribute)groupTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImportConfig()
  {
    return importConfigEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportConfig_Table()
  {
    return (EAttribute)importConfigEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportConfig_TableValue()
  {
    return (EAttribute)importConfigEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportConfig_Schema()
  {
    return (EAttribute)importConfigEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportConfig_SchemaValue()
  {
    return (EAttribute)importConfigEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportConfig_File()
  {
    return (EAttribute)importConfigEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportConfig_FileValue()
  {
    return (EAttribute)importConfigEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportConfig_DelimField()
  {
    return (EAttribute)importConfigEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportConfig_DelimFieldValue()
  {
    return (EAttribute)importConfigEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportConfig_Header()
  {
    return (EAttribute)importConfigEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportConfig_HeaderValue()
  {
    return (EAttribute)importConfigEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportConfig_Keys()
  {
    return (EAttribute)importConfigEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImportConfig_HeaderValues()
  {
    return (EReference)importConfigEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportConfig_DelimEnclosing()
  {
    return (EAttribute)importConfigEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportConfig_DelimEnclosingValue()
  {
    return (EAttribute)importConfigEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportConfig_DistinguishEmptyFromNull()
  {
    return (EAttribute)importConfigEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportConfig_DistinguishEmptyFromNullValue()
  {
    return (EAttribute)importConfigEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportConfig_UseHeaderNames()
  {
    return (EAttribute)importConfigEClass.getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportConfig_UseHeaderNamesValue()
  {
    return (EAttribute)importConfigEClass.getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImport_Values()
  {
    return (EReference)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyHdbtiFactory getMyHdbtiFactory()
  {
    return (MyHdbtiFactory)getEFactoryInstance();
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
    hdbdtiModelEClass = createEClass(HDBDTI_MODEL);
    createEReference(hdbdtiModelEClass, HDBDTI_MODEL__IMPORT_ELEMENT);

    groupTypeEClass = createEClass(GROUP_TYPE);
    createEAttribute(groupTypeEClass, GROUP_TYPE__VALUE);

    importConfigEClass = createEClass(IMPORT_CONFIG);
    createEAttribute(importConfigEClass, IMPORT_CONFIG__TABLE);
    createEAttribute(importConfigEClass, IMPORT_CONFIG__TABLE_VALUE);
    createEAttribute(importConfigEClass, IMPORT_CONFIG__SCHEMA);
    createEAttribute(importConfigEClass, IMPORT_CONFIG__SCHEMA_VALUE);
    createEAttribute(importConfigEClass, IMPORT_CONFIG__FILE);
    createEAttribute(importConfigEClass, IMPORT_CONFIG__FILE_VALUE);
    createEAttribute(importConfigEClass, IMPORT_CONFIG__DELIM_FIELD);
    createEAttribute(importConfigEClass, IMPORT_CONFIG__DELIM_FIELD_VALUE);
    createEAttribute(importConfigEClass, IMPORT_CONFIG__HEADER);
    createEAttribute(importConfigEClass, IMPORT_CONFIG__HEADER_VALUE);
    createEAttribute(importConfigEClass, IMPORT_CONFIG__KEYS);
    createEReference(importConfigEClass, IMPORT_CONFIG__HEADER_VALUES);
    createEAttribute(importConfigEClass, IMPORT_CONFIG__DELIM_ENCLOSING);
    createEAttribute(importConfigEClass, IMPORT_CONFIG__DELIM_ENCLOSING_VALUE);
    createEAttribute(importConfigEClass, IMPORT_CONFIG__DISTINGUISH_EMPTY_FROM_NULL);
    createEAttribute(importConfigEClass, IMPORT_CONFIG__DISTINGUISH_EMPTY_FROM_NULL_VALUE);
    createEAttribute(importConfigEClass, IMPORT_CONFIG__USE_HEADER_NAMES);
    createEAttribute(importConfigEClass, IMPORT_CONFIG__USE_HEADER_NAMES_VALUE);

    importEClass = createEClass(IMPORT);
    createEReference(importEClass, IMPORT__VALUES);
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
    initEClass(hdbdtiModelEClass, HdbdtiModel.class, "HdbdtiModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHdbdtiModel_ImportElement(), this.getImport(), null, "importElement", null, 0, 1, HdbdtiModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(groupTypeEClass, GroupType.class, "GroupType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGroupType_Value(), ecorePackage.getEString(), "value", null, 0, 1, GroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importConfigEClass, ImportConfig.class, "ImportConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImportConfig_Table(), ecorePackage.getEBoolean(), "table", null, 0, 1, ImportConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImportConfig_TableValue(), ecorePackage.getEString(), "tableValue", null, 0, 1, ImportConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImportConfig_Schema(), ecorePackage.getEBoolean(), "schema", null, 0, 1, ImportConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImportConfig_SchemaValue(), ecorePackage.getEString(), "schemaValue", null, 0, 1, ImportConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImportConfig_File(), ecorePackage.getEBoolean(), "file", null, 0, 1, ImportConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImportConfig_FileValue(), ecorePackage.getEString(), "fileValue", null, 0, 1, ImportConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImportConfig_DelimField(), ecorePackage.getEBoolean(), "delimField", null, 0, 1, ImportConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImportConfig_DelimFieldValue(), ecorePackage.getEString(), "delimFieldValue", null, 0, 1, ImportConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImportConfig_Header(), ecorePackage.getEBoolean(), "header", null, 0, 1, ImportConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImportConfig_HeaderValue(), ecorePackage.getEString(), "headerValue", null, 0, 1, ImportConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImportConfig_Keys(), ecorePackage.getEBoolean(), "keys", null, 0, 1, ImportConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImportConfig_HeaderValues(), this.getGroupType(), null, "headerValues", null, 0, -1, ImportConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImportConfig_DelimEnclosing(), ecorePackage.getEBoolean(), "delimEnclosing", null, 0, 1, ImportConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImportConfig_DelimEnclosingValue(), ecorePackage.getEString(), "delimEnclosingValue", null, 0, 1, ImportConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImportConfig_DistinguishEmptyFromNull(), ecorePackage.getEBoolean(), "distinguishEmptyFromNull", null, 0, 1, ImportConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImportConfig_DistinguishEmptyFromNullValue(), ecorePackage.getEString(), "distinguishEmptyFromNullValue", null, 0, 1, ImportConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImportConfig_UseHeaderNames(), ecorePackage.getEBoolean(), "useHeaderNames", null, 0, 1, ImportConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImportConfig_UseHeaderNamesValue(), ecorePackage.getEString(), "useHeaderNamesValue", null, 0, 1, ImportConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getImport_Values(), this.getImportConfig(), null, "values", null, 0, -1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //MyHdbtiPackageImpl
