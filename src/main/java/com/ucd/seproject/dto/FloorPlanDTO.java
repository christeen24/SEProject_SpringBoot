package com.ucd.seproject.dto;

public class FloorPlanDTO {

    private String shelves;
    private String sections;
    private String aisles;

    public FloorPlanDTO(String shelves, String sections, String aisles) {
        this.shelves = shelves;
        this.sections = sections;
        this.aisles = aisles;
    }

    public String getShelves() {
        return shelves;
    }

    public void setShelves(String shelves) {
        this.shelves = shelves;
    }

    public String getSections() {
        return sections;
    }

    public void setSections(String sections) {
        this.sections = sections;
    }

    public String getAisles() {
        return aisles;
    }

    public void setAisles(String aisles) {
        this.aisles = aisles;
    }
}
