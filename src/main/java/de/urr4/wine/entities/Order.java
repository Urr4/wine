package de.urr4.wine.entities;

import org.neo4j.ogm.annotation.*;

import java.util.Set;

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
}
