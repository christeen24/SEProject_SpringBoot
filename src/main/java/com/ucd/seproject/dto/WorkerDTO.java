package com.ucd.seproject.dto;

public class WorkerDTO {

    private String worker_id;
    private String worker_name;
    private String worker_address;
    private String worker_phone;
    private String worker_email;
    private String worker_dob;
    private int energy_level;
    private int capacity;
    private String location_id;

    public WorkerDTO(String worker_id, String worker_name, String worker_address, String worker_phone, String worker_email, String worker_dob, int energy_level, int capacity, String location_id) {
        this.worker_id = worker_id;
        this.worker_name = worker_name;
        this.worker_address = worker_address;
        this.worker_phone = worker_phone;
        this.worker_email = worker_email;
        this.worker_dob = worker_dob;
        this.energy_level = energy_level;
        this.capacity = capacity;
        this.location_id = location_id;
    }

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
