/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding language master data
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TLanguage extends org.jooq.impl.TableImpl<org.jooq.test.mysql.generatedclasses.tables.records.TLanguageRecord> {

	private static final long serialVersionUID = 1987176537;

	/**
	 * The singleton instance of <code>test.t_language</code>
	 */
	public static final org.jooq.test.mysql.generatedclasses.tables.TLanguage T_LANGUAGE = new org.jooq.test.mysql.generatedclasses.tables.TLanguage();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql.generatedclasses.tables.records.TLanguageRecord> getRecordType() {
		return org.jooq.test.mysql.generatedclasses.tables.records.TLanguageRecord.class;
	}

	/**
	 * The column <code>test.t_language.CD</code>. The language ISO code
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TLanguageRecord, java.lang.String> CD = createField("CD", org.jooq.impl.SQLDataType.CHAR.length(2).nullable(false), T_LANGUAGE);

	/**
	 * The column <code>test.t_language.DESCRIPTION</code>. The language description
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TLanguageRecord, java.lang.String> DESCRIPTION = createField("DESCRIPTION", org.jooq.impl.SQLDataType.VARCHAR.length(50), T_LANGUAGE);

	/**
	 * The column <code>test.t_language.description_english</code>.
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TLanguageRecord, java.lang.String> DESCRIPTION_ENGLISH = createField("description_english", org.jooq.impl.SQLDataType.VARCHAR.length(50), T_LANGUAGE);

	/**
	 * The column <code>test.t_language.ID</code>. The language ID
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TLanguageRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), T_LANGUAGE);

	/**
	 * No further instances allowed
	 */
	private TLanguage() {
		super("t_language", org.jooq.test.mysql.generatedclasses.Test.TEST);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.TLanguageRecord> getPrimaryKey() {
		return org.jooq.test.mysql.generatedclasses.Keys.KEY_T_LANGUAGE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.TLanguageRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.TLanguageRecord>>asList(org.jooq.test.mysql.generatedclasses.Keys.KEY_T_LANGUAGE_PRIMARY);
	}
}
