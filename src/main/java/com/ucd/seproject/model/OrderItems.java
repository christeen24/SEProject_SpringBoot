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
@Table(name = "orderItems",schema = "werewolves")
public class OrderItems {

    @Column(name = "order_id")
    private String order_id;
    @Column(name = "item_id")
    private String item_id;
    @Column(name = "customer_id")
    private String customer_id;
    @Column(name = "item_name")
    private String item_name;
    @Column(name = "quantity_per_order")
    private int quantity_per_order;
    @Column(name = "supplier_id")
    private String supplier_id;

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public int getQuantity_per_order() {
        return quantity_per_order;
    }

    public void setQuantity_per_order(int quantity_per_order) {
        this.quantity_per_order = quantity_per_order;
    }

    public String getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(String supplier_id) {
        this.supplier_id = supplier_id;
    }
}
