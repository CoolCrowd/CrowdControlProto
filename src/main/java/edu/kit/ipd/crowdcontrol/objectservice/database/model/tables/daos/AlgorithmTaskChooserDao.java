/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AlgorithmTaskChooserDao extends org.jooq.impl.DAOImpl<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.AlgorithmTaskChooserRecord, edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.AlgorithmTaskChooser, java.lang.String> {

	/**
	 * Create a new AlgorithmTaskChooserDao without any configuration
	 */
	public AlgorithmTaskChooserDao() {
		super(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.AlgorithmTaskChooser.ALGORITHM_TASK_CHOOSER, edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.AlgorithmTaskChooser.class);
	}

	/**
	 * Create a new AlgorithmTaskChooserDao with an attached configuration
	 */
	public AlgorithmTaskChooserDao(org.jooq.Configuration configuration) {
		super(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.AlgorithmTaskChooser.ALGORITHM_TASK_CHOOSER, edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.AlgorithmTaskChooser.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.String getId(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.AlgorithmTaskChooser object) {
		return object.getIdTaskChooser();
	}

	/**
	 * Fetch records that have <code>id_task_chooser IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.AlgorithmTaskChooser> fetchByIdTaskChooser(java.lang.String... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.AlgorithmTaskChooser.ALGORITHM_TASK_CHOOSER.ID_TASK_CHOOSER, values);
	}

	/**
	 * Fetch a unique record that has <code>id_task_chooser = value</code>
	 */
	public edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.AlgorithmTaskChooser fetchOneByIdTaskChooser(java.lang.String value) {
		return fetchOne(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.AlgorithmTaskChooser.ALGORITHM_TASK_CHOOSER.ID_TASK_CHOOSER, value);
	}

	/**
	 * Fetch records that have <code>description IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.AlgorithmTaskChooser> fetchByDescription(java.lang.String... values) {
		return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.AlgorithmTaskChooser.ALGORITHM_TASK_CHOOSER.DESCRIPTION, values);
	}
}
