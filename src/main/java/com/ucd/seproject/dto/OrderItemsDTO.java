package com.ucd.seproject.dto;

public class OrderItemsDTO {

    private String order_id;
    private String item_id;
    private String customer_id;
    private String item_name;
    private int quantity_per_order;
    private String supplier_id;

    public OrderItemsDTO(String order_id, String item_id, String customer_id, String item_name, int quantity_per_order, String supplier_id) {
        this.order_id = order_id;
        this.item_id = item_id;
        this.customer_id = customer_id;
        this.item_name = item_name;
        this.quantity_per_order = quantity_per_order;
        this.supplier_id = supplier_id;
    }

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
