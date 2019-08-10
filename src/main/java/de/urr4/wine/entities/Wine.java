package de.urr4.wine.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import org.neo4j.ogm.annotation.*;
import org.neo4j.ogm.annotation.typeconversion.Convert;
import org.neo4j.ogm.id.UuidStrategy;
import org.neo4j.ogm.typeconversion.UuidStringConverter;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Data
@NodeEntity(label = "Wine")
public class Wine {

    @Id
    @GeneratedValue(strategy = UuidStrategy.class)
    @Convert(UuidStringConverter.class)
    @Setter(AccessLevel.PRIVATE)
    private UUID id;

    @Property(name = "name")
    private String name;

    @Relationship(type = "COLOR")
    private List<ColorNode> colorsNodes;

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

    @Property(name = "isActive")
    private boolean isActive = true;

}