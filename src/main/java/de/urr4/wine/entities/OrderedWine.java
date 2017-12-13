package de.urr4.wine.entities;

import org.neo4j.ogm.annotation.*;

@RelationshipEntity(type = "WITH")
public class OrderedWine {

    @Id
    @GeneratedValue
    private Long id;

    @Property(name = "amount")
    private int amountOfWine;

    @StartNode
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
