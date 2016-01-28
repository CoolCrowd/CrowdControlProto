/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.4.1"},
        comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ConstraintDao extends org.jooq.impl.DAOImpl<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.ConstraintRecord, edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Constraint, java.lang.Integer> {

    /**
     * Create a new ConstraintDao without any configuration
     */
    public ConstraintDao() {
        super(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Constraint.CONSTRAINT, edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Constraint.class);
    }

    /**
     * Create a new ConstraintDao with an attached configuration
     */
    public ConstraintDao(org.jooq.Configuration configuration) {
        super(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Constraint.CONSTRAINT, edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Constraint.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected java.lang.Integer getId(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Constraint object) {
        return object.getIdConstraint();
    }

    /**
     * Fetch records that have <code>id_constraint IN (values)</code>
     */
    public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Constraint> fetchByIdConstraint(java.lang.Integer... values) {
        return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Constraint.CONSTRAINT.ID_CONSTRAINT, values);
    }

    /**
     * Fetch a unique record that has <code>id_constraint = value</code>
     */
    public edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Constraint fetchOneByIdConstraint(java.lang.Integer value) {
        return fetchOne(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Constraint.CONSTRAINT.ID_CONSTRAINT, value);
    }

    /**
     * Fetch records that have <code>constraint IN (values)</code>
     */
    public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Constraint> fetchByConstraint(java.lang.String... values) {
        return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Constraint.CONSTRAINT.CONSTRAINT_, values);
    }

    /**
     * Fetch records that have <code>experiment IN (values)</code>
     */
    public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Constraint> fetchByExperiment(java.lang.Integer... values) {
        return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Constraint.CONSTRAINT.EXPERIMENT, values);
    }
}
