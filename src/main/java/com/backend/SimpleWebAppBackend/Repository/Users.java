package com.backend.SimpleWebAppBackend.Repository;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Users {



      @Id
    private String email;

    private String Fname;

    private String Lname;

    private String mob_num;

//    @Temporal(TemporalType.TIMESTAMP)
//    @Temporal(TemporalType.TIMESTAMP)
//@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")

    private String curdate;
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")

//    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date date;

        @Column(length = 50)
    private  String Address;

    public String getCurdate() {
        return curdate;
    }

    public void setCurdate(String curdate) {
        this.curdate = curdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public String getMob_num() {
        return mob_num;
    }

    public void setMob_num(String mob_num) {
        this.mob_num = mob_num;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}

