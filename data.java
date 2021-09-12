package com.rahuljdbc;

import java.sql.*;
import java.util.Scanner;

public class data {

    // Insertion of data...
    public static boolean entry(details d){
        boolean b = false;
        try{
            // Created a connection
            Connection con = cp.cc();

            // Query statement (Dynamic Query)
            String q = "insert into student_data(name,city,ph_num) values (?,?,?)";

            // Prepared Statement
            PreparedStatement p = con.prepareStatement(q);

            // Set the values
            p.setString(1, d.getName());
            p.setString(2, d.getCity());
            p.setString(3, d.getPh_num());

            // Execution
            p.executeUpdate();
            b = true;
        }catch (Exception e)
        {
            System.out.println("\nNot Working...");
        }
        return b;
    }

    // Deletion of data...
    public static boolean delete(int di){
            boolean b = false;
            try {
                // Created a connection
                Connection con = cp.cc();

                // Query statement (Dynamic Query)
                String q = "delete from student_data where id=?";

                // Prepare statements
                PreparedStatement k = con.prepareStatement(q);

                // Set the value
                k.setInt(1,di);

                // Execution
                k.executeUpdate();
                b = true;
            } catch (Exception e) {
                System.out.println("\nNot Working...");
            }
            return b;
    }

    // Display of data....
    public static void display() {
        Connection con = cp.cc();

        // Query statement(Static Query)
        String q = "select * from student_data;";

        try {
            // Statement..
            Statement s = con.createStatement();
            ResultSet r = s.executeQuery(q);
            while (r.next()){
                // Getting the data..
                int id = r.getInt("id");
                String name = r.getString("name");
                String city = r.getString("city");
                String ph_num = r.getString("ph_num");

                // Printing the data
                System.out.println("ID:"+id);
                System.out.println("Name:"+name);
                System.out.println("City:"+city);
                System.out.println("Phone number:"+ph_num);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Update..
    public static boolean update(int uid){
        boolean b = false;
        Connection con = cp.cc();

        // Query(Dynamic Query)...
        String q = "update student_data set name='Luffy' where id=?";

        try {
            // Prepare Statement..
            PreparedStatement p = con.prepareStatement(q);

            // Set the values...
            p.setInt(1, uid);

            // Updating the table...
            p.executeUpdate();
            b=true;
        }
        catch (Exception e) {
            System.out.println("Error occured...Couldn't update the changes");
        }
        return b;
    }
}
