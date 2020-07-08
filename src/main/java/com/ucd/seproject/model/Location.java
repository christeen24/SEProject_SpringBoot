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
@Table(name = "location",schema = "werewolves")
public class Location {

    @Column(name = "shelf_id")
    private String shelf_id;
    @Column(name = "aisle_id")
    private String aisle_id;
    @Column(name = "section_id")
    private String section_id;
    @Column(name = "item_id")
    private String item_id;
    @Column(name = "location_id")
    private String location_id;

    public String getShelf_id() {
        return shelf_id;
    }

    public void setShelf_id(String shelf_id) {
        this.shelf_id = shelf_id;
    }

    public String getAisle_id() {
        return aisle_id;
    }

    public void setAisle_id(String aisle_id) {
        this.aisle_id = aisle_id;
    }

    public String getSection_id() {
        return section_id;
    }

    public void setSection_id(String section_id) {
        this.section_id = section_id;
    }

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }

    public String getLocation_id() {
        return location_id;
    }

    public void setLocation_id(String location_id) {
        this.location_id = location_id;
    }
}
