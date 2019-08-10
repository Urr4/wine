package de.urr4.wine.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.neo4j.ogm.annotation.*;
import org.neo4j.ogm.annotation.typeconversion.Convert;
import org.neo4j.ogm.id.UuidStrategy;
import org.neo4j.ogm.typeconversion.UuidStringConverter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@NodeEntity(label = "User")
public class User {

    @Id
    @GeneratedValue(strategy = UuidStrategy.class)
    @Convert(UuidStringConverter.class)
    @Setter(AccessLevel.PRIVATE)
    private UUID id;

    @Property(name = "name")
    @Index(unique = true)
    private String name;

    @Relationship(type = "LIKES")
    private List<Wine> likedWines = new ArrayList<>();

    @Property(name = "isActive")
    private boolean isActive = true;

}
