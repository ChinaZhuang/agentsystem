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
 * Keywords entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "keywords", catalog = "agentsystem")
public class Keywords implements java.io.Serializable {

	// Fields

	private Long id;
	private Systemconfig systemconfig;
	private Customs customs;
	private User user;
	private String keywords;
	private String agentName;
	private String customName;
	private Double preRegFrozenMoney;
	private Double price;
	private Integer serviceYears;
	private Integer openApp;
	private String appUserName;
	private String appPassword;
	private String loginUrl;
	private String iosDownloadUrl;
	private String androidDownloadUrl;
	private String codeIosUrl;
	private String codeAndroidUrl;
	private Timestamp preRegDatetime;
	private Timestamp preRegPassDatetime;
	private Timestamp regDatetime;
	private Timestamp regPassDatetime;
	private Integer isPass;
	private Integer checkStatus;
	private Integer isUse;

	// Constructors

	/** default constructor */
	public Keywords() {
	}

	/** full constructor */
	public Keywords(Systemconfig systemconfig, Customs customs, User user,
			String keywords, String agentName, String customName,
			Double preRegFrozenMoney, Double price, Integer serviceYears,
			Integer openApp, String appUserName, String appPassword,
			String loginUrl, String iosDownloadUrl, String androidDownloadUrl,
			String codeIosUrl, String codeAndroidUrl, Timestamp preRegDatetime,
			Timestamp preRegPassDatetime, Timestamp regDatetime,
			Timestamp regPassDatetime, Integer isPass, Integer checkStatus,
			Integer isUse) {
		this.systemconfig = systemconfig;
		this.customs = customs;
		this.user = user;
		this.keywords = keywords;
		this.agentName = agentName;
		this.customName = customName;
		this.preRegFrozenMoney = preRegFrozenMoney;
		this.price = price;
		this.serviceYears = serviceYears;
		this.openApp = openApp;
		this.appUserName = appUserName;
		this.appPassword = appPassword;
		this.loginUrl = loginUrl;
		this.iosDownloadUrl = iosDownloadUrl;
		this.androidDownloadUrl = androidDownloadUrl;
		this.codeIosUrl = codeIosUrl;
		this.codeAndroidUrl = codeAndroidUrl;
		this.preRegDatetime = preRegDatetime;
		this.preRegPassDatetime = preRegPassDatetime;
		this.regDatetime = regDatetime;
		this.regPassDatetime = regPassDatetime;
		this.isPass = isPass;
		this.checkStatus = checkStatus;
		this.isUse = isUse;
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
	@JoinColumn(name = "productType")
	public Systemconfig getSystemconfig() {
		return this.systemconfig;
	}

	public void setSystemconfig(Systemconfig systemconfig) {
		this.systemconfig = systemconfig;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customId")
	public Customs getCustoms() {
		return this.customs;
	}

	public void setCustoms(Customs customs) {
		this.customs = customs;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "agentId")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "keywords", length = 100)
	public String getKeywords() {
		return this.keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
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

	@Column(name = "preRegFrozenMoney", precision = 22, scale = 0)
	public Double getPreRegFrozenMoney() {
		return this.preRegFrozenMoney;
	}

	public void setPreRegFrozenMoney(Double preRegFrozenMoney) {
		this.preRegFrozenMoney = preRegFrozenMoney;
	}

	@Column(name = "price", precision = 22, scale = 0)
	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Column(name = "serviceYears")
	public Integer getServiceYears() {
		return this.serviceYears;
	}

	public void setServiceYears(Integer serviceYears) {
		this.serviceYears = serviceYears;
	}

	@Column(name = "openApp")
	public Integer getOpenApp() {
		return this.openApp;
	}

	public void setOpenApp(Integer openApp) {
		this.openApp = openApp;
	}

	@Column(name = "appUserName", length = 64)
	public String getAppUserName() {
		return this.appUserName;
	}

	public void setAppUserName(String appUserName) {
		this.appUserName = appUserName;
	}

	@Column(name = "appPassword", length = 70)
	public String getAppPassword() {
		return this.appPassword;
	}

	public void setAppPassword(String appPassword) {
		this.appPassword = appPassword;
	}

	@Column(name = "loginUrl")
	public String getLoginUrl() {
		return this.loginUrl;
	}

	public void setLoginUrl(String loginUrl) {
		this.loginUrl = loginUrl;
	}

	@Column(name = "iosDownloadUrl")
	public String getIosDownloadUrl() {
		return this.iosDownloadUrl;
	}

	public void setIosDownloadUrl(String iosDownloadUrl) {
		this.iosDownloadUrl = iosDownloadUrl;
	}

	@Column(name = "androidDownloadUrl")
	public String getAndroidDownloadUrl() {
		return this.androidDownloadUrl;
	}

	public void setAndroidDownloadUrl(String androidDownloadUrl) {
		this.androidDownloadUrl = androidDownloadUrl;
	}

	@Column(name = "codeIosUrl")
	public String getCodeIosUrl() {
		return this.codeIosUrl;
	}

	public void setCodeIosUrl(String codeIosUrl) {
		this.codeIosUrl = codeIosUrl;
	}

	@Column(name = "codeAndroidUrl")
	public String getCodeAndroidUrl() {
		return this.codeAndroidUrl;
	}

	public void setCodeAndroidUrl(String codeAndroidUrl) {
		this.codeAndroidUrl = codeAndroidUrl;
	}

	@Column(name = "preRegDatetime", length = 19)
	public Timestamp getPreRegDatetime() {
		return this.preRegDatetime;
	}

	public void setPreRegDatetime(Timestamp preRegDatetime) {
		this.preRegDatetime = preRegDatetime;
	}

	@Column(name = "preRegPassDatetime", length = 19)
	public Timestamp getPreRegPassDatetime() {
		return this.preRegPassDatetime;
	}

	public void setPreRegPassDatetime(Timestamp preRegPassDatetime) {
		this.preRegPassDatetime = preRegPassDatetime;
	}

	@Column(name = "regDatetime", length = 19)
	public Timestamp getRegDatetime() {
		return this.regDatetime;
	}

	public void setRegDatetime(Timestamp regDatetime) {
		this.regDatetime = regDatetime;
	}

	@Column(name = "regPassDatetime", length = 19)
	public Timestamp getRegPassDatetime() {
		return this.regPassDatetime;
	}

	public void setRegPassDatetime(Timestamp regPassDatetime) {
		this.regPassDatetime = regPassDatetime;
	}

	@Column(name = "isPass")
	public Integer getIsPass() {
		return this.isPass;
	}

	public void setIsPass(Integer isPass) {
		this.isPass = isPass;
	}

	@Column(name = "checkStatus")
	public Integer getCheckStatus() {
		return this.checkStatus;
	}

	public void setCheckStatus(Integer checkStatus) {
		this.checkStatus = checkStatus;
	}

	@Column(name = "isUse")
	public Integer getIsUse() {
		return this.isUse;
	}

	public void setIsUse(Integer isUse) {
		this.isUse = isUse;
	}

}