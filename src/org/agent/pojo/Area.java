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
 * Area entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "area", catalog = "agentsystem")
public class Area implements java.io.Serializable {

	// Fields

	private Integer id;
	private City city;
	private String area;
	private String father;
	private Set<Province> provinces = new HashSet<Province>(0);
	private Set<Customs> customses = new HashSet<Customs>(0);

	// Constructors

	/** default constructor */
	public Area() {
	}

	/** full constructor */
	public Area(City city, String area, String father, Set<Province> provinces,
			Set<Customs> customses) {
		this.city = city;
		this.area = area;
		this.father = father;
		this.provinces = provinces;
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
	@JoinColumn(name = "areaID")
	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Column(name = "area", length = 60)
	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Column(name = "father", length = 6)
	public String getFather() {
		return this.father;
	}

	public void setFather(String father) {
		this.father = father;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "area")
	public Set<Province> getProvinces() {
		return this.provinces;
	}

	public void setProvinces(Set<Province> provinces) {
		this.provinces = provinces;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "area")
	public Set<Customs> getCustomses() {
		return this.customses;
	}

	public void setCustomses(Set<Customs> customses) {
		this.customses = customses;
	}

}