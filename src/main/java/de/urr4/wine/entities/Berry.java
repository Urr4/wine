package de.urr4.wine.entities;

import java.util.Objects;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;


@NodeEntity(label = "Berry")
public class Berry {

	@Id
	@GeneratedValue
	private Long id;

	@Property(name = "name")
	private String name;


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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Berry berry = (Berry) o;
		return Objects.equals(name, berry.name);
	}

	@Override
	public int hashCode() {

		return Objects.hash(name);
	}

	@Override
	public String toString() {
		return "Berry{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
