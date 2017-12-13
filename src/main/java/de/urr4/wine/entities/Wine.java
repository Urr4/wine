package de.urr4.wine.entities;

import org.neo4j.ogm.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@NodeEntity(label = "Wine")
public class Wine {

    @Id
    @GeneratedValue
    private Long id;

    @Labels
    private List<String> colors;

    @Property(name = "name")
    private String name;

    @Relationship(type = "MADE_FROM")
    private Set<Berry> berries;

    @Property(name = "alcohol")
    private Double alcohol;

    @Property(name = "rs")
    private Double restSugar;

    @Property(name = "s")
    private Double acid;

    @Property(name = "price")
    private Double price;

    @Property(name = "size")
    private Double bottleSize;

    public Wine(){
        this.berries = new HashSet<>();
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

    public Set<Berry> getBerries() {
        return berries;
    }

    public void setBerries(Set<Berry> berries) {
        this.berries = berries;
    }

    public void addBerry(Berry berry){
        this.berries.add(berry);
    }

    public Double getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(Double alcohol) {
        this.alcohol = alcohol;
    }

    public Double getRestSugar() {
        return restSugar;
    }

    public void setRestSugar(Double restSugar) {
        this.restSugar = restSugar;
    }

    public Double getAcid() {
        return acid;
    }

    public void setAcid(Double acid) {
        this.acid = acid;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getBottleSize() {
        return bottleSize;
    }

    public void setBottleSize(Double bottleSize) {
        this.bottleSize = bottleSize;
    }

    public List<String> getColors() {
        return colors;
    }

    public void setColors(List<String> colors) {
        this.colors = colors;
    }

    public String getColor(){
        return getColors().get(0);
    }

    public void setColor(String color){
        this.getColors().set(0, color);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Wine wine = (Wine) o;

        if (getColors() != null ? !getColors().equals(wine.getColors()) : wine.getColors() != null) return false;
        if (!getName().equals(wine.getName())) return false;
        if (getBerries() != null ? !getBerries().equals(wine.getBerries()) : wine.getBerries() != null) return false;
        if (getAlcohol() != null ? !getAlcohol().equals(wine.getAlcohol()) : wine.getAlcohol() != null) return false;
        if (getRestSugar() != null ? !getRestSugar().equals(wine.getRestSugar()) : wine.getRestSugar() != null) return false;
        if (getAcid() != null ? !getAcid().equals(wine.getAcid()) : wine.getAcid() != null) return false;
        if (getPrice() != null ? !getPrice().equals(wine.getPrice()) : wine.getPrice() != null) return false;
        return getBottleSize() != null ? getBottleSize().equals(wine.getBottleSize()) : wine.getBottleSize() == null;
    }

    @Override
    public int hashCode() {
        int result = getColors() != null ? getColors().hashCode() : 0;
        result = 31 * result + getName().hashCode();
        result = 31 * result + (getBerries() != null ? getBerries().hashCode() : 0);
        result = 31 * result + (getAlcohol() != null ? getAlcohol().hashCode() : 0);
        result = 31 * result + (getRestSugar() != null ? getRestSugar().hashCode() : 0);
        result = 31 * result + (getAcid() != null ? getAcid().hashCode() : 0);
        result = 31 * result + (getPrice() != null ? getPrice().hashCode() : 0);
        result = 31 * result + (getBottleSize() != null ? getBottleSize().hashCode() : 0);
        return result;
    }
}
