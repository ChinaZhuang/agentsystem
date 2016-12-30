package org.agent.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Contacts entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "contacts", catalog = "agentsystem")
public class Contacts implements java.io.Serializable {

	// Fields

	private Long id;
	private Customs customs;
	private String contactName;
	private String contactTel;
	private String contactFax;
	private String contactEmail;
	private String contactRole;

	// Constructors

	/** default constructor */
	public Contacts() {
	}

	/** full constructor */
	public Contacts(Customs customs, String contactName, String contactTel,
			String contactFax, String contactEmail, String contactRole) {
		this.customs = customs;
		this.contactName = contactName;
		this.contactTel = contactTel;
		this.contactFax = contactFax;
		this.contactEmail = contactEmail;
		this.contactRole = contactRole;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customId")
	public Customs getCustoms() {
		return this.customs;
	}

	public void setCustoms(Customs customs) {
		this.customs = customs;
	}

	@Column(name = "contactName", length = 20)
	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	@Column(name = "contactTel", length = 20)
	public String getContactTel() {
		return this.contactTel;
	}

	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}

	@Column(name = "contactFax", length = 20)
	public String getContactFax() {
		return this.contactFax;
	}

	public void setContactFax(String contactFax) {
		this.contactFax = contactFax;
	}

	@Column(name = "contactEmail", length = 20)
	public String getContactEmail() {
		return this.contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	@Column(name = "contactRole", length = 20)
	public String getContactRole() {
		return this.contactRole;
	}

	public void setContactRole(String contactRole) {
		this.contactRole = contactRole;
	}

}