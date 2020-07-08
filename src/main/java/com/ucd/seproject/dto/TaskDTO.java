package com.ucd.seproject.dto;

public class TaskDTO {

    private String task_id;
    private String order_id;
    private String item_id;
    private int quantity_per_task;
    private String worker_id;
    private int weight;
    private String location_id;
    private int size;

    public TaskDTO(String task_id, String order_id, String item_id, int quantity_per_task, String worker_id, int weight, String location_id, int size) {
        this.task_id = task_id;
        this.order_id = order_id;
        this.item_id = item_id;
        this.quantity_per_task = quantity_per_task;
        this.worker_id = worker_id;
        this.weight = weight;
        this.location_id = location_id;
        this.size = size;
    }

    public String getTask_id() {
        return task_id;
    }

    public void setTask_id(String task_id) {
        this.task_id = task_id;
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

    public int getQuantity_per_task() {
        return quantity_per_task;
    }

    public void setQuantity_per_task(int quantity_per_task) {
        this.quantity_per_task = quantity_per_task;
    }

    public String getWorker_id() {
        return worker_id;
    }

    public void setWorker_id(String worker_id) {
        this.worker_id = worker_id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getLocation_id() {
        return location_id;
    }

    public void setLocation_id(String location_id) {
        this.location_id = location_id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
