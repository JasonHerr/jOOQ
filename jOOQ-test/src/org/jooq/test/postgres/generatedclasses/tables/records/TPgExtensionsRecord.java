/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TPgExtensionsRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.postgres.generatedclasses.tables.records.TPgExtensionsRecord> implements org.jooq.Record5<java.lang.Integer, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object>, org.jooq.test.postgres.generatedclasses.tables.interfaces.ITPgExtensions {

	private static final long serialVersionUID = 499339171;

	/**
	 * Setter for <code>public.t_pg_extensions.id</code>. 
	 */
	public TPgExtensionsRecord setId(java.lang.Integer value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_pg_extensions.id</code>. 
	 */
	@Override
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.t_pg_extensions.pg_interval</code>. 
	 */
	public TPgExtensionsRecord setPgInterval(java.lang.Object value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_pg_extensions.pg_interval</code>. 
	 */
	@Override
	public java.lang.Object getPgInterval() {
		return (java.lang.Object) getValue(1);
	}

	/**
	 * Setter for <code>public.t_pg_extensions.pg_box</code>. 
	 */
	public TPgExtensionsRecord setPgBox(java.lang.Object value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_pg_extensions.pg_box</code>. 
	 */
	@Override
	public java.lang.Object getPgBox() {
		return (java.lang.Object) getValue(2);
	}

	/**
	 * Setter for <code>public.t_pg_extensions.pg_hstore</code>. 
	 */
	public TPgExtensionsRecord setPgHstore(java.lang.Object value) {
		setValue(3, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_pg_extensions.pg_hstore</code>. 
	 */
	@Override
	public java.lang.Object getPgHstore() {
		return (java.lang.Object) getValue(3);
	}

	/**
	 * Setter for <code>public.t_pg_extensions.pg_geometry</code>. 
	 */
	public TPgExtensionsRecord setPgGeometry(java.lang.Object value) {
		setValue(4, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_pg_extensions.pg_geometry</code>. 
	 */
	@Override
	public java.lang.Object getPgGeometry() {
		return (java.lang.Object) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object> fieldsRow() {
		return (org.jooq.Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object> valuesRow() {
		return (org.jooq.Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.postgres.generatedclasses.tables.TPgExtensions.T_PG_EXTENSIONS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object> field2() {
		return org.jooq.test.postgres.generatedclasses.tables.TPgExtensions.T_PG_EXTENSIONS.PG_INTERVAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object> field3() {
		return org.jooq.test.postgres.generatedclasses.tables.TPgExtensions.T_PG_EXTENSIONS.PG_BOX;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object> field4() {
		return org.jooq.test.postgres.generatedclasses.tables.TPgExtensions.T_PG_EXTENSIONS.PG_HSTORE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object> field5() {
		return org.jooq.test.postgres.generatedclasses.tables.TPgExtensions.T_PG_EXTENSIONS.PG_GEOMETRY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Object value2() {
		return getPgInterval();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Object value3() {
		return getPgBox();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Object value4() {
		return getPgHstore();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Object value5() {
		return getPgGeometry();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TPgExtensionsRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TPgExtensionsRecord value2(java.lang.Object value) {
		setPgInterval(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TPgExtensionsRecord value3(java.lang.Object value) {
		setPgBox(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TPgExtensionsRecord value4(java.lang.Object value) {
		setPgHstore(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TPgExtensionsRecord value5(java.lang.Object value) {
		setPgGeometry(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TPgExtensionsRecord values(java.lang.Integer value1, java.lang.Object value2, java.lang.Object value3, java.lang.Object value4, java.lang.Object value5) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TPgExtensionsRecord
	 */
	public TPgExtensionsRecord() {
		super(org.jooq.test.postgres.generatedclasses.tables.TPgExtensions.T_PG_EXTENSIONS);
	}

	/**
	 * Create a detached, initialised TPgExtensionsRecord
	 */
	public TPgExtensionsRecord(java.lang.Integer id, java.lang.Object pgInterval, java.lang.Object pgBox, java.lang.Object pgHstore, java.lang.Object pgGeometry) {
		super(org.jooq.test.postgres.generatedclasses.tables.TPgExtensions.T_PG_EXTENSIONS);

		setValue(0, id);
		setValue(1, pgInterval);
		setValue(2, pgBox);
		setValue(3, pgHstore);
		setValue(4, pgGeometry);
	}
}
