package org.challenges.hibernatebasics.dto;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "users")
public class Users {

    @Id
    @Column(name = "user_id")
    private int userId;

    @Column(name = "user_name")
    private String username;

    @Column(name = "joined_date")
    @Temporal(TemporalType.DATE)
    private Date joinedDate;

    private String address;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
