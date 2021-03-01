package org.challenges.hibernatebasics.dto;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @OneToMany
    @JoinTable(name = "s_p",joinColumns = @JoinColumn(name = "s_id"),inverseJoinColumns = @JoinColumn(name = "p_id"))
    private Collection<Pencil> pencils = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Pencil> getPencils() {
        return pencils;
    }

    public void setPencils(Collection<Pencil> pencils) {
        this.pencils = pencils;
    }
}
