package com.online.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Menu_ItemDAO {
    public static final String TABLE_NAME = "app_menu_item";
    public void crateTable(){
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","root#123");
            Statement stmt = con.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME
                    + " (id bigint NOT NULL, " +
                    " vendorid bigint, " +
                    " menu_item_name text, " +
                    " price numeric, " +
                    " category text, " +
                    " is_veg bool, " +
                    " CONSTRAINT app_menu_items_pk PRIMARY KEY (id)) ";
            stmt.executeUpdate(sql);
            System.out.println("Create Table Query : " + sql);

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
