package com.online.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OrderMenuItemDAO {
    public static final String TABLE_NAME = "app_order_menu_item";
    public void crateTable(){
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","root#123");
            Statement stmt = con.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME
                    + " (id bigint NOT NULL, " +
                    " orderid bigint, " +
                    " quantity int, " +
                    " is_veg bool, " +
                    " menu_item_name text, " +
                    " total_price decimal, " +
                    " CONSTRAINT app_order_menu_items_pk PRIMARY KEY (id)) ";
            stmt.executeUpdate(sql);
            System.out.println("Create Table Query : " + sql);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
