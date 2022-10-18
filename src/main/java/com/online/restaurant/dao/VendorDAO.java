package com.online.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class VendorDAO {
    public static final String TABLE_NAME = "app_vendor";

    public void crateTable() {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "root#123");
            Statement stmt = con.createStatement();
            String query = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME
                    + " (id bigint NOT NULL, " +
                    " name text, " +
                    " address text, " +
                    " emailid text, " +
                    " phoneno bigint, " +
                    " city text, " +
                    " state text, " +
                    " pure_veg bool, " +
                    " category text, " +
                    " rating numeric, " +
                    " CONSTRAINT app_vendor_pk PRIMARY KEY (id))";
            System.out.println("Create Table Query : " +query);
            stmt.executeUpdate(query);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
