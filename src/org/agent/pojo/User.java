package org.agent.pojo;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * User entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "user", catalog = "agentsystem")
public class User implements java.io.Serializable {

	// Fields

	private Long id;
	private String userCode;
	private String userName;
	private String userPassword;
	private Timestamp creationTime;
	private Timestamp lastLoginTime;
	private String createdBy;
	private Timestamp lastUpdateTime;
	private Integer isStart;
	private Long roleId;
	private Set<Keywords> keywordses = new HashSet<Keywords>(0);
	private Set<Account> accounts = new HashSet<Account>(0);
	private Set<Accountdetail> accountdetails = new HashSet<Accountdetail>(0);
	private Set<Logs> logses = new HashSet<Logs>(0);
	private Set<Customs> customses = new HashSet<Customs>(0);

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(String userCode, String userName, String userPassword,
			Timestamp creationTime, Timestamp lastLoginTime, String createdBy,
			Timestamp lastUpdateTime, Integer isStart, Long roleId,
			Set<Keywords> keywordses, Set<Account> accounts,
			Set<Accountdetail> accountdetails, Set<Logs> logses,
			Set<Customs> customses) {
		this.userCode = userCode;
		this.userName = userName;
		this.userPassword = userPassword;
		this.creationTime = creationTime;
		this.lastLoginTime = lastLoginTime;
		this.createdBy = createdBy;
		this.lastUpdateTime = lastUpdateTime;
		this.isStart = isStart;
		this.roleId = roleId;
		this.keywordses = keywordses;
		this.accounts = accounts;
		this.accountdetails = accountdetails;
		this.logses = logses;
		this.customses = customses;
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

	@Column(name = "userCode", length = 50)
	public String getUserCode() {
		return this.userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	@Column(name = "userName", length = 100)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "userPassword", length = 64)
	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Column(name = "creationTime", length = 19)
	public Timestamp getCreationTime() {
		return this.creationTime;
	}

	public void setCreationTime(Timestamp creationTime) {
		this.creationTime = creationTime;
	}

	@Column(name = "lastLoginTime", length = 19)
	public Timestamp getLastLoginTime() {
		return this.lastLoginTime;
	}

	public void setLastLoginTime(Timestamp lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	@Column(name = "createdBy", length = 50)
	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Column(name = "lastUpdateTime", length = 19)
	public Timestamp getLastUpdateTime() {
		return this.lastUpdateTime;
	}

	public void setLastUpdateTime(Timestamp lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	@Column(name = "isStart")
	public Integer getIsStart() {
		return this.isStart;
	}

	public void setIsStart(Integer isStart) {
		this.isStart = isStart;
	}

	@Column(name = "roleId")
	public Long getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Keywords> getKeywordses() {
		return this.keywordses;
	}

	public void setKeywordses(Set<Keywords> keywordses) {
		this.keywordses = keywordses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Account> getAccounts() {
		return this.accounts;
	}

	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Accountdetail> getAccountdetails() {
		return this.accountdetails;
	}

	public void setAccountdetails(Set<Accountdetail> accountdetails) {
		this.accountdetails = accountdetails;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Logs> getLogses() {
		return this.logses;
	}

	public void setLogses(Set<Logs> logses) {
		this.logses = logses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Customs> getCustomses() {
		return this.customses;
	}

	public void setCustomses(Set<Customs> customses) {
		this.customses = customses;
	}

}