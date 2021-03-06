package org.challenges.hibernatebasics.dto;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

@Entity(name = "soldiers")
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE,region = "soldiers")
@NamedQuery(name = "soldiers.byId",query = "from soldiers where id = :id")
public class Soldiers {

    @Id
    @GeneratedValue
    private int id;
    private String rank;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
