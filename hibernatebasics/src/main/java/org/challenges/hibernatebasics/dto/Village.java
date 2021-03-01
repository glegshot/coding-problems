package org.challenges.hibernatebasics.dto;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Collection;

@Entity(name = "village")
public class Village {

    @Id
    @GeneratedValue
    private int villageId;
    private String villageName;

    @OneToMany
    @Cascade(CascadeType.ALL)
    private Collection<House> house = new ArrayList<>();

    public int getVillageId() {
        return villageId;
    }

    public void setVillageId(int villageId) {
        this.villageId = villageId;
    }

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    public Collection<House> getHouse() {
        return house;
    }

    public void setHouse(Collection<House> house) {
        this.house = house;
    }
}
