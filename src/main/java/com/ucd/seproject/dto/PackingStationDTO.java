package com.ucd.seproject.dto;

public class PackingStationDTO {

    private String location_id;
    private String worker_id;

    public PackingStationDTO(String location_id, String worker_id) {
        this.location_id = location_id;
        this.worker_id = worker_id;
    }

    public String getLocation_id() {
        return location_id;
    }

    public void setLocation_id(String location_id) {
        this.location_id = location_id;
    }

    public String getWorker_id() {
        return worker_id;
    }

    public void setWorker_id(String worker_id) {
        this.worker_id = worker_id;
    }
}
