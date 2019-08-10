package de.urr4.wine.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.typeconversion.Convert;
import org.neo4j.ogm.id.UuidStrategy;
import org.neo4j.ogm.typeconversion.UuidStringConverter;

import java.util.UUID;

@Data
@NodeEntity(label = "Berry")
public class Berry {

    @Id
    @GeneratedValue(strategy = UuidStrategy.class)
    @Convert(UuidStringConverter.class)
    @Setter(AccessLevel.PRIVATE)
    private UUID id;

    @Property(name = "name")
    private String name;

}
