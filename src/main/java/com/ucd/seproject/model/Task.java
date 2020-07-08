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
@Table(name = "task",schema = "werewolves")
public class Task extends AbstractEntity {

    @Column(name = "task_id")
    private String task_id;
    @Column(name = "order_id")
    private String order_id;
    @Column(name = "item_id")
    private String item_id;
    @Column(name = "quantity_per_task")
    private int quantity_per_task;
    @Column(name = "worker_id")
    private String worker_id;
    @Column(name = "weight")
    private int weight;
    @Column(name = "location_id")
    private String location_id;
    @Column(name = "size")
    private int size;

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
