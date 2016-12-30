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
 * Account entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "account", catalog = "agentsystem")
public class Account implements java.io.Serializable {

	// Fields

	private Long id;
	private User user;
	private Double money;
	private Double moneyBak;

	// Constructors

	/** default constructor */
	public Account() {
	}

	/** full constructor */
	public Account(User user, Double money, Double moneyBak) {
		this.user = user;
		this.money = money;
		this.moneyBak = moneyBak;
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
	@JoinColumn(name = "userId")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "money", precision = 22, scale = 0)
	public Double getMoney() {
		return this.money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	@Column(name = "moneyBak", precision = 22, scale = 0)
	public Double getMoneyBak() {
		return this.moneyBak;
	}

	public void setMoneyBak(Double moneyBak) {
		this.moneyBak = moneyBak;
	}

}