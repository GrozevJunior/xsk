/**
 * generated by Xtext 2.18.0
 */
package com.sap.xsk.models.hdbti.myHdbti;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.sap.xsk.models.hdbti.myHdbti.MyHdbtiFactory
 * @model kind="package"
 * @generated
 */
public interface MyHdbtiPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myHdbti";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sap.com/xsk/models/hdbti/Hdbti";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myHdbti";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyHdbtiPackage eINSTANCE = com.sap.xsk.models.hdbti.myHdbti.impl.MyHdbtiPackageImpl.init();

  /**
   * The meta object id for the '{@link com.sap.xsk.models.hdbti.myHdbti.impl.HdbdtiModelImpl <em>Hdbdti Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sap.xsk.models.hdbti.myHdbti.impl.HdbdtiModelImpl
   * @see com.sap.xsk.models.hdbti.myHdbti.impl.MyHdbtiPackageImpl#getHdbdtiModel()
   * @generated
   */
  int HDBDTI_MODEL = 0;

  /**
   * The feature id for the '<em><b>Import Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HDBDTI_MODEL__IMPORT_ELEMENT = 0;

  /**
   * The number of structural features of the '<em>Hdbdti Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HDBDTI_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.sap.xsk.models.hdbti.myHdbti.impl.GroupTypeImpl <em>Group Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sap.xsk.models.hdbti.myHdbti.impl.GroupTypeImpl
   * @see com.sap.xsk.models.hdbti.myHdbti.impl.MyHdbtiPackageImpl#getGroupType()
   * @generated
   */
  int GROUP_TYPE = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_TYPE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Group Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.sap.xsk.models.hdbti.myHdbti.impl.ImportConfigImpl <em>Import Config</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sap.xsk.models.hdbti.myHdbti.impl.ImportConfigImpl
   * @see com.sap.xsk.models.hdbti.myHdbti.impl.MyHdbtiPackageImpl#getImportConfig()
   * @generated
   */
  int IMPORT_CONFIG = 2;

  /**
   * The feature id for the '<em><b>Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_CONFIG__TABLE = 0;

  /**
   * The feature id for the '<em><b>Table Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_CONFIG__TABLE_VALUE = 1;

  /**
   * The feature id for the '<em><b>Schema</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_CONFIG__SCHEMA = 2;

  /**
   * The feature id for the '<em><b>Schema Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_CONFIG__SCHEMA_VALUE = 3;

  /**
   * The feature id for the '<em><b>File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_CONFIG__FILE = 4;

  /**
   * The feature id for the '<em><b>File Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_CONFIG__FILE_VALUE = 5;

  /**
   * The feature id for the '<em><b>Delim Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_CONFIG__DELIM_FIELD = 6;

  /**
   * The feature id for the '<em><b>Delim Field Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_CONFIG__DELIM_FIELD_VALUE = 7;

  /**
   * The feature id for the '<em><b>Header</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_CONFIG__HEADER = 8;

  /**
   * The feature id for the '<em><b>Header Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_CONFIG__HEADER_VALUE = 9;

  /**
   * The feature id for the '<em><b>Keys</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_CONFIG__KEYS = 10;

  /**
   * The feature id for the '<em><b>Header Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_CONFIG__HEADER_VALUES = 11;

  /**
   * The feature id for the '<em><b>Delim Enclosing</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_CONFIG__DELIM_ENCLOSING = 12;

  /**
   * The feature id for the '<em><b>Delim Enclosing Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_CONFIG__DELIM_ENCLOSING_VALUE = 13;

  /**
   * The feature id for the '<em><b>Distinguish Empty From Null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_CONFIG__DISTINGUISH_EMPTY_FROM_NULL = 14;

  /**
   * The feature id for the '<em><b>Distinguish Empty From Null Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_CONFIG__DISTINGUISH_EMPTY_FROM_NULL_VALUE = 15;

  /**
   * The feature id for the '<em><b>Use Header Names</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_CONFIG__USE_HEADER_NAMES = 16;

  /**
   * The feature id for the '<em><b>Use Header Names Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_CONFIG__USE_HEADER_NAMES_VALUE = 17;

  /**
   * The number of structural features of the '<em>Import Config</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_CONFIG_FEATURE_COUNT = 18;

  /**
   * The meta object id for the '{@link com.sap.xsk.models.hdbti.myHdbti.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sap.xsk.models.hdbti.myHdbti.impl.ImportImpl
   * @see com.sap.xsk.models.hdbti.myHdbti.impl.MyHdbtiPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 3;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__VALUES = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link com.sap.xsk.models.hdbti.myHdbti.HdbdtiModel <em>Hdbdti Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hdbdti Model</em>'.
   * @see com.sap.xsk.models.hdbti.myHdbti.HdbdtiModel
   * @generated
   */
  EClass getHdbdtiModel();

  /**
   * Returns the meta object for the containment reference '{@link com.sap.xsk.models.hdbti.myHdbti.HdbdtiModel#getImportElement <em>Import Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Import Element</em>'.
   * @see com.sap.xsk.models.hdbti.myHdbti.HdbdtiModel#getImportElement()
   * @see #getHdbdtiModel()
   * @generated
   */
  EReference getHdbdtiModel_ImportElement();

  /**
   * Returns the meta object for class '{@link com.sap.xsk.models.hdbti.myHdbti.GroupType <em>Group Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group Type</em>'.
   * @see com.sap.xsk.models.hdbti.myHdbti.GroupType
   * @generated
   */
  EClass getGroupType();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbti.myHdbti.GroupType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.sap.xsk.models.hdbti.myHdbti.GroupType#getValue()
   * @see #getGroupType()
   * @generated
   */
  EAttribute getGroupType_Value();

  /**
   * Returns the meta object for class '{@link com.sap.xsk.models.hdbti.myHdbti.ImportConfig <em>Import Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Config</em>'.
   * @see com.sap.xsk.models.hdbti.myHdbti.ImportConfig
   * @generated
   */
  EClass getImportConfig();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbti.myHdbti.ImportConfig#isTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Table</em>'.
   * @see com.sap.xsk.models.hdbti.myHdbti.ImportConfig#isTable()
   * @see #getImportConfig()
   * @generated
   */
  EAttribute getImportConfig_Table();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbti.myHdbti.ImportConfig#getTableValue <em>Table Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Table Value</em>'.
   * @see com.sap.xsk.models.hdbti.myHdbti.ImportConfig#getTableValue()
   * @see #getImportConfig()
   * @generated
   */
  EAttribute getImportConfig_TableValue();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbti.myHdbti.ImportConfig#isSchema <em>Schema</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Schema</em>'.
   * @see com.sap.xsk.models.hdbti.myHdbti.ImportConfig#isSchema()
   * @see #getImportConfig()
   * @generated
   */
  EAttribute getImportConfig_Schema();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbti.myHdbti.ImportConfig#getSchemaValue <em>Schema Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Schema Value</em>'.
   * @see com.sap.xsk.models.hdbti.myHdbti.ImportConfig#getSchemaValue()
   * @see #getImportConfig()
   * @generated
   */
  EAttribute getImportConfig_SchemaValue();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbti.myHdbti.ImportConfig#isFile <em>File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>File</em>'.
   * @see com.sap.xsk.models.hdbti.myHdbti.ImportConfig#isFile()
   * @see #getImportConfig()
   * @generated
   */
  EAttribute getImportConfig_File();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbti.myHdbti.ImportConfig#getFileValue <em>File Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>File Value</em>'.
   * @see com.sap.xsk.models.hdbti.myHdbti.ImportConfig#getFileValue()
   * @see #getImportConfig()
   * @generated
   */
  EAttribute getImportConfig_FileValue();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbti.myHdbti.ImportConfig#isDelimField <em>Delim Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Delim Field</em>'.
   * @see com.sap.xsk.models.hdbti.myHdbti.ImportConfig#isDelimField()
   * @see #getImportConfig()
   * @generated
   */
  EAttribute getImportConfig_DelimField();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbti.myHdbti.ImportConfig#getDelimFieldValue <em>Delim Field Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Delim Field Value</em>'.
   * @see com.sap.xsk.models.hdbti.myHdbti.ImportConfig#getDelimFieldValue()
   * @see #getImportConfig()
   * @generated
   */
  EAttribute getImportConfig_DelimFieldValue();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbti.myHdbti.ImportConfig#isHeader <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Header</em>'.
   * @see com.sap.xsk.models.hdbti.myHdbti.ImportConfig#isHeader()
   * @see #getImportConfig()
   * @generated
   */
  EAttribute getImportConfig_Header();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbti.myHdbti.ImportConfig#getHeaderValue <em>Header Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Header Value</em>'.
   * @see com.sap.xsk.models.hdbti.myHdbti.ImportConfig#getHeaderValue()
   * @see #getImportConfig()
   * @generated
   */
  EAttribute getImportConfig_HeaderValue();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbti.myHdbti.ImportConfig#isKeys <em>Keys</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Keys</em>'.
   * @see com.sap.xsk.models.hdbti.myHdbti.ImportConfig#isKeys()
   * @see #getImportConfig()
   * @generated
   */
  EAttribute getImportConfig_Keys();

  /**
   * Returns the meta object for the containment reference list '{@link com.sap.xsk.models.hdbti.myHdbti.ImportConfig#getHeaderValues <em>Header Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Header Values</em>'.
   * @see com.sap.xsk.models.hdbti.myHdbti.ImportConfig#getHeaderValues()
   * @see #getImportConfig()
   * @generated
   */
  EReference getImportConfig_HeaderValues();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbti.myHdbti.ImportConfig#isDelimEnclosing <em>Delim Enclosing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Delim Enclosing</em>'.
   * @see com.sap.xsk.models.hdbti.myHdbti.ImportConfig#isDelimEnclosing()
   * @see #getImportConfig()
   * @generated
   */
  EAttribute getImportConfig_DelimEnclosing();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbti.myHdbti.ImportConfig#getDelimEnclosingValue <em>Delim Enclosing Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Delim Enclosing Value</em>'.
   * @see com.sap.xsk.models.hdbti.myHdbti.ImportConfig#getDelimEnclosingValue()
   * @see #getImportConfig()
   * @generated
   */
  EAttribute getImportConfig_DelimEnclosingValue();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbti.myHdbti.ImportConfig#isDistinguishEmptyFromNull <em>Distinguish Empty From Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Distinguish Empty From Null</em>'.
   * @see com.sap.xsk.models.hdbti.myHdbti.ImportConfig#isDistinguishEmptyFromNull()
   * @see #getImportConfig()
   * @generated
   */
  EAttribute getImportConfig_DistinguishEmptyFromNull();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbti.myHdbti.ImportConfig#getDistinguishEmptyFromNullValue <em>Distinguish Empty From Null Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Distinguish Empty From Null Value</em>'.
   * @see com.sap.xsk.models.hdbti.myHdbti.ImportConfig#getDistinguishEmptyFromNullValue()
   * @see #getImportConfig()
   * @generated
   */
  EAttribute getImportConfig_DistinguishEmptyFromNullValue();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbti.myHdbti.ImportConfig#isUseHeaderNames <em>Use Header Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Use Header Names</em>'.
   * @see com.sap.xsk.models.hdbti.myHdbti.ImportConfig#isUseHeaderNames()
   * @see #getImportConfig()
   * @generated
   */
  EAttribute getImportConfig_UseHeaderNames();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbti.myHdbti.ImportConfig#getUseHeaderNamesValue <em>Use Header Names Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Use Header Names Value</em>'.
   * @see com.sap.xsk.models.hdbti.myHdbti.ImportConfig#getUseHeaderNamesValue()
   * @see #getImportConfig()
   * @generated
   */
  EAttribute getImportConfig_UseHeaderNamesValue();

  /**
   * Returns the meta object for class '{@link com.sap.xsk.models.hdbti.myHdbti.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see com.sap.xsk.models.hdbti.myHdbti.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the containment reference list '{@link com.sap.xsk.models.hdbti.myHdbti.Import#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see com.sap.xsk.models.hdbti.myHdbti.Import#getValues()
   * @see #getImport()
   * @generated
   */
  EReference getImport_Values();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyHdbtiFactory getMyHdbtiFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.sap.xsk.models.hdbti.myHdbti.impl.HdbdtiModelImpl <em>Hdbdti Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sap.xsk.models.hdbti.myHdbti.impl.HdbdtiModelImpl
     * @see com.sap.xsk.models.hdbti.myHdbti.impl.MyHdbtiPackageImpl#getHdbdtiModel()
     * @generated
     */
    EClass HDBDTI_MODEL = eINSTANCE.getHdbdtiModel();

    /**
     * The meta object literal for the '<em><b>Import Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HDBDTI_MODEL__IMPORT_ELEMENT = eINSTANCE.getHdbdtiModel_ImportElement();

    /**
     * The meta object literal for the '{@link com.sap.xsk.models.hdbti.myHdbti.impl.GroupTypeImpl <em>Group Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sap.xsk.models.hdbti.myHdbti.impl.GroupTypeImpl
     * @see com.sap.xsk.models.hdbti.myHdbti.impl.MyHdbtiPackageImpl#getGroupType()
     * @generated
     */
    EClass GROUP_TYPE = eINSTANCE.getGroupType();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP_TYPE__VALUE = eINSTANCE.getGroupType_Value();

    /**
     * The meta object literal for the '{@link com.sap.xsk.models.hdbti.myHdbti.impl.ImportConfigImpl <em>Import Config</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sap.xsk.models.hdbti.myHdbti.impl.ImportConfigImpl
     * @see com.sap.xsk.models.hdbti.myHdbti.impl.MyHdbtiPackageImpl#getImportConfig()
     * @generated
     */
    EClass IMPORT_CONFIG = eINSTANCE.getImportConfig();

    /**
     * The meta object literal for the '<em><b>Table</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_CONFIG__TABLE = eINSTANCE.getImportConfig_Table();

    /**
     * The meta object literal for the '<em><b>Table Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_CONFIG__TABLE_VALUE = eINSTANCE.getImportConfig_TableValue();

    /**
     * The meta object literal for the '<em><b>Schema</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_CONFIG__SCHEMA = eINSTANCE.getImportConfig_Schema();

    /**
     * The meta object literal for the '<em><b>Schema Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_CONFIG__SCHEMA_VALUE = eINSTANCE.getImportConfig_SchemaValue();

    /**
     * The meta object literal for the '<em><b>File</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_CONFIG__FILE = eINSTANCE.getImportConfig_File();

    /**
     * The meta object literal for the '<em><b>File Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_CONFIG__FILE_VALUE = eINSTANCE.getImportConfig_FileValue();

    /**
     * The meta object literal for the '<em><b>Delim Field</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_CONFIG__DELIM_FIELD = eINSTANCE.getImportConfig_DelimField();

    /**
     * The meta object literal for the '<em><b>Delim Field Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_CONFIG__DELIM_FIELD_VALUE = eINSTANCE.getImportConfig_DelimFieldValue();

    /**
     * The meta object literal for the '<em><b>Header</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_CONFIG__HEADER = eINSTANCE.getImportConfig_Header();

    /**
     * The meta object literal for the '<em><b>Header Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_CONFIG__HEADER_VALUE = eINSTANCE.getImportConfig_HeaderValue();

    /**
     * The meta object literal for the '<em><b>Keys</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_CONFIG__KEYS = eINSTANCE.getImportConfig_Keys();

    /**
     * The meta object literal for the '<em><b>Header Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPORT_CONFIG__HEADER_VALUES = eINSTANCE.getImportConfig_HeaderValues();

    /**
     * The meta object literal for the '<em><b>Delim Enclosing</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_CONFIG__DELIM_ENCLOSING = eINSTANCE.getImportConfig_DelimEnclosing();

    /**
     * The meta object literal for the '<em><b>Delim Enclosing Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_CONFIG__DELIM_ENCLOSING_VALUE = eINSTANCE.getImportConfig_DelimEnclosingValue();

    /**
     * The meta object literal for the '<em><b>Distinguish Empty From Null</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_CONFIG__DISTINGUISH_EMPTY_FROM_NULL = eINSTANCE.getImportConfig_DistinguishEmptyFromNull();

    /**
     * The meta object literal for the '<em><b>Distinguish Empty From Null Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_CONFIG__DISTINGUISH_EMPTY_FROM_NULL_VALUE = eINSTANCE.getImportConfig_DistinguishEmptyFromNullValue();

    /**
     * The meta object literal for the '<em><b>Use Header Names</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_CONFIG__USE_HEADER_NAMES = eINSTANCE.getImportConfig_UseHeaderNames();

    /**
     * The meta object literal for the '<em><b>Use Header Names Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_CONFIG__USE_HEADER_NAMES_VALUE = eINSTANCE.getImportConfig_UseHeaderNamesValue();

    /**
     * The meta object literal for the '{@link com.sap.xsk.models.hdbti.myHdbti.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sap.xsk.models.hdbti.myHdbti.impl.ImportImpl
     * @see com.sap.xsk.models.hdbti.myHdbti.impl.MyHdbtiPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPORT__VALUES = eINSTANCE.getImport_Values();

  }

} //MyHdbtiPackage
