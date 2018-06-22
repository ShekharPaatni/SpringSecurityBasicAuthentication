package com.security.basic.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@Getter
@Setter
public class User {
    @Id
    private String id;
    private String userName;
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date created_date;
    private String status;

    public User(String id, String userName, Date created_date, String status) {
        this.id = id;
        this.userName = userName;
        this.created_date = created_date;
        this.status = status;
    }

    public User() {
    }
}
