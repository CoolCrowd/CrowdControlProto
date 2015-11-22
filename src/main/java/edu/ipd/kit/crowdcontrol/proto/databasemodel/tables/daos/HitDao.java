/**
 * This class is generated by jOOQ
 */
package edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HitDao extends org.jooq.impl.DAOImpl<edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.records.HitRecord, edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.pojos.Hit, java.lang.Integer> {

	/**
	 * Create a new HitDao without any configuration
	 */
	public HitDao() {
		super(edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.Hit.HIT, edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.pojos.Hit.class);
	}

	/**
	 * Create a new HitDao with an attached configuration
	 */
	public HitDao(org.jooq.Configuration configuration) {
		super(edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.Hit.HIT, edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.pojos.Hit.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.pojos.Hit object) {
		return object.getIdhit();
	}

	/**
	 * Fetch records that have <code>idHIT IN (values)</code>
	 */
	public java.util.List<edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.pojos.Hit> fetchByIdhit(java.lang.Integer... values) {
		return fetch(edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.Hit.HIT.IDHIT, values);
	}

	/**
	 * Fetch a unique record that has <code>idHIT = value</code>
	 */
	public edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.pojos.Hit fetchOneByIdhit(java.lang.Integer value) {
		return fetchOne(edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.Hit.HIT.IDHIT, value);
	}

	/**
	 * Fetch records that have <code>experiment_h IN (values)</code>
	 */
	public java.util.List<edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.pojos.Hit> fetchByExperimentH(java.lang.Integer... values) {
		return fetch(edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.Hit.HIT.EXPERIMENT_H, values);
	}

	/**
	 * Fetch records that have <code>type IN (values)</code>
	 */
	public java.util.List<edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.pojos.Hit> fetchByType(java.lang.String... values) {
		return fetch(edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.Hit.HIT.TYPE, values);
	}

	/**
	 * Fetch records that have <code>running IN (values)</code>
	 */
	public java.util.List<edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.pojos.Hit> fetchByRunning(java.lang.Boolean... values) {
		return fetch(edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.Hit.HIT.RUNNING, values);
	}

	/**
	 * Fetch records that have <code>current_amount IN (values)</code>
	 */
	public java.util.List<edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.pojos.Hit> fetchByCurrentAmount(java.lang.Integer... values) {
		return fetch(edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.Hit.HIT.CURRENT_AMOUNT, values);
	}

	/**
	 * Fetch records that have <code>max_amount IN (values)</code>
	 */
	public java.util.List<edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.pojos.Hit> fetchByMaxAmount(java.lang.Integer... values) {
		return fetch(edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.Hit.HIT.MAX_AMOUNT, values);
	}

	/**
	 * Fetch records that have <code>payment IN (values)</code>
	 */
	public java.util.List<edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.pojos.Hit> fetchByPayment(java.lang.Integer... values) {
		return fetch(edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.Hit.HIT.PAYMENT, values);
	}

	/**
	 * Fetch records that have <code>bonus IN (values)</code>
	 */
	public java.util.List<edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.pojos.Hit> fetchByBonus(java.lang.Integer... values) {
		return fetch(edu.ipd.kit.crowdcontrol.proto.databasemodel.tables.Hit.HIT.BONUS, values);
	}
}
