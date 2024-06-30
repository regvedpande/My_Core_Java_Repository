package com.mkpits;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo {
    
    public static void main(String[] args) {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql//localhost:3306/employee", "root", "root");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from employees");


            while (rs.next()) {
                System.out.println(rs.getInt(1) + rs.getString(2) + rs.getString(3));
            }

            conn.close();
            
        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
