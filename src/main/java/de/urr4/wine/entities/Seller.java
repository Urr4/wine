package de.urr4.wine.entities;

import java.util.HashSet;
import java.util.Set;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;


@NodeEntity(label = "Seller")
public class Seller {

	@Id
	@GeneratedValue
	private Long id;

	@Property(name = "name")
	@Index(unique = true)
	private String name;

	@Property(name = "address")
	@Index(unique = true)
	private String address;

	@Property(name = "lat")
	private Double lat;

	@Property(name = "lng")
	private Double lng;

	@Property(name = "email")
	@Index(unique = true)
	private String email;

	@Property(name = "active")
	private boolean isActive;

	@Relationship(type = "SELLS")
	private Set<Wine> wines;


	public Seller() {
		wines = new HashSet<>();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Set<Wine> getWines() {
		return wines;
	}


	public void setWines(Set<Wine> wines) {
		this.wines = wines;
	}


	public void addWine(Wine wine) {
		this.wines.add(wine);
	}


	public boolean isActive() {
		return isActive;
	}


	public void setActive(boolean active) {
		isActive = active;
	}


	public Double getLat() {
		return lat;
	}


	public void setLat(Double lat) {
		this.lat = lat;
	}


	public Double getLng() {
		return lng;
	}


	public void setLng(Double lng) {
		this.lng = lng;
	}


	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Seller that = (Seller) o;

		if (isActive() != that.isActive())
			return false;
		if (!getName().equals(that.getName()))
			return false;
		if (getAddress() != null ? !getAddress().equals(that.getAddress()) : that.getAddress() != null)
			return false;
		return getEmail() != null ? getEmail().equals(that.getEmail()) : that.getEmail() == null;
	}


	@Override
	public int hashCode() {
		int result = getName().hashCode();
		result = 31 * result + (getAddress() != null ? getAddress().hashCode() : 0);
		result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
		result = 31 * result + (isActive() ? 1 : 0);
		return result;
	}


	@Override
	public String toString() {
		return "Seller{" +
				"id=" + id +
				", name='" + name + '\'' +
				", address='" + address + '\'' +
				", email='" + email + '\'' +
				", isActive=" + isActive +
				", wines=" + wines +
				'}';
	}
}
