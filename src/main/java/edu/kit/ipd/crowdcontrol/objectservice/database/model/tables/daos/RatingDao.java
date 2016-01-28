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
public class RatingDao extends org.jooq.impl.DAOImpl<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.records.RatingRecord, edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Rating, java.lang.Integer> {

    /**
     * Create a new RatingDao without any configuration
     */
    public RatingDao() {
        super(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Rating.RATING, edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Rating.class);
    }

    /**
     * Create a new RatingDao with an attached configuration
     */
    public RatingDao(org.jooq.Configuration configuration) {
        super(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Rating.RATING, edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Rating.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected java.lang.Integer getId(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Rating object) {
        return object.getIdRating();
    }

    /**
     * Fetch records that have <code>id_rating IN (values)</code>
     */
    public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Rating> fetchByIdRating(java.lang.Integer... values) {
        return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Rating.RATING.ID_RATING, values);
    }

    /**
     * Fetch a unique record that has <code>id_rating = value</code>
     */
    public edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Rating fetchOneByIdRating(java.lang.Integer value) {
        return fetchOne(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Rating.RATING.ID_RATING, value);
    }

    /**
     * Fetch records that have <code>experiment IN (values)</code>
     */
    public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Rating> fetchByExperiment(java.lang.Integer... values) {
        return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Rating.RATING.EXPERIMENT, values);
    }

    /**
     * Fetch records that have <code>answer_r IN (values)</code>
     */
    public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Rating> fetchByAnswerR(java.lang.Integer... values) {
        return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Rating.RATING.ANSWER_R, values);
    }

    /**
     * Fetch records that have <code>timestamp IN (values)</code>
     */
    public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Rating> fetchByTimestamp(java.sql.Timestamp... values) {
        return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Rating.RATING.TIMESTAMP, values);
    }

    /**
     * Fetch records that have <code>rating IN (values)</code>
     */
    public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Rating> fetchByRating(java.lang.Integer... values) {
        return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Rating.RATING.RATING_, values);
    }

    /**
     * Fetch records that have <code>worker_id IN (values)</code>
     */
    public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Rating> fetchByWorkerId(java.lang.Integer... values) {
        return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Rating.RATING.WORKER_ID, values);
    }

    /**
     * Fetch records that have <code>quality IN (values)</code>
     */
    public java.util.List<edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos.Rating> fetchByQuality(java.lang.Integer... values) {
        return fetch(edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.Rating.RATING.QUALITY, values);
    }
}
