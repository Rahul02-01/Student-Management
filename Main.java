package com.rahuljdbc;
import java.sql.Connection;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("\nWelcome to the Student management....");
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Press\n 1.Add Student\n" +
                    "2. Display database\n" +
                    "3. Delete Student account\n" +
                    "4. Update Student details\n" +
                            "5. Exit");
            System.out.printf("\nEnter the choice= ");
            int ch = sc.nextInt();

            if (ch == 1) {

                // Add students....

                System.out.println("\nEnter the name: ");
                String name = sc.nextLine();
                name+=sc.nextLine();

                System.out.println("\nEnter the city: ");
                String city = sc.nextLine();
                //city+=sc.nextLine();

                System.out.println("\nEnter the phone number: ");
                String ph_num = sc.next();

                details det = new details(name,city,ph_num);
                boolean k = data.entry(det);
                if (k == false)
                {
                    System.out.println("\nFailed");
                }
                else {
                    System.out.println("\nSuccessful");
                }
            }
            else if (ch == 2) {

                //Display students
                System.out.println("\nThe entire data stock---->");
                data.display();

            }
            else if (ch == 3) {

                // Delete student

                System.out.println("\nEnter the id to be deleted=");
                int di = sc.nextInt();
                boolean k = data.delete(di);
                if (k)
                {
                    System.out.println("\nThe data has been deleted...");
                }
                else {
                    System.out.println("\nSorry something went wrong...");
                }

            }
            else if (ch == 4){
                System.out.println("\nEnter the id of the student to be updated:");
                int uid = sc.nextInt();
                boolean j = data.update(uid);
                if(j){
                    System.out.println("\nData successfully updated");
                }
                else {
                    System.out.println("\nSorry...Couldn't update the changes...");
                }
            }
            else if (ch == 5) {
                System.out.println("\nTHANK YOU FOR USING OUR SYSTEM...");
                System.out.println("\nHOPE TO SEE YOU SOON....");
                break;
            }
            else {
                System.out.println("\nEnter the correct number to use the system!!!");
            }
        } while (true);
    }
}
