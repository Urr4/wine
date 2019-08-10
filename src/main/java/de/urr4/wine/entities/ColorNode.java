package de.urr4.wine.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@Data
@NodeEntity(label = "Color")
public class ColorNode {

    @Id
    @Setter(AccessLevel.PRIVATE)
    private final Color color;

}
