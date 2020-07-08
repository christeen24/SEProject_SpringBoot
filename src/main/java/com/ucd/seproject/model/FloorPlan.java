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
@Table(name = "floorPlan",schema = "werewolves")
public class FloorPlan extends AbstractEntity {

    @Column(name = "shelves")
    private String shelves;
    @Column(name = "sections")
    private String sections;
    @Column(name = "aisles")
    private String aisles;

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
