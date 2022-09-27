package com.employees;

import java.util.ArrayList;
import java.util.Scanner;

public class employee {
    public static void main(String[] args) {
        int choice;
        String empName;
        Scanner input = new Scanner(System.in);
        ArrayList<String> empList = new ArrayList<>();
        while(true){

            System.out.println("Select any choice");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employee");
            System.out.println("3. Exit");


            choice = input.nextInt();


            switch (choice){
                case 1:
                    System.out.print("Enter a Employee name: ");
                    empName = input.next();
                    empList.add(empName);
                    break;
                case 2:
                    if(empList.size()==0){
                        System.out.println("No Employees Added");
                    } else{
                        System.out.println(empList);
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }
    }
}
