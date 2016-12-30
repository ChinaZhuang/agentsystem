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
 * Function entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "function", catalog = "agentsystem")
public class Function implements java.io.Serializable {

	// Fields

	private Long id;
	private String functionCode;
	private String functionName;
	private Timestamp creationTime;
	private String createdBy;
	private Timestamp lastUpdateTime;
	private String funcUrl;
	private Integer isStart;
	private Integer parentId;
	private Set<RolePremission> rolePremissions = new HashSet<RolePremission>(0);

	// Constructors

	/** default constructor */
	public Function() {
	}

	/** full constructor */
	public Function(String functionCode, String functionName,
			Timestamp creationTime, String createdBy, Timestamp lastUpdateTime,
			String funcUrl, Integer isStart, Integer parentId,
			Set<RolePremission> rolePremissions) {
		this.functionCode = functionCode;
		this.functionName = functionName;
		this.creationTime = creationTime;
		this.createdBy = createdBy;
		this.lastUpdateTime = lastUpdateTime;
		this.funcUrl = funcUrl;
		this.isStart = isStart;
		this.parentId = parentId;
		this.rolePremissions = rolePremissions;
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

	@Column(name = "functionCode", length = 50)
	public String getFunctionCode() {
		return this.functionCode;
	}

	public void setFunctionCode(String functionCode) {
		this.functionCode = functionCode;
	}

	@Column(name = "functionName", length = 50)
	public String getFunctionName() {
		return this.functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	@Column(name = "creationTime", length = 19)
	public Timestamp getCreationTime() {
		return this.creationTime;
	}

	public void setCreationTime(Timestamp creationTime) {
		this.creationTime = creationTime;
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

	@Column(name = "funcUrl")
	public String getFuncUrl() {
		return this.funcUrl;
	}

	public void setFuncUrl(String funcUrl) {
		this.funcUrl = funcUrl;
	}

	@Column(name = "isStart")
	public Integer getIsStart() {
		return this.isStart;
	}

	public void setIsStart(Integer isStart) {
		this.isStart = isStart;
	}

	@Column(name = "parentId")
	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "function")
	public Set<RolePremission> getRolePremissions() {
		return this.rolePremissions;
	}

	public void setRolePremissions(Set<RolePremission> rolePremissions) {
		this.rolePremissions = rolePremissions;
	}

}