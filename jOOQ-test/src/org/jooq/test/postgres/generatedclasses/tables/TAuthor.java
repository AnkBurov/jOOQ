/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TAuthor extends org.jooq.impl.TableImpl<org.jooq.test.postgres.generatedclasses.tables.records.TAuthorRecord> {

	private static final long serialVersionUID = 275685535;

	/**
	 * The singleton instance of <code>public.t_author</code>
	 */
	public static final org.jooq.test.postgres.generatedclasses.tables.TAuthor T_AUTHOR = new org.jooq.test.postgres.generatedclasses.tables.TAuthor();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.TAuthorRecord> getRecordType() {
		return org.jooq.test.postgres.generatedclasses.tables.records.TAuthorRecord.class;
	}

	/**
	 * The column <code>public.t_author.id</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TAuthorRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>public.t_author.first_name</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TAuthorRecord, java.lang.String> FIRST_NAME = createField("first_name", org.jooq.impl.SQLDataType.VARCHAR.length(50), this);

	/**
	 * The column <code>public.t_author.last_name</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TAuthorRecord, java.lang.String> LAST_NAME = createField("last_name", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this);

	/**
	 * The column <code>public.t_author.date_of_birth</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TAuthorRecord, java.sql.Date> DATE_OF_BIRTH = createField("date_of_birth", org.jooq.impl.SQLDataType.DATE, this);

	/**
	 * The column <code>public.t_author.year_of_birth</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TAuthorRecord, java.lang.Integer> YEAR_OF_BIRTH = createField("year_of_birth", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>public.t_author.address</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TAuthorRecord, org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord> ADDRESS = createField("address", org.jooq.test.postgres.generatedclasses.udt.UAddressType.U_ADDRESS_TYPE.getDataType(), this);

	/**
	 * Create a <code>public.t_author</code> table reference
	 */
	public TAuthor() {
		super("t_author", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>public.t_author</code> table reference
	 */
	public TAuthor(java.lang.String alias) {
		super(alias, org.jooq.test.postgres.generatedclasses.Public.PUBLIC, org.jooq.test.postgres.generatedclasses.tables.TAuthor.T_AUTHOR);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TAuthorRecord> getPrimaryKey() {
		return org.jooq.test.postgres.generatedclasses.Keys.PK_T_AUTHOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TAuthorRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TAuthorRecord>>asList(org.jooq.test.postgres.generatedclasses.Keys.PK_T_AUTHOR);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.postgres.generatedclasses.tables.TAuthor as(java.lang.String alias) {
		return new org.jooq.test.postgres.generatedclasses.tables.TAuthor(alias);
	}
}
