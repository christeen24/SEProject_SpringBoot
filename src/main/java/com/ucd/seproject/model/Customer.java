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
@Table(name = "customer",schema = "werewolves")
public class Customer extends AbstractEntity {

    @Column(name = "customer_id")
    private String customer_id;
    @Column(name = "customer_name")
    private String customer_name;
    @Column(name = "customer_address")
    private String customer_address;
    @Column(name = "customer_phone")
    private String customer_phone;
    @Column(name = "customer_email")
    private String customer_email;
    @Column(name = "customer_dob")
    private String customer_dob;

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }

    public String getCustomer_phone() {
        return customer_phone;
    }

    public void setCustomer_phone(String customer_phone) {
        this.customer_phone = customer_phone;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public String getCustomer_dob() {
        return customer_dob;
    }

    public void setCustomer_dob(String customer_dob) {
        this.customer_dob = customer_dob;
    }

}