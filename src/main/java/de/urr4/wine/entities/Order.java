package de.urr4.wine.entities;

import java.time.LocalDate;
import java.util.Set;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;


@NodeEntity(label = "Order")
public class Order {

	@Id
	@GeneratedValue
	private Long id;

	@Property(name = "porto")
	private Double porto;

	@Property(name = "porto")
	private double fullPrice;

	@Relationship(type = "FOR")
	private Seller seller;

	@Relationship(type = "WITH")
	private Set<OrderedWine> wines;

	@Property(name = "receivedOn")
	private LocalDate receivedOn;

	@Property(name = "payedOn")
	private LocalDate payedOn;

	@Property(name = "isActive")
	private boolean isActive;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Double getPorto() {
		return porto;
	}


	public void setPorto(Double porto) {
		this.porto = porto;
	}


	public double getFullPrice() {
		return fullPrice;
	}


	public void setFullPrice(double fullPrice) {
		this.fullPrice = fullPrice;
	}


	public Seller getSeller() {
		return seller;
	}


	public void setSeller(Seller seller) {
		this.seller = seller;
	}


	public Set<OrderedWine> getWines() {
		return wines;
	}


	public void setWines(Set<OrderedWine> wines) {
		this.wines = wines;
	}


	public LocalDate getReceivedOn() {
		return receivedOn;
	}


	public void setReceivedOn(LocalDate receivedOn) {
		this.receivedOn = receivedOn;
	}


	public LocalDate getPayedOn() {
		return payedOn;
	}


	public void setPayedOn(LocalDate payedOn) {
		this.payedOn = payedOn;
	}


	public boolean isActive() {
		return isActive;
	}


	public void setActive(boolean active) {
		isActive = active;
	}
}
