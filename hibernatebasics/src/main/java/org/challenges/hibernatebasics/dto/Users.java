package org.challenges.hibernatebasics.dto;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.*;

@Entity(name = "users")
public class Users {

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private int userId;

    @Column(name = "user_name")
    private String username;

    @Column(name = "joined_date")
    @Temporal(TemporalType.DATE)
    private Date joinedDate;

    @ElementCollection
    @JoinTable(name = "users_address", joinColumns = @JoinColumn(name = "user_id"))
    /*@GenericGenerator(name="sequence-gen",strategy="sequence")
    @CollectionId(columns = {@Column(name = "address_id")}, generator = "sequence-gen", type = @Type(type = "long"))*/
    private Collection<Address> listOfAddresses = new ArrayList<>();


    public Collection<Address> getListOfAddresses() {
        return listOfAddresses;
    }

    public void setListOfAddresses(Collection<Address> listOfAddresses) {
        this.listOfAddresses = listOfAddresses;
    }

    /*@AttributeOverrides({
            @AttributeOverride(name = "city",column = @Column(name="HOME_CITY_NAME")),
            @AttributeOverride(name="state",column = @Column(name = "HOME_STATE_NAME")),
            @AttributeOverride(name="street",column = @Column(name = "HOME_STREET_NAME")),
            @AttributeOverride(name="zipcode",column = @Column(name = "HOME_ZIP_CODE"))
    })
    private Address homeAddress;

    private Address officeAddress;*/

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(Date joinedDate) {
        this.joinedDate = joinedDate;
    }

    /*public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(Address officeAddress) {
        this.officeAddress = officeAddress;
    }*/

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", joinedDate=" + joinedDate +
                ", listOfAddresses=" + listOfAddresses +
                '}';
    }
}
