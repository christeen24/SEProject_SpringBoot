package com.ucd.seproject.model;


import org.dom4j.tree.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by christeen on 08/07/2020.
 * Customer module for customer table
 */

@Entity
@Table(name = "worker",schema = "werewolves")

public class Worker extends AbstractEntity {

    @Column(name = "worker_id")
    private String worker_id;
    @Column(name = "worker_name")
    private String worker_name;
    @Column(name = "worker_address")
    private String worker_address;
    @Column(name = "worker_phone")
    private String worker_phone;
    @Column(name = "worker_email")
    private String worker_email;
    @Column(name = "worker_dob")
    private String worker_dob;
    @Column(name = "energy_level")
    private int energy_level;
    @Column(name = "capacity")
    private int capacity;
    @Column(name = "location_id")
    private String location_id;

    public String getWorker_id() {
        return worker_id;
    }

    public void setWorker_id(String worker_id) {
        this.worker_id = worker_id;
    }

    public String getWorker_name() {
        return worker_name;
    }

    public void setWorker_name(String worker_name) {
        this.worker_name = worker_name;
    }

    public String getWorker_address() {
        return worker_address;
    }

    public void setWorker_address(String worker_address) {
        this.worker_address = worker_address;
    }

    public String getWorker_phone() {
        return worker_phone;
    }

    public void setWorker_phone(String worker_phone) {
        this.worker_phone = worker_phone;
    }

    public String getWorker_email() {
        return worker_email;
    }

    public void setWorker_email(String worker_email) {
        this.worker_email = worker_email;
    }

    public String getWorker_dob() {
        return worker_dob;
    }

    public void setWorker_dob(String worker_dob) {
        this.worker_dob = worker_dob;
    }

    public int getEnergy_level() {
        return energy_level;
    }

    public void setEnergy_level(int energy_level) {
        this.energy_level = energy_level;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getLocation_id() {
        return location_id;
    }

    public void setLocation_id(String location_id) {
        this.location_id = location_id;
    }
}
