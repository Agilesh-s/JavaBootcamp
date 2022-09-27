package com.nest;

import com.hotel.Hotel;

import java.util.Scanner;

public class menuDriven {
    public static void main(String[] args) {
        System.out.println("Menu Driven");
        int choice;

        StudentsData studentsData = new StudentsData(07,250);
        StudentsData newStudentData = new StudentsData(10,500);

        while (true){
            System.out.println("Select an Option");
            System.out.println("1. Add Students");
            System.out.println("2. Search Students");
            System.out.println("3. Delete Students");
            System.out.println("4. View all Students");
            System.out.println("5. Exit");

            Scanner input = new Scanner(System.in);
            choice = input.nextInt();

            switch (choice){
                case 1 :
                    System.out.println("Add Student Selected");
                    break;
                case 2:
                    System.out.println("Search Student Selected");
                    break;
                case 3:
                    System.out.println("Delete Student");
                    break;
                case 4:
                    System.out.println("View All The Student");
                    break;
                case 5:
                    System.exit(0);
            }
        }

    }
}
