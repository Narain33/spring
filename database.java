package com.project.SpringAngular;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.stereotype.Component;

@Entity
@Data
@Table(name="user")
@Component
public class database {

    @Id
    @Column(name="Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="user")
    private String user;

    public Long getId() {
        return id;
    }

    @Column(name="password")
    private String password;
    @Column(name="email")
    private String email;

    @Column(name="cpass")
    private  String cpass;
    @Column(name="age")
    private String age;
    @Column(name="bio")
    private String bio;

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpass() {
        return cpass;
    }

    public void setCpass(String cpass) {
        this.cpass = cpass;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getIntrest() {
        return intrest;
    }

    public void setIntrest(String intrest) {
        this.intrest = intrest;
    }

    @Column(name="intrest")
    private String  intrest;


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
