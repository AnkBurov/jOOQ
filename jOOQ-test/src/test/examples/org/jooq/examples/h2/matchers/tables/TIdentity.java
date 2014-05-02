/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.h2.matchers.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TIdentity extends org.jooq.impl.TableImpl<org.jooq.examples.h2.matchers.tables.records.TIdentityRecord> {

	private static final long serialVersionUID = -687287450;

	/**
	 * The singleton instance of <code>PUBLIC.T_IDENTITY</code>
	 */
	public static final org.jooq.examples.h2.matchers.tables.TIdentity T_IDENTITY = new org.jooq.examples.h2.matchers.tables.TIdentity();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.h2.matchers.tables.records.TIdentityRecord> getRecordType() {
		return org.jooq.examples.h2.matchers.tables.records.TIdentityRecord.class;
	}

	/**
	 * The column <code>PUBLIC.T_IDENTITY.ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.examples.h2.matchers.tables.records.TIdentityRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), T_IDENTITY);

	/**
	 * The column <code>PUBLIC.T_IDENTITY.VAL</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.examples.h2.matchers.tables.records.TIdentityRecord, java.lang.Integer> VAL = createField("VAL", org.jooq.impl.SQLDataType.INTEGER, T_IDENTITY);

	/**
	 * No further instances allowed
	 */
	private TIdentity() {
		super("T_IDENTITY", org.jooq.examples.h2.matchers.NonPublic.NON_PUBLIC);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.jooq.examples.h2.matchers.tables.records.TIdentityRecord, java.lang.Integer> getIdentity() {
		return org.jooq.examples.h2.matchers.Keys.IDENTITY_T_IDENTITY;
	}
}