package com.online.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CustomerDAO {
    public static final String TABLE_NAME =  "app_customer";

    public void createTable() {
        try{
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres","postgres","root#123");
            Statement stmt = con.createStatement();
            //String sql = "Select * from " + TABLE_NAME;
            String query = "CREATE TABLE IF NOT EXISTS "+ TABLE_NAME
                    + " ( id bigint NOT NULL, " +
                    " name text, " +
                    " address text, " +
                    " phoneno bigint , " +
                    " city text , " +
                    " state text , " +
                    " emailid text, " +
                    " CONSTRAINT app_customer_pk PRIMARY KEY (id))";
            System.out.println("Create Table Query : " +query);
            stmt.executeUpdate(query);

        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
