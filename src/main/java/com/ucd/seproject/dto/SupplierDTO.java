package com.ucd.seproject.dto;

public class SupplierDTO {

    private String supplier_id;
    private String supplier_name;
    private String item_id;

    public SupplierDTO(String supplier_id, String supplier_name, String item_id) {
        this.supplier_id = supplier_id;
        this.supplier_name = supplier_name;
        this.item_id = item_id;
    }

    public String getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(String supplier_id) {
        this.supplier_id = supplier_id;
    }

    public String getSupplier_name() {
        return supplier_name;
    }

    public void setSupplier_name(String supplier_name) {
        this.supplier_name = supplier_name;
    }

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }
}
