/**
 * This class is generated by jOOQ
 */
package org.jooq.util.hsqldb.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.1.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ElementTypes extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -2078481920;

	/**
	 * The singleton instance of <code>INFORMATION_SCHEMA.ELEMENT_TYPES</code>
	 */
	public static final org.jooq.util.hsqldb.information_schema.tables.ElementTypes ELEMENT_TYPES = new org.jooq.util.hsqldb.information_schema.tables.ElementTypes();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>INFORMATION_SCHEMA.ELEMENT_TYPES.OBJECT_CATALOG</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> OBJECT_CATALOG = createField("OBJECT_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.ELEMENT_TYPES.OBJECT_SCHEMA</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> OBJECT_SCHEMA = createField("OBJECT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.ELEMENT_TYPES.OBJECT_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> OBJECT_NAME = createField("OBJECT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.ELEMENT_TYPES.OBJECT_TYPE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> OBJECT_TYPE = createField("OBJECT_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.ELEMENT_TYPES.COLLECTION_TYPE_IDENTIFIER</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> COLLECTION_TYPE_IDENTIFIER = createField("COLLECTION_TYPE_IDENTIFIER", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.ELEMENT_TYPES.DATA_TYPE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DATA_TYPE = createField("DATA_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.ELEMENT_TYPES.CHARACTER_MAXIMUM_LENGTH</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> CHARACTER_MAXIMUM_LENGTH = createField("CHARACTER_MAXIMUM_LENGTH", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.ELEMENT_TYPES.CHARACTER_OCTET_LENGTH</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> CHARACTER_OCTET_LENGTH = createField("CHARACTER_OCTET_LENGTH", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.ELEMENT_TYPES.CHARACTER_SET_CATALOG</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CHARACTER_SET_CATALOG = createField("CHARACTER_SET_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.ELEMENT_TYPES.CHARACTER_SET_SCHEMA</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CHARACTER_SET_SCHEMA = createField("CHARACTER_SET_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.ELEMENT_TYPES.CHARACTER_SET_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CHARACTER_SET_NAME = createField("CHARACTER_SET_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.ELEMENT_TYPES.COLLATION_CATALOG</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> COLLATION_CATALOG = createField("COLLATION_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.ELEMENT_TYPES.COLLATION_SCHEMA</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> COLLATION_SCHEMA = createField("COLLATION_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.ELEMENT_TYPES.COLLATION_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> COLLATION_NAME = createField("COLLATION_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.ELEMENT_TYPES.NUMERIC_PRECISION</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> NUMERIC_PRECISION = createField("NUMERIC_PRECISION", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.ELEMENT_TYPES.NUMERIC_PRECISION_RADIX</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> NUMERIC_PRECISION_RADIX = createField("NUMERIC_PRECISION_RADIX", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.ELEMENT_TYPES.NUMERIC_SCALE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> NUMERIC_SCALE = createField("NUMERIC_SCALE", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.ELEMENT_TYPES.DATETIME_PRECISION</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> DATETIME_PRECISION = createField("DATETIME_PRECISION", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.ELEMENT_TYPES.INTERVAL_TYPE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> INTERVAL_TYPE = createField("INTERVAL_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.ELEMENT_TYPES.INTERVAL_PRECISION</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> INTERVAL_PRECISION = createField("INTERVAL_PRECISION", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.ELEMENT_TYPES.UDT_CATALOG</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> UDT_CATALOG = createField("UDT_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.ELEMENT_TYPES.UDT_SCHEMA</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> UDT_SCHEMA = createField("UDT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.ELEMENT_TYPES.UDT_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> UDT_NAME = createField("UDT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.ELEMENT_TYPES.SCOPE_CATALOG</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SCOPE_CATALOG = createField("SCOPE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.ELEMENT_TYPES.SCOPE_SCHEMA</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SCOPE_SCHEMA = createField("SCOPE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.ELEMENT_TYPES.SCOPE_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SCOPE_NAME = createField("SCOPE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.ELEMENT_TYPES.MAXIMUM_CARDINALITY</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> MAXIMUM_CARDINALITY = createField("MAXIMUM_CARDINALITY", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.ELEMENT_TYPES.DTD_IDENTIFIER</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DTD_IDENTIFIER = createField("DTD_IDENTIFIER", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.ELEMENT_TYPES.DECLARED_DATA_TYPE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DECLARED_DATA_TYPE = createField("DECLARED_DATA_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.ELEMENT_TYPES.DECLARED_NUMERIC_PRECISION</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> DECLARED_NUMERIC_PRECISION = createField("DECLARED_NUMERIC_PRECISION", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.ELEMENT_TYPES.DECLARED_NUMERIC_SCALE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> DECLARED_NUMERIC_SCALE = createField("DECLARED_NUMERIC_SCALE", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * Create a <code>INFORMATION_SCHEMA.ELEMENT_TYPES</code> table reference
	 */
	public ElementTypes() {
		super("ELEMENT_TYPES", org.jooq.util.hsqldb.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}

	/**
	 * Create an aliased <code>INFORMATION_SCHEMA.ELEMENT_TYPES</code> table reference
	 */
	public ElementTypes(java.lang.String alias) {
		super(alias, org.jooq.util.hsqldb.information_schema.InformationSchema.INFORMATION_SCHEMA, org.jooq.util.hsqldb.information_schema.tables.ElementTypes.ELEMENT_TYPES);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.util.hsqldb.information_schema.tables.ElementTypes as(java.lang.String alias) {
		return new org.jooq.util.hsqldb.information_schema.tables.ElementTypes(alias);
	}
}
