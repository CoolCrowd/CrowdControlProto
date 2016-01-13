/**
 * This class is generated by jOOQ
 */
package edu.ipd.kit.crowdcontrol.objectservice.database.model.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Experimentspopulation extends org.jooq.impl.TableImpl<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.ExperimentspopulationRecord> {

	private static final long serialVersionUID = -1931246196;

	/**
	 * The singleton instance of <code>crowdcontrol.ExperimentsPopulation</code>
	 */
	public static final edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Experimentspopulation EXPERIMENTSPOPULATION = new edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Experimentspopulation();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.ExperimentspopulationRecord> getRecordType() {
		return edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.ExperimentspopulationRecord.class;
	}

	/**
	 * The column <code>crowdcontrol.ExperimentsPopulation.idExperimentsPopulation</code>.
	 */
	public final org.jooq.TableField<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.ExperimentspopulationRecord, java.lang.String> IDEXPERIMENTSPOPULATION = createField("idExperimentsPopulation", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.ExperimentsPopulation.population_user</code>.
	 */
	public final org.jooq.TableField<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.ExperimentspopulationRecord, java.lang.Integer> POPULATION_USER = createField("population_user", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.ExperimentsPopulation.correct_answer</code>.
	 */
	public final org.jooq.TableField<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.ExperimentspopulationRecord, java.lang.Integer> CORRECT_ANSWER = createField("correct_answer", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.ExperimentsPopulation.referenced_platform</code>.
	 */
	public final org.jooq.TableField<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.ExperimentspopulationRecord, java.lang.String> REFERENCED_PLATFORM = createField("referenced_platform", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.ExperimentsPopulation.not</code>.
	 */
	public final org.jooq.TableField<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.ExperimentspopulationRecord, java.lang.Boolean> NOT = createField("not", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

	/**
	 * Create a <code>crowdcontrol.ExperimentsPopulation</code> table reference
	 */
	public Experimentspopulation() {
		this("ExperimentsPopulation", null);
	}

	/**
	 * Create an aliased <code>crowdcontrol.ExperimentsPopulation</code> table reference
	 */
	public Experimentspopulation(java.lang.String alias) {
		this(alias, edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Experimentspopulation.EXPERIMENTSPOPULATION);
	}

	private Experimentspopulation(java.lang.String alias, org.jooq.Table<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.ExperimentspopulationRecord> aliased) {
		this(alias, aliased, null);
	}

	private Experimentspopulation(java.lang.String alias, org.jooq.Table<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.ExperimentspopulationRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, edu.ipd.kit.crowdcontrol.objectservice.database.model.Crowdcontrol.CROWDCONTROL, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.ExperimentspopulationRecord> getPrimaryKey() {
		return edu.ipd.kit.crowdcontrol.objectservice.database.model.Keys.KEY_EXPERIMENTSPOPULATION_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.ExperimentspopulationRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.ExperimentspopulationRecord>>asList(edu.ipd.kit.crowdcontrol.objectservice.database.model.Keys.KEY_EXPERIMENTSPOPULATION_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.ExperimentspopulationRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.records.ExperimentspopulationRecord, ?>>asList(edu.ipd.kit.crowdcontrol.objectservice.database.model.Keys.POPULATIONUSER, edu.ipd.kit.crowdcontrol.objectservice.database.model.Keys.REFERENCEDANSWER, edu.ipd.kit.crowdcontrol.objectservice.database.model.Keys.REFERENCEDPLATFORM);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Experimentspopulation as(java.lang.String alias) {
		return new edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Experimentspopulation(alias, this);
	}

	/**
	 * Rename this table
	 */
	public edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Experimentspopulation rename(java.lang.String name) {
		return new edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.Experimentspopulation(name, null);
	}
}
