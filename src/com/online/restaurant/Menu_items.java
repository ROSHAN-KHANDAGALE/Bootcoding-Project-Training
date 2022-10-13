package com.online.restaurant;

public class Menu_items {
    private long menuId;

    public long getMenuId() {
        return menuId;
    }

    public void setMenuId(long menuId) {
        this.menuId = menuId;
    }

    public String getMenuitems() {
        return menuitems;
    }

    public void setMenuitems(String menuitems) {
        this.menuitems = menuitems;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isIs_veg() {
        return is_veg;
    }

    public void setIs_veg(boolean is_veg) {
        this.is_veg = is_veg;
    }

    private String menuitems;
    private double price;
    private String category;
    private boolean is_veg;
}
