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
 * Logs entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "logs", catalog = "agentsystem")
public class Logs implements java.io.Serializable {

	// Fields

	private Long id;
	private User user;
	private String userName;
	private String operateInfo;
	private Timestamp operateDatetime;

	// Constructors

	/** default constructor */
	public Logs() {
	}

	/** full constructor */
	public Logs(User user, String userName, String operateInfo,
			Timestamp operateDatetime) {
		this.user = user;
		this.userName = userName;
		this.operateInfo = operateInfo;
		this.operateDatetime = operateDatetime;
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

	@Column(name = "userName", length = 60)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "operateInfo")
	public String getOperateInfo() {
		return this.operateInfo;
	}

	public void setOperateInfo(String operateInfo) {
		this.operateInfo = operateInfo;
	}

	@Column(name = "operateDatetime", length = 19)
	public Timestamp getOperateDatetime() {
		return this.operateDatetime;
	}

	public void setOperateDatetime(Timestamp operateDatetime) {
		this.operateDatetime = operateDatetime;
	}

}