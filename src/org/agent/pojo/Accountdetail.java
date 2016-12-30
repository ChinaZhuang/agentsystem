package org.agent.pojo;

import java.sql.Timestamp;
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
 * Accountdetail entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "accountdetail", catalog = "agentsystem")
public class Accountdetail implements java.io.Serializable {

	// Fields

	private Long id;
	private Systemconfig systemconfig;
	private User user;
	private String detailTypeName;
	private Double money;
	private Double accountMoney;
	private String memo;
	private Timestamp detailDateTime;

	// Constructors

	/** default constructor */
	public Accountdetail() {
	}

	/** full constructor */
	public Accountdetail(Systemconfig systemconfig, User user,
			String detailTypeName, Double money, Double accountMoney,
			String memo, Timestamp detailDateTime) {
		this.systemconfig = systemconfig;
		this.user = user;
		this.detailTypeName = detailTypeName;
		this.money = money;
		this.accountMoney = accountMoney;
		this.memo = memo;
		this.detailDateTime = detailDateTime;
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
	@JoinColumn(name = "detailType")
	public Systemconfig getSystemconfig() {
		return this.systemconfig;
	}

	public void setSystemconfig(Systemconfig systemconfig) {
		this.systemconfig = systemconfig;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "detailTypeName", length = 50)
	public String getDetailTypeName() {
		return this.detailTypeName;
	}

	public void setDetailTypeName(String detailTypeName) {
		this.detailTypeName = detailTypeName;
	}

	@Column(name = "money", precision = 22, scale = 0)
	public Double getMoney() {
		return this.money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	@Column(name = "accountMoney", precision = 22, scale = 0)
	public Double getAccountMoney() {
		return this.accountMoney;
	}

	public void setAccountMoney(Double accountMoney) {
		this.accountMoney = accountMoney;
	}

	@Column(name = "memo")
	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Column(name = "detailDateTime", length = 19)
	public Timestamp getDetailDateTime() {
		return this.detailDateTime;
	}

	public void setDetailDateTime(Timestamp detailDateTime) {
		this.detailDateTime = detailDateTime;
	}

}