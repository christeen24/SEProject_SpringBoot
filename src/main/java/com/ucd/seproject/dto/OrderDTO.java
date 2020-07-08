package com.ucd.seproject.dto;

public class OrderDTO {

    private String order_id;
    private String customer_id;
    private int price;
    private int time;
    private String status;
    private String due_date;

    public OrderDTO(String order_id, String customer_id, int price, int time, String status, String due_date) {
        this.order_id = order_id;
        this.customer_id = customer_id;
        this.price = price;
        this.time = time;
        this.status = status;
        this.due_date = due_date;
    }

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
