package de.urr4.wine.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import org.neo4j.ogm.annotation.*;
import org.neo4j.ogm.annotation.typeconversion.Convert;
import org.neo4j.ogm.id.UuidStrategy;
import org.neo4j.ogm.typeconversion.UuidStringConverter;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Data
@NodeEntity(label = "Seller")
public class Seller {

    @Id
    @GeneratedValue(strategy = UuidStrategy.class)
    @Convert(UuidStringConverter.class)
    @Setter(AccessLevel.PRIVATE)
    private UUID id;

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
    private boolean isActive = true;

    @Relationship(type = "SELLS")
    private Set<Wine> wines = new HashSet<>();

}
