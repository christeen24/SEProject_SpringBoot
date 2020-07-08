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
@Table(name = "item",schema = "werewolves")
public class Item extends AbstractEntity{

    @Column(name = "item_id")
    private String item_id;
    @Column(name = "item_name")
    private String item_name;
    @Column(name = "item_quantity")
    private int item_quantity;
    @Column(name = "item_price")
    private double item_price;
    @Column(name = "item_weight")
    private int item_weight;
    @Column(name = "item_supplier")
    private String item_supplier;
    @Column(name = "item_location")
    private String item_location;
    @Column(name = "item_size")
    private int item_size;

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getItem_supplier() {
        return item_supplier;
    }

    public void setItem_supplier(String item_supplier) {
        this.item_supplier = item_supplier;
    }

    public String getItem_location() {
        return item_location;
    }

    public void setItem_location(String item_location) {
        this.item_location = item_location;
    }

    public void setItem_quantity(int item_quantity) {
        this.item_quantity = item_quantity;
    }

    public int getItem_quantity() {
        return item_quantity;
    }

    public int getItem_weight() {
        return item_weight;
    }

    public double getItem_price() {
        return item_price;
    }

    public void setItem_price(double item_price) {
        this.item_price = item_price;
    }

    public void setItem_weight(int item_weight) {
        this.item_weight = item_weight;
    }

    public int getItem_size() {
        return item_size;
    }

    public void setItem_size(int item_size) {
        this.item_size = item_size;
    }
}
