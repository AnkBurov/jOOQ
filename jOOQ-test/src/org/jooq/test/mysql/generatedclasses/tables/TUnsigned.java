/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TUnsigned extends org.jooq.impl.TableImpl<org.jooq.test.mysql.generatedclasses.tables.records.TUnsignedRecord> {

	private static final long serialVersionUID = 41621675;

	/**
	 * The singleton instance of <code>test.t_unsigned</code>
	 */
	public static final org.jooq.test.mysql.generatedclasses.tables.TUnsigned T_UNSIGNED = new org.jooq.test.mysql.generatedclasses.tables.TUnsigned();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql.generatedclasses.tables.records.TUnsignedRecord> getRecordType() {
		return org.jooq.test.mysql.generatedclasses.tables.records.TUnsignedRecord.class;
	}

	/**
	 * The column <code>test.t_unsigned.u_byte</code>.
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TUnsignedRecord, org.jooq.types.UByte> U_BYTE = createField("u_byte", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, T_UNSIGNED);

	/**
	 * The column <code>test.t_unsigned.u_short</code>.
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TUnsignedRecord, org.jooq.types.UShort> U_SHORT = createField("u_short", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED, T_UNSIGNED);

	/**
	 * The column <code>test.t_unsigned.u_int</code>.
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TUnsignedRecord, org.jooq.types.UInteger> U_INT = createField("u_int", org.jooq.impl.SQLDataType.INTEGERUNSIGNED, T_UNSIGNED);

	/**
	 * The column <code>test.t_unsigned.u_long</code>.
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TUnsignedRecord, org.jooq.types.ULong> U_LONG = createField("u_long", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, T_UNSIGNED);

	/**
	 * No further instances allowed
	 */
	private TUnsigned() {
		super("t_unsigned", org.jooq.test.mysql.generatedclasses.Test.TEST);
	}
}
