package de.urr4.wine.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import org.neo4j.ogm.annotation.*;
import org.neo4j.ogm.annotation.typeconversion.Convert;
import org.neo4j.ogm.id.UuidStrategy;
import org.neo4j.ogm.typeconversion.UuidStringConverter;

import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

@Data
@NodeEntity(label = "Order")
public class Order {

    @Id
    @GeneratedValue(strategy = UuidStrategy.class)
    @Convert(UuidStringConverter.class)
    @Setter(AccessLevel.PRIVATE)
    private UUID id;

    @Property(name = "porto")
    private final Double porto;

    @Property(name = "porto")
    private final double fullPrice;

    @Relationship(type = "FOR")
    private final Seller seller;

    @Relationship(type = "WITH")
    private final Set<OrderedWine> wines;

    @Property(name = "receivedOn")
    private LocalDate receivedOn;

    @Property(name = "payedOn")
    private LocalDate payedOn;

}
