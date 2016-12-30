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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Province entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "province", catalog = "agentsystem")
public class Province implements java.io.Serializable {

	// Fields

	private Integer id;
	private Area area;
	private String province;
	private Set<Customs> customses = new HashSet<Customs>(0);

	// Constructors

	/** default constructor */
	public Province() {
	}

	/** full constructor */
	public Province(Area area, String province, Set<Customs> customses) {
		this.area = area;
		this.province = province;
		this.customses = customses;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "provinceID")
	public Area getArea() {
		return this.area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	@Column(name = "province", length = 40)
	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "province")
	public Set<Customs> getCustomses() {
		return this.customses;
	}

	public void setCustomses(Set<Customs> customses) {
		this.customses = customses;
	}

}