/**
 * This class is generated by jOOQ
 */
package edu.ipd.kit.crowdcontrol.objectservice.database.model.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Worker implements java.io.Serializable {

	private static final long serialVersionUID = -192306762;

	private java.lang.Integer idworker;
	private java.lang.String  identification;
	private java.lang.String  platform;
	private java.lang.String  email;

	public Worker() {}

	public Worker(
		java.lang.Integer idworker,
		java.lang.String  identification,
		java.lang.String  platform,
		java.lang.String  email
	) {
		this.idworker = idworker;
		this.identification = identification;
		this.platform = platform;
		this.email = email;
	}

	public java.lang.Integer getIdworker() {
		return this.idworker;
	}

	public void setIdworker(java.lang.Integer idworker) {
		this.idworker = idworker;
	}

	public java.lang.String getIdentification() {
		return this.identification;
	}

	public void setIdentification(java.lang.String identification) {
		this.identification = identification;
	}

	public java.lang.String getPlatform() {
		return this.platform;
	}

	public void setPlatform(java.lang.String platform) {
		this.platform = platform;
	}

	public java.lang.String getEmail() {
		return this.email;
	}

	public void setEmail(java.lang.String email) {
		this.email = email;
	}
}
