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
public class PopulationAnswerOption implements java.io.Serializable {

    private static final long serialVersionUID = -335923800;

    private java.lang.Integer idPopulationAnswerOption;
    private java.lang.Integer population;
    private java.lang.String answer;

    public PopulationAnswerOption() {
    }

    public PopulationAnswerOption(
            java.lang.Integer idPopulationAnswerOption,
            java.lang.Integer population,
            java.lang.String answer
    ) {
        this.idPopulationAnswerOption = idPopulationAnswerOption;
        this.population = population;
        this.answer = answer;
    }

    public java.lang.Integer getIdPopulationAnswerOption() {
        return this.idPopulationAnswerOption;
    }

    public void setIdPopulationAnswerOption(java.lang.Integer idPopulationAnswerOption) {
        this.idPopulationAnswerOption = idPopulationAnswerOption;
    }

    public java.lang.Integer getPopulation() {
        return this.population;
    }

    public void setPopulation(java.lang.Integer population) {
        this.population = population;
    }

    public java.lang.String getAnswer() {
        return this.answer;
    }

    public void setAnswer(java.lang.String answer) {
        this.answer = answer;
    }
}
