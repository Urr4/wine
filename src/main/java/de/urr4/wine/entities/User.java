package de.urr4.wine.entities;

import org.neo4j.ogm.annotation.*;

import java.util.ArrayList;
import java.util.List;

@NodeEntity(label = "User")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Property(name = "name")
    @Index(unique = true)
    private String name;

    @Relationship(type = "LIKES")
    private List<Wine> likedWines;

    public User(){
        this.likedWines = new ArrayList<>();
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

    public List<Wine> getLikedWines() {
        return likedWines;
    }

    public void setLikedWines(List<Wine> likedWines) {
        this.likedWines = likedWines;
    }

    public void addLikedWine(Wine likedWine){
        this.likedWines.add(likedWine);
    }

    public void removeLikedWine(Wine likedWine){
        boolean remove = this.likedWines.remove(likedWine);
        System.out.println(remove);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!getName().equals(user.getName())) return false;
        return getLikedWines() != null ? getLikedWines().equals(user.getLikedWines()) : user.getLikedWines() == null;
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + (getLikedWines() != null ? getLikedWines().hashCode() : 0);
        return result;
    }
}
