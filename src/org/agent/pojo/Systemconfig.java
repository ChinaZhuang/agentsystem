package org.agent.pojo;

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
 * Systemconfig entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "systemconfig", catalog = "agentsystem")
public class Systemconfig implements java.io.Serializable {

	// Fields

	private Long id;
	private Integer configType;
	private String configTypeName;
	private Integer configTypeValue;
	private String configValue;
	private Integer isStart;
	private Set<Keywords> keywordses = new HashSet<Keywords>(0);
	private Set<Customs> customsesForCustomType = new HashSet<Customs>(0);
	private Set<Customs> customsesForCardType = new HashSet<Customs>(0);
	private Set<Accountdetail> accountdetails = new HashSet<Accountdetail>(0);

	// Constructors

	/** default constructor */
	public Systemconfig() {
	}

	/** full constructor */
	public Systemconfig(Integer configType, String configTypeName,
			Integer configTypeValue, String configValue, Integer isStart,
			Set<Keywords> keywordses, Set<Customs> customsesForCustomType,
			Set<Customs> customsesForCardType, Set<Accountdetail> accountdetails) {
		this.configType = configType;
		this.configTypeName = configTypeName;
		this.configTypeValue = configTypeValue;
		this.configValue = configValue;
		this.isStart = isStart;
		this.keywordses = keywordses;
		this.customsesForCustomType = customsesForCustomType;
		this.customsesForCardType = customsesForCardType;
		this.accountdetails = accountdetails;
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

	@Column(name = "configType")
	public Integer getConfigType() {
		return this.configType;
	}

	public void setConfigType(Integer configType) {
		this.configType = configType;
	}

	@Column(name = "configTypeName", length = 20)
	public String getConfigTypeName() {
		return this.configTypeName;
	}

	public void setConfigTypeName(String configTypeName) {
		this.configTypeName = configTypeName;
	}

	@Column(name = "configTypeValue")
	public Integer getConfigTypeValue() {
		return this.configTypeValue;
	}

	public void setConfigTypeValue(Integer configTypeValue) {
		this.configTypeValue = configTypeValue;
	}

	@Column(name = "configValue", length = 20)
	public String getConfigValue() {
		return this.configValue;
	}

	public void setConfigValue(String configValue) {
		this.configValue = configValue;
	}

	@Column(name = "isStart")
	public Integer getIsStart() {
		return this.isStart;
	}

	public void setIsStart(Integer isStart) {
		this.isStart = isStart;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "systemconfig")
	public Set<Keywords> getKeywordses() {
		return this.keywordses;
	}

	public void setKeywordses(Set<Keywords> keywordses) {
		this.keywordses = keywordses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "systemconfigByCustomType")
	public Set<Customs> getCustomsesForCustomType() {
		return this.customsesForCustomType;
	}

	public void setCustomsesForCustomType(Set<Customs> customsesForCustomType) {
		this.customsesForCustomType = customsesForCustomType;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "systemconfigByCardType")
	public Set<Customs> getCustomsesForCardType() {
		return this.customsesForCardType;
	}

	public void setCustomsesForCardType(Set<Customs> customsesForCardType) {
		this.customsesForCardType = customsesForCardType;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "systemconfig")
	public Set<Accountdetail> getAccountdetails() {
		return this.accountdetails;
	}

	public void setAccountdetails(Set<Accountdetail> accountdetails) {
		this.accountdetails = accountdetails;
	}

}