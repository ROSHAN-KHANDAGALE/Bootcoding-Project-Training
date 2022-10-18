package com.online.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class OrderDAO {
    public static final String TABLE_NAME = "app_orderDAO";
    public void crateTable(){
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","root#123");
            Statement stmt = con.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME
                    + " (id bigint NULL, " +
                    " deliveryaddress varchar, " +
                    " customer_id bigint, " +
                    " vendor_id bigint," +
                    " order_date timestamp, " +
                    " status text, " +
                    " totalamount decimal, " +
                    " CONSTRAINT app_orderDAO_pk PRIMARY KEY (id)) ";
            stmt.executeUpdate(sql);
            System.out.println("CREATE TABLE QUERY : "+sql);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}