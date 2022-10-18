package com.online.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CustomerDAO {
    public static final String TABLE_NAME =  "customer";

    public void createTable() {
        try{
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres","postgres","root#123");
            Statement stmt = con.createStatement();
            String sql = "Select * from " + TABLE_NAME;
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                System.out.println("Name =" + rs.getString("name"));
                System.out.println("Address =" + rs.getString("address"));
                System.out.println("Mobile_No =" + rs.getString("phoneno"));
                System.out.println("City =" + rs.getString("city"));
                System.out.println("State =" + rs.getString("state"));
                System.out.println("EMail ID =" + rs.getString("emailid"));


            }
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
