/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cac.pojo;

/**
 *
 * @author Tomas
 */
public class Orator {

    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String topic;

    // Constructor Vacio
    public Orator() {
    }

    // Constructor Completo con ID
    public Orator(int id, String firstname, String lastname, String email, String topic) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.topic = topic;
    }

    // Constructor Completo sin ID
    public Orator(String firstname, String lastname, String email, String topic) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.topic = topic;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
