/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBookStoreRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.postgres.generatedclasses.tables.records.TBookStoreRecord> implements org.jooq.Record1<java.lang.String>, org.jooq.test.postgres.generatedclasses.tables.interfaces.ITBookStore {

	private static final long serialVersionUID = 520182333;

	/**
	 * Setter for <code>public.t_book_store.name</code>.
	 */
	public TBookStoreRecord setName(java.lang.String value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_book_store.name</code>.
	 */
	@Override
	public java.lang.String getName() {
		return (java.lang.String) getValue(0);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.String> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record1 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.String> fieldsRow() {
		return (org.jooq.Row1) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.String> valuesRow() {
		return (org.jooq.Row1) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.jooq.test.postgres.generatedclasses.tables.TBookStore.T_BOOK_STORE.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getName();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TBookStoreRecord
	 */
	public TBookStoreRecord() {
		super(org.jooq.test.postgres.generatedclasses.tables.TBookStore.T_BOOK_STORE);
	}

	/**
	 * Create a detached, initialised TBookStoreRecord
	 */
	public TBookStoreRecord(java.lang.String name) {
		super(org.jooq.test.postgres.generatedclasses.tables.TBookStore.T_BOOK_STORE);

		setValue(0, name);
	}
}
