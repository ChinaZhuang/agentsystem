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
 * City entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "city", catalog = "agentsystem")
public class City implements java.io.Serializable {

	// Fields

	private Integer id;
	private String cityId;
	private String city;
	private String father;
	private Set<Customs> customses = new HashSet<Customs>(0);
	private Set<Area> areas = new HashSet<Area>(0);

	// Constructors

	/** default constructor */
	public City() {
	}

	/** full constructor */
	public City(String cityId, String city, String father,
			Set<Customs> customses, Set<Area> areas) {
		this.cityId = cityId;
		this.city = city;
		this.father = father;
		this.customses = customses;
		this.areas = areas;
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

	@Column(name = "cityID", length = 6)
	public String getCityId() {
		return this.cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	@Column(name = "city", length = 50)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "father", length = 6)
	public String getFather() {
		return this.father;
	}

	public void setFather(String father) {
		this.father = father;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "city")
	public Set<Customs> getCustomses() {
		return this.customses;
	}

	public void setCustomses(Set<Customs> customses) {
		this.customses = customses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "city")
	public Set<Area> getAreas() {
		return this.areas;
	}

	public void setAreas(Set<Area> areas) {
		this.areas = areas;
	}

}