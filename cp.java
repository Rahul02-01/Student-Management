package com.rahuljdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class cp {

    static Connection con;

    public static Connection cc() {
        try {
            // Loading the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Getting the connection
            String user = "root";
            String password = "rahul9062";
            String url = "jdbc:mysql://localhost:3306/student";
            con = DriverManager.getConnection(url,user,password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
