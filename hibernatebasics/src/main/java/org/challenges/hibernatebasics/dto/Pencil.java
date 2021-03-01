package org.challenges.hibernatebasics.dto;


import javax.persistence.*;

@Entity(name = "pencil")
public class Pencil {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int pencilId;
    private String brandName;

    @ManyToOne
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getPencilId() {
        return pencilId;
    }

    public void setPencilId(int pencilId) {
        this.pencilId = pencilId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
