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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Customs entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "customs", catalog = "agentsystem")
public class Customs implements java.io.Serializable {

	// Fields

	private Long id;
	private Systemconfig systemconfigByCustomType;
	private Area area;
	private Province province;
	private City city;
	private Systemconfig systemconfigByCardType;
	private User user;
	private String agentName;
	private String customName;
	private String customTypeName;
	private String siteUrl;
	private Integer customStatus;
	private String bossName;
	private String cardTypeName;
	private String cardNum;
	private String companyTel;
	private String companyFax;
	private Timestamp regDatetime;
	private String country;
	private String companyAddress;
	private String memo;
	private String agentCode;
	private Set<Keywords> keywordses = new HashSet<Keywords>(0);
	private Set<Contacts> contactses = new HashSet<Contacts>(0);

	// Constructors

	/** default constructor */
	public Customs() {
	}

	/** full constructor */
	public Customs(Systemconfig systemconfigByCustomType, Area area,
			Province province, City city, Systemconfig systemconfigByCardType,
			User user, String agentName, String customName,
			String customTypeName, String siteUrl, Integer customStatus,
			String bossName, String cardTypeName, String cardNum,
			String companyTel, String companyFax, Timestamp regDatetime,
			String country, String companyAddress, String memo,
			String agentCode, Set<Keywords> keywordses, Set<Contacts> contactses) {
		this.systemconfigByCustomType = systemconfigByCustomType;
		this.area = area;
		this.province = province;
		this.city = city;
		this.systemconfigByCardType = systemconfigByCardType;
		this.user = user;
		this.agentName = agentName;
		this.customName = customName;
		this.customTypeName = customTypeName;
		this.siteUrl = siteUrl;
		this.customStatus = customStatus;
		this.bossName = bossName;
		this.cardTypeName = cardTypeName;
		this.cardNum = cardNum;
		this.companyTel = companyTel;
		this.companyFax = companyFax;
		this.regDatetime = regDatetime;
		this.country = country;
		this.companyAddress = companyAddress;
		this.memo = memo;
		this.agentCode = agentCode;
		this.keywordses = keywordses;
		this.contactses = contactses;
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
	@JoinColumn(name = "customType")
	public Systemconfig getSystemconfigByCustomType() {
		return this.systemconfigByCustomType;
	}

	public void setSystemconfigByCustomType(
			Systemconfig systemconfigByCustomType) {
		this.systemconfigByCustomType = systemconfigByCustomType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "area")
	public Area getArea() {
		return this.area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "province")
	public Province getProvince() {
		return this.province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "city")
	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cardType")
	public Systemconfig getSystemconfigByCardType() {
		return this.systemconfigByCardType;
	}

	public void setSystemconfigByCardType(Systemconfig systemconfigByCardType) {
		this.systemconfigByCardType = systemconfigByCardType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "agentId")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "agentName")
	public String getAgentName() {
		return this.agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	@Column(name = "customName")
	public String getCustomName() {
		return this.customName;
	}

	public void setCustomName(String customName) {
		this.customName = customName;
	}

	@Column(name = "customTypeName", length = 50)
	public String getCustomTypeName() {
		return this.customTypeName;
	}

	public void setCustomTypeName(String customTypeName) {
		this.customTypeName = customTypeName;
	}

	@Column(name = "siteUrl")
	public String getSiteUrl() {
		return this.siteUrl;
	}

	public void setSiteUrl(String siteUrl) {
		this.siteUrl = siteUrl;
	}

	@Column(name = "customStatus")
	public Integer getCustomStatus() {
		return this.customStatus;
	}

	public void setCustomStatus(Integer customStatus) {
		this.customStatus = customStatus;
	}

	@Column(name = "bossName", length = 50)
	public String getBossName() {
		return this.bossName;
	}

	public void setBossName(String bossName) {
		this.bossName = bossName;
	}

	@Column(name = "cardTypeName", length = 20)
	public String getCardTypeName() {
		return this.cardTypeName;
	}

	public void setCardTypeName(String cardTypeName) {
		this.cardTypeName = cardTypeName;
	}

	@Column(name = "cardNum", length = 60)
	public String getCardNum() {
		return this.cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	@Column(name = "companyTel", length = 50)
	public String getCompanyTel() {
		return this.companyTel;
	}

	public void setCompanyTel(String companyTel) {
		this.companyTel = companyTel;
	}

	@Column(name = "companyFax", length = 50)
	public String getCompanyFax() {
		return this.companyFax;
	}

	public void setCompanyFax(String companyFax) {
		this.companyFax = companyFax;
	}

	@Column(name = "regDatetime", length = 19)
	public Timestamp getRegDatetime() {
		return this.regDatetime;
	}

	public void setRegDatetime(Timestamp regDatetime) {
		this.regDatetime = regDatetime;
	}

	@Column(name = "country", length = 10)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "companyAddress")
	public String getCompanyAddress() {
		return this.companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	@Column(name = "memo", length = 65535)
	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Column(name = "agentCode")
	public String getAgentCode() {
		return this.agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "customs")
	public Set<Keywords> getKeywordses() {
		return this.keywordses;
	}

	public void setKeywordses(Set<Keywords> keywordses) {
		this.keywordses = keywordses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "customs")
	public Set<Contacts> getContactses() {
		return this.contactses;
	}

	public void setContactses(Set<Contacts> contactses) {
		this.contactses = contactses;
	}

}