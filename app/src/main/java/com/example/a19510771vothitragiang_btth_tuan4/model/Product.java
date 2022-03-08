package com.example.a19510771vothitragiang_btth_tuan4.model;

public class Product {

    private int id;
    private String name;
    private String shop;

    public Product(int id, String name ,String shop){
        this.id = id;
        this.name = name;
        this.shop = shop;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }
}
