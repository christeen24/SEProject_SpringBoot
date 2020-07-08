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
@Table(name = "order",schema = "werewolves")
public class Order {

    @Column(name = "order_id")
    private String order_id;
    @Column(name = "customer_id")
    private String customer_id;
    @Column(name = "price")
    private int price;
    @Column(name = "time")
    private int time;
    @Column(name = "status")
    private String status;
    @Column(name = "due_date")
    private String due_date;

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDue_date() {
        return due_date;
    }

    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }
}
