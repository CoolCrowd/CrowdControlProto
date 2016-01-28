/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.objectservice.database.model.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.4.1"},
        comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Experiment implements java.io.Serializable {

    private static final long serialVersionUID = -938979743;

    private java.lang.Integer idExperiment;
    private java.lang.String titel;
    private java.lang.String description;
    private java.lang.Integer neededAnswers;
    private java.lang.Integer ratingsPerAnswer;
    private java.lang.Integer anwersPerWorker;
    private java.lang.Integer ratingsPerWorker;
    private java.lang.String answerType;
    private java.lang.String algorithmTaskChooser;
    private java.lang.String algorithmQualityAnswer;
    private java.lang.String algorithmQualityRating;
    private java.lang.Integer basePayment;
    private java.lang.Integer bonusAnswer;
    private java.lang.Integer bonusRating;
    private java.lang.String templateData;
    private java.lang.Integer template;

    public Experiment() {
    }

    public Experiment(
            java.lang.Integer idExperiment,
            java.lang.String titel,
            java.lang.String description,
            java.lang.Integer neededAnswers,
            java.lang.Integer ratingsPerAnswer,
            java.lang.Integer anwersPerWorker,
            java.lang.Integer ratingsPerWorker,
            java.lang.String answerType,
            java.lang.String algorithmTaskChooser,
            java.lang.String algorithmQualityAnswer,
            java.lang.String algorithmQualityRating,
            java.lang.Integer basePayment,
            java.lang.Integer bonusAnswer,
            java.lang.Integer bonusRating,
            java.lang.String templateData,
            java.lang.Integer template
    ) {
        this.idExperiment = idExperiment;
        this.titel = titel;
        this.description = description;
        this.neededAnswers = neededAnswers;
        this.ratingsPerAnswer = ratingsPerAnswer;
        this.anwersPerWorker = anwersPerWorker;
        this.ratingsPerWorker = ratingsPerWorker;
        this.answerType = answerType;
        this.algorithmTaskChooser = algorithmTaskChooser;
        this.algorithmQualityAnswer = algorithmQualityAnswer;
        this.algorithmQualityRating = algorithmQualityRating;
        this.basePayment = basePayment;
        this.bonusAnswer = bonusAnswer;
        this.bonusRating = bonusRating;
        this.templateData = templateData;
        this.template = template;
    }

    public java.lang.Integer getIdExperiment() {
        return this.idExperiment;
    }

    public void setIdExperiment(java.lang.Integer idExperiment) {
        this.idExperiment = idExperiment;
    }

    public java.lang.String getTitel() {
        return this.titel;
    }

    public void setTitel(java.lang.String titel) {
        this.titel = titel;
    }

    public java.lang.String getDescription() {
        return this.description;
    }

    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    public java.lang.Integer getNeededAnswers() {
        return this.neededAnswers;
    }

    public void setNeededAnswers(java.lang.Integer neededAnswers) {
        this.neededAnswers = neededAnswers;
    }

    public java.lang.Integer getRatingsPerAnswer() {
        return this.ratingsPerAnswer;
    }

    public void setRatingsPerAnswer(java.lang.Integer ratingsPerAnswer) {
        this.ratingsPerAnswer = ratingsPerAnswer;
    }

    public java.lang.Integer getAnwersPerWorker() {
        return this.anwersPerWorker;
    }

    public void setAnwersPerWorker(java.lang.Integer anwersPerWorker) {
        this.anwersPerWorker = anwersPerWorker;
    }

    public java.lang.Integer getRatingsPerWorker() {
        return this.ratingsPerWorker;
    }

    public void setRatingsPerWorker(java.lang.Integer ratingsPerWorker) {
        this.ratingsPerWorker = ratingsPerWorker;
    }

    public java.lang.String getAnswerType() {
        return this.answerType;
    }

    public void setAnswerType(java.lang.String answerType) {
        this.answerType = answerType;
    }

    public java.lang.String getAlgorithmTaskChooser() {
        return this.algorithmTaskChooser;
    }

    public void setAlgorithmTaskChooser(java.lang.String algorithmTaskChooser) {
        this.algorithmTaskChooser = algorithmTaskChooser;
    }

    public java.lang.String getAlgorithmQualityAnswer() {
        return this.algorithmQualityAnswer;
    }

    public void setAlgorithmQualityAnswer(java.lang.String algorithmQualityAnswer) {
        this.algorithmQualityAnswer = algorithmQualityAnswer;
    }

    public java.lang.String getAlgorithmQualityRating() {
        return this.algorithmQualityRating;
    }

    public void setAlgorithmQualityRating(java.lang.String algorithmQualityRating) {
        this.algorithmQualityRating = algorithmQualityRating;
    }

    public java.lang.Integer getBasePayment() {
        return this.basePayment;
    }

    public void setBasePayment(java.lang.Integer basePayment) {
        this.basePayment = basePayment;
    }

    public java.lang.Integer getBonusAnswer() {
        return this.bonusAnswer;
    }

    public void setBonusAnswer(java.lang.Integer bonusAnswer) {
        this.bonusAnswer = bonusAnswer;
    }

    public java.lang.Integer getBonusRating() {
        return this.bonusRating;
    }

    public void setBonusRating(java.lang.Integer bonusRating) {
        this.bonusRating = bonusRating;
    }

    public java.lang.String getTemplateData() {
        return this.templateData;
    }

    public void setTemplateData(java.lang.String templateData) {
        this.templateData = templateData;
    }

    public java.lang.Integer getTemplate() {
        return this.template;
    }

    public void setTemplate(java.lang.Integer template) {
        this.template = template;
    }
}
