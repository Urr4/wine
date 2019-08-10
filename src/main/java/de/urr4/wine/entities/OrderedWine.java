package de.urr4.wine.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import org.neo4j.ogm.annotation.*;
import org.neo4j.ogm.annotation.typeconversion.Convert;
import org.neo4j.ogm.id.UuidStrategy;
import org.neo4j.ogm.typeconversion.UuidStringConverter;

import java.util.UUID;


@Data
@RelationshipEntity(type = "WITH")
public class OrderedWine {

    @Id
    @GeneratedValue(strategy = UuidStrategy.class)
    @Convert(UuidStringConverter.class)
    @Setter(AccessLevel.PRIVATE)
    private UUID id;

    @Property(name = "amount")
    private final int amountOfWine;

    @StartNode
    @JsonIgnore
    private Order order;

    @EndNode
    private Wine wine;

}
