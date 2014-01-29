/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBookToBookStoreRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord> implements org.jooq.Record3<java.lang.String, java.lang.Integer, java.lang.Integer>, org.jooq.test.postgres.generatedclasses.tables.interfaces.ITBookToBookStore {

	private static final long serialVersionUID = 405545657;

	/**
	 * Setter for <code>public.t_book_to_book_store.book_store_name</code>.
	 */
	public TBookToBookStoreRecord setBookStoreName(java.lang.String value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_book_to_book_store.book_store_name</code>.
	 */
	@Override
	public java.lang.String getBookStoreName() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>public.t_book_to_book_store.book_id</code>.
	 */
	public TBookToBookStoreRecord setBookId(java.lang.Integer value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_book_to_book_store.book_id</code>.
	 */
	@Override
	public java.lang.Integer getBookId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.t_book_to_book_store.stock</code>.
	 */
	public TBookToBookStoreRecord setStock(java.lang.Integer value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_book_to_book_store.stock</code>.
	 */
	@Override
	public java.lang.Integer getStock() {
		return (java.lang.Integer) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record2<java.lang.String, java.lang.Integer> key() {
		return (org.jooq.Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.String, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.String, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.jooq.test.postgres.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.postgres.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.jooq.test.postgres.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.STOCK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getBookStoreName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getBookId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getStock();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TBookToBookStoreRecord
	 */
	public TBookToBookStoreRecord() {
		super(org.jooq.test.postgres.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE);
	}

	/**
	 * Create a detached, initialised TBookToBookStoreRecord
	 */
	public TBookToBookStoreRecord(java.lang.String bookStoreName, java.lang.Integer bookId, java.lang.Integer stock) {
		super(org.jooq.test.postgres.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE);

		setValue(0, bookStoreName);
		setValue(1, bookId);
		setValue(2, stock);
	}
}
