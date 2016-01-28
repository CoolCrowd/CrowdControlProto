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
public class WorkerBalance implements java.io.Serializable {

    private static final long serialVersionUID = -2016297992;

    private java.lang.Integer idWorkerBalance;
    private java.lang.Integer transactionValue;
    private java.lang.Integer worker;
    private java.lang.Integer experiment;
    private java.lang.Integer giftCode;
    private edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.WorkerBalanceType type;
    private java.sql.Timestamp timestamp;

    public WorkerBalance() {
    }

    public WorkerBalance(
            java.lang.Integer idWorkerBalance,
            java.lang.Integer transactionValue,
            java.lang.Integer worker,
            java.lang.Integer experiment,
            java.lang.Integer giftCode,
            edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.WorkerBalanceType type,
            java.sql.Timestamp timestamp
    ) {
        this.idWorkerBalance = idWorkerBalance;
        this.transactionValue = transactionValue;
        this.worker = worker;
        this.experiment = experiment;
        this.giftCode = giftCode;
        this.type = type;
        this.timestamp = timestamp;
    }

    public java.lang.Integer getIdWorkerBalance() {
        return this.idWorkerBalance;
    }

    public void setIdWorkerBalance(java.lang.Integer idWorkerBalance) {
        this.idWorkerBalance = idWorkerBalance;
    }

    public java.lang.Integer getTransactionValue() {
        return this.transactionValue;
    }

    public void setTransactionValue(java.lang.Integer transactionValue) {
        this.transactionValue = transactionValue;
    }

    public java.lang.Integer getWorker() {
        return this.worker;
    }

    public void setWorker(java.lang.Integer worker) {
        this.worker = worker;
    }

    public java.lang.Integer getExperiment() {
        return this.experiment;
    }

    public void setExperiment(java.lang.Integer experiment) {
        this.experiment = experiment;
    }

    public java.lang.Integer getGiftCode() {
        return this.giftCode;
    }

    public void setGiftCode(java.lang.Integer giftCode) {
        this.giftCode = giftCode;
    }

    public edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.WorkerBalanceType getType() {
        return this.type;
    }

    public void setType(edu.kit.ipd.crowdcontrol.objectservice.database.model.enums.WorkerBalanceType type) {
        this.type = type;
    }

    public java.sql.Timestamp getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(java.sql.Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
