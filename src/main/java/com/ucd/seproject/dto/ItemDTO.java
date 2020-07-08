package com.ucd.seproject.dto;

public class ItemDTO {

    private String item_id;
    private String item_name;
    private int item_quantity;
    private double item_price;
    private int item_weight;
    private String item_supplier;
    private String item_location;
    private int item_size;

    public ItemDTO(String item_id, String item_name, int item_quantity, double item_price, int item_weight, String item_supplier, String item_location, int item_size) {
        this.item_id = item_id;
        this.item_name = item_name;
        this.item_quantity = item_quantity;
        this.item_price = item_price;
        this.item_weight = item_weight;
        this.item_supplier = item_supplier;
        this.item_location = item_location;
        this.item_size = item_size;
    }

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

    public int getItem_quantity() {
        return item_quantity;
    }

    public void setItem_quantity(int item_quantity) {
        this.item_quantity = item_quantity;
    }

    public double getItem_price() {
        return item_price;
    }

    public void setItem_price(double item_price) {
        this.item_price = item_price;
    }

    public int getItem_weight() {
        return item_weight;
    }

    public void setItem_weight(int item_weight) {
        this.item_weight = item_weight;
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

    public int getItem_size() {
        return item_size;
    }

    public void setItem_size(int item_size) {
        this.item_size = item_size;
    }
}
