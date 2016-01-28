/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.objectservice.database.model.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.4.1"},
        comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Template extends org.jooq.impl.TableImpl<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.TemplateRecord> {

    private static final long serialVersionUID = -768287849;

    /**
     * The singleton instance of <code>crowdcontrol.Template</code>
     */
    public static final edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Template TEMPLATE = new edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Template();

    /**
     * The class holding records for this type
     */
    @Override
    public java.lang.Class<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.TemplateRecord> getRecordType() {
        return edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.TemplateRecord.class;
    }

    /**
     * The column <code>crowdcontrol.Template.id_template</code>.
     */
    public final org.jooq.TableField<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.TemplateRecord, java.lang.Integer> ID_TEMPLATE = createField("id_template", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>crowdcontrol.Template.template</code>.
     */
    public final org.jooq.TableField<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.TemplateRecord, java.lang.String> TEMPLATE_ = createField("template", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>crowdcontrol.Template.titel</code>.
     */
    public final org.jooq.TableField<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.TemplateRecord, java.lang.String> TITEL = createField("titel", org.jooq.impl.SQLDataType.VARCHAR.length(191), this, "");

    /**
     * The column <code>crowdcontrol.Template.answer_type</code>.
     */
    public final org.jooq.TableField<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.TemplateRecord, java.lang.String> ANSWER_TYPE = createField("answer_type", org.jooq.impl.SQLDataType.VARCHAR.length(191), this, "");

    /**
     * Create a <code>crowdcontrol.Template</code> table reference
     */
    public Template() {
        this("Template", null);
    }

    /**
     * Create an aliased <code>crowdcontrol.Template</code> table reference
     */
    public Template(java.lang.String alias) {
        this(alias, edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Template.TEMPLATE);
    }

    private Template(java.lang.String alias, org.jooq.Table<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.TemplateRecord> aliased) {
        this(alias, aliased, null);
    }

    private Template(java.lang.String alias, org.jooq.Table<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.TemplateRecord> aliased, org.jooq.Field<?>[] parameters) {
        super(alias, edu.kit.ipd.crowdcontrol.objectservice.database.model.Crowdcontrol.CROWDCONTROL, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Identity<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.TemplateRecord, java.lang.Integer> getIdentity() {
        return edu.kit.ipd.crowdcontrol.objectservice.database.model.Keys.IDENTITY_TEMPLATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.UniqueKey<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.TemplateRecord> getPrimaryKey() {
        return edu.kit.ipd.crowdcontrol.objectservice.database.model.Keys.KEY_TEMPLATE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.util.List<org.jooq.UniqueKey<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.TemplateRecord>> getKeys() {
        return java.util.Arrays.<org.jooq.UniqueKey<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.TemplateRecord>>asList(edu.kit.ipd.crowdcontrol.objectservice.database.model.Keys.KEY_TEMPLATE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Template as(java.lang.String alias) {
        return new edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Template(alias, this);
    }

    /**
     * Rename this table
     */
    public edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Template rename(java.lang.String name) {
        return new edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Template(name, null);
    }
}
