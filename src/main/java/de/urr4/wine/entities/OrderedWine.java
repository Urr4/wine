package de.urr4.wine.entities;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.fasterxml.jackson.annotation.JsonIgnore;


@RelationshipEntity(type = "WITH")
public class OrderedWine {

	@Id
	@GeneratedValue
	private Long id;

	@Property(name = "amount")
	private int amountOfWine;

	@StartNode
	@JsonIgnore
	private Order order;

	@EndNode
	private Wine wine;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public int getAmountOfWine() {
		return amountOfWine;
	}


	public void setAmountOfWine(int amountOfWine) {
		this.amountOfWine = amountOfWine;
	}


	public void setOrder(Order order) {
		this.order = order;
	}


	public Wine getWine() {
		return wine;
	}


	public void setWine(Wine wine) {
		this.wine = wine;
	}
}
