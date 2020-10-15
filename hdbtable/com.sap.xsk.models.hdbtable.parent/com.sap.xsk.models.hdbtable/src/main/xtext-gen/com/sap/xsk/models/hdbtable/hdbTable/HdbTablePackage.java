/**
 * generated by Xtext 2.18.0
 */
package com.sap.xsk.models.hdbtable.hdbTable;

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
 * @see com.sap.xsk.models.hdbtable.hdbTable.HdbTableFactory
 * @model kind="package"
 * @generated
 */
public interface HdbTablePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "hdbTable";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sap.com/xsk/models/hdbtable/HdbTable";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "hdbTable";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  HdbTablePackage eINSTANCE = com.sap.xsk.models.hdbtable.hdbTable.impl.HdbTablePackageImpl.init();

  /**
   * The meta object id for the '{@link com.sap.xsk.models.hdbtable.hdbTable.impl.HdbTableModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sap.xsk.models.hdbtable.hdbTable.impl.HdbTableModelImpl
   * @see com.sap.xsk.models.hdbtable.hdbTable.impl.HdbTablePackageImpl#getHdbTableModel()
   * @generated
   */
  int HDB_TABLE_MODEL = 0;

  /**
   * The feature id for the '<em><b>Table Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HDB_TABLE_MODEL__TABLE_ELEMENT = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HDB_TABLE_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.sap.xsk.models.hdbtable.hdbTable.impl.ColumnTypeImpl <em>Column Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sap.xsk.models.hdbtable.hdbTable.impl.ColumnTypeImpl
   * @see com.sap.xsk.models.hdbtable.hdbTable.impl.HdbTablePackageImpl#getColumnType()
   * @generated
   */
  int COLUMN_TYPE = 1;

  /**
   * The feature id for the '<em><b>Column Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_TYPE__COLUMN_NAME = 0;

  /**
   * The feature id for the '<em><b>Column Sql Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_TYPE__COLUMN_SQL_TYPE = 1;

  /**
   * The feature id for the '<em><b>Column Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_TYPE__COLUMN_LENGTH = 2;

  /**
   * The feature id for the '<em><b>Column Nullable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_TYPE__COLUMN_NULLABLE = 3;

  /**
   * The number of structural features of the '<em>Column Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_TYPE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.sap.xsk.models.hdbtable.hdbTable.impl.TableImpl <em>Table</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sap.xsk.models.hdbtable.hdbTable.impl.TableImpl
   * @see com.sap.xsk.models.hdbtable.hdbTable.impl.HdbTablePackageImpl#getTable()
   * @generated
   */
  int TABLE = 2;

  /**
   * The feature id for the '<em><b>Schema</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__SCHEMA = 0;

  /**
   * The feature id for the '<em><b>Schema Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__SCHEMA_NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__TYPE = 2;

  /**
   * The feature id for the '<em><b>Type Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__TYPE_VALUE = 3;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__DESCRIPTION = 4;

  /**
   * The feature id for the '<em><b>Description Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__DESCRIPTION_TEXT = 5;

  /**
   * The feature id for the '<em><b>Columns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__COLUMNS = 6;

  /**
   * The feature id for the '<em><b>Columns Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__COLUMNS_VALUES = 7;

  /**
   * The feature id for the '<em><b>Primary Key Columns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__PRIMARY_KEY_COLUMNS = 8;

  /**
   * The feature id for the '<em><b>Table Primary Key Columns Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__TABLE_PRIMARY_KEY_COLUMNS_VALUES = 9;

  /**
   * The number of structural features of the '<em>Table</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_FEATURE_COUNT = 10;


  /**
   * Returns the meta object for class '{@link com.sap.xsk.models.hdbtable.hdbTable.HdbTableModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.sap.xsk.models.hdbtable.hdbTable.HdbTableModel
   * @generated
   */
  EClass getHdbTableModel();

  /**
   * Returns the meta object for the containment reference '{@link com.sap.xsk.models.hdbtable.hdbTable.HdbTableModel#getTableElement <em>Table Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Table Element</em>'.
   * @see com.sap.xsk.models.hdbtable.hdbTable.HdbTableModel#getTableElement()
   * @see #getHdbTableModel()
   * @generated
   */
  EReference getHdbTableModel_TableElement();

  /**
   * Returns the meta object for class '{@link com.sap.xsk.models.hdbtable.hdbTable.ColumnType <em>Column Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column Type</em>'.
   * @see com.sap.xsk.models.hdbtable.hdbTable.ColumnType
   * @generated
   */
  EClass getColumnType();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbtable.hdbTable.ColumnType#getColumnName <em>Column Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Column Name</em>'.
   * @see com.sap.xsk.models.hdbtable.hdbTable.ColumnType#getColumnName()
   * @see #getColumnType()
   * @generated
   */
  EAttribute getColumnType_ColumnName();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbtable.hdbTable.ColumnType#getColumnSqlType <em>Column Sql Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Column Sql Type</em>'.
   * @see com.sap.xsk.models.hdbtable.hdbTable.ColumnType#getColumnSqlType()
   * @see #getColumnType()
   * @generated
   */
  EAttribute getColumnType_ColumnSqlType();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbtable.hdbTable.ColumnType#getColumnLength <em>Column Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Column Length</em>'.
   * @see com.sap.xsk.models.hdbtable.hdbTable.ColumnType#getColumnLength()
   * @see #getColumnType()
   * @generated
   */
  EAttribute getColumnType_ColumnLength();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbtable.hdbTable.ColumnType#getColumnNullable <em>Column Nullable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Column Nullable</em>'.
   * @see com.sap.xsk.models.hdbtable.hdbTable.ColumnType#getColumnNullable()
   * @see #getColumnType()
   * @generated
   */
  EAttribute getColumnType_ColumnNullable();

  /**
   * Returns the meta object for class '{@link com.sap.xsk.models.hdbtable.hdbTable.Table <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table</em>'.
   * @see com.sap.xsk.models.hdbtable.hdbTable.Table
   * @generated
   */
  EClass getTable();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbtable.hdbTable.Table#isSchema <em>Schema</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Schema</em>'.
   * @see com.sap.xsk.models.hdbtable.hdbTable.Table#isSchema()
   * @see #getTable()
   * @generated
   */
  EAttribute getTable_Schema();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbtable.hdbTable.Table#getSchemaName <em>Schema Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Schema Name</em>'.
   * @see com.sap.xsk.models.hdbtable.hdbTable.Table#getSchemaName()
   * @see #getTable()
   * @generated
   */
  EAttribute getTable_SchemaName();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbtable.hdbTable.Table#isType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.sap.xsk.models.hdbtable.hdbTable.Table#isType()
   * @see #getTable()
   * @generated
   */
  EAttribute getTable_Type();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbtable.hdbTable.Table#getTypeValue <em>Type Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type Value</em>'.
   * @see com.sap.xsk.models.hdbtable.hdbTable.Table#getTypeValue()
   * @see #getTable()
   * @generated
   */
  EAttribute getTable_TypeValue();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbtable.hdbTable.Table#isDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.sap.xsk.models.hdbtable.hdbTable.Table#isDescription()
   * @see #getTable()
   * @generated
   */
  EAttribute getTable_Description();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbtable.hdbTable.Table#getDescriptionText <em>Description Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description Text</em>'.
   * @see com.sap.xsk.models.hdbtable.hdbTable.Table#getDescriptionText()
   * @see #getTable()
   * @generated
   */
  EAttribute getTable_DescriptionText();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbtable.hdbTable.Table#isColumns <em>Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Columns</em>'.
   * @see com.sap.xsk.models.hdbtable.hdbTable.Table#isColumns()
   * @see #getTable()
   * @generated
   */
  EAttribute getTable_Columns();

  /**
   * Returns the meta object for the containment reference list '{@link com.sap.xsk.models.hdbtable.hdbTable.Table#getColumnsValues <em>Columns Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Columns Values</em>'.
   * @see com.sap.xsk.models.hdbtable.hdbTable.Table#getColumnsValues()
   * @see #getTable()
   * @generated
   */
  EReference getTable_ColumnsValues();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbtable.hdbTable.Table#isPrimaryKeyColumns <em>Primary Key Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Primary Key Columns</em>'.
   * @see com.sap.xsk.models.hdbtable.hdbTable.Table#isPrimaryKeyColumns()
   * @see #getTable()
   * @generated
   */
  EAttribute getTable_PrimaryKeyColumns();

  /**
   * Returns the meta object for the attribute list '{@link com.sap.xsk.models.hdbtable.hdbTable.Table#getTablePrimaryKeyColumnsValues <em>Table Primary Key Columns Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Table Primary Key Columns Values</em>'.
   * @see com.sap.xsk.models.hdbtable.hdbTable.Table#getTablePrimaryKeyColumnsValues()
   * @see #getTable()
   * @generated
   */
  EAttribute getTable_TablePrimaryKeyColumnsValues();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  HdbTableFactory getHdbTableFactory();

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
     * The meta object literal for the '{@link com.sap.xsk.models.hdbtable.hdbTable.impl.HdbTableModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sap.xsk.models.hdbtable.hdbTable.impl.HdbTableModelImpl
     * @see com.sap.xsk.models.hdbtable.hdbTable.impl.HdbTablePackageImpl#getHdbTableModel()
     * @generated
     */
    EClass HDB_TABLE_MODEL = eINSTANCE.getHdbTableModel();

    /**
     * The meta object literal for the '<em><b>Table Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HDB_TABLE_MODEL__TABLE_ELEMENT = eINSTANCE.getHdbTableModel_TableElement();

    /**
     * The meta object literal for the '{@link com.sap.xsk.models.hdbtable.hdbTable.impl.ColumnTypeImpl <em>Column Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sap.xsk.models.hdbtable.hdbTable.impl.ColumnTypeImpl
     * @see com.sap.xsk.models.hdbtable.hdbTable.impl.HdbTablePackageImpl#getColumnType()
     * @generated
     */
    EClass COLUMN_TYPE = eINSTANCE.getColumnType();

    /**
     * The meta object literal for the '<em><b>Column Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN_TYPE__COLUMN_NAME = eINSTANCE.getColumnType_ColumnName();

    /**
     * The meta object literal for the '<em><b>Column Sql Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN_TYPE__COLUMN_SQL_TYPE = eINSTANCE.getColumnType_ColumnSqlType();

    /**
     * The meta object literal for the '<em><b>Column Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN_TYPE__COLUMN_LENGTH = eINSTANCE.getColumnType_ColumnLength();

    /**
     * The meta object literal for the '<em><b>Column Nullable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN_TYPE__COLUMN_NULLABLE = eINSTANCE.getColumnType_ColumnNullable();

    /**
     * The meta object literal for the '{@link com.sap.xsk.models.hdbtable.hdbTable.impl.TableImpl <em>Table</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sap.xsk.models.hdbtable.hdbTable.impl.TableImpl
     * @see com.sap.xsk.models.hdbtable.hdbTable.impl.HdbTablePackageImpl#getTable()
     * @generated
     */
    EClass TABLE = eINSTANCE.getTable();

    /**
     * The meta object literal for the '<em><b>Schema</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE__SCHEMA = eINSTANCE.getTable_Schema();

    /**
     * The meta object literal for the '<em><b>Schema Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE__SCHEMA_NAME = eINSTANCE.getTable_SchemaName();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE__TYPE = eINSTANCE.getTable_Type();

    /**
     * The meta object literal for the '<em><b>Type Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE__TYPE_VALUE = eINSTANCE.getTable_TypeValue();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE__DESCRIPTION = eINSTANCE.getTable_Description();

    /**
     * The meta object literal for the '<em><b>Description Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE__DESCRIPTION_TEXT = eINSTANCE.getTable_DescriptionText();

    /**
     * The meta object literal for the '<em><b>Columns</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE__COLUMNS = eINSTANCE.getTable_Columns();

    /**
     * The meta object literal for the '<em><b>Columns Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE__COLUMNS_VALUES = eINSTANCE.getTable_ColumnsValues();

    /**
     * The meta object literal for the '<em><b>Primary Key Columns</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE__PRIMARY_KEY_COLUMNS = eINSTANCE.getTable_PrimaryKeyColumns();

    /**
     * The meta object literal for the '<em><b>Table Primary Key Columns Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE__TABLE_PRIMARY_KEY_COLUMNS_VALUES = eINSTANCE.getTable_TablePrimaryKeyColumnsValues();

  }

} //HdbTablePackage
