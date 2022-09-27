package com.FoodItems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Food {
        public static void main(String[] args) {
            int choice, choice1, invoice, quantity, total = 0;
            String customerName;

            Scanner input = new Scanner(System.in);
            Random random = new Random();

            FoodItems foodItems = new FoodItems(15,10,20,29);
            FoodItems takeaway = new FoodItems(20,15,28,35);

            ArrayList<String> foodName = new ArrayList<>();
            ArrayList<Integer> totalQuantity = new ArrayList<>();
            ArrayList<Integer>  totalPrice = new ArrayList<>();

            HashMap<String,String> accountInformation = new HashMap<>();
            ArrayList<String> transactionList = new ArrayList<>();


            while (true){
                System.out.println("Select an option: ");
                System.out.println("1. Dine In");
                System.out.println("2. Takeaway");
                System.out.println("3. Transaction details");
                System.out.println("4. Exit");
                choice = input.nextInt();

                switch (choice){
                    case 1 :
                        System.out.println("Select an Option");
                        System.out.println("1. Coffee " + " Price = "+foodItems.getCoffee());
                        System.out.println("2. Tea " + " Price = "+foodItems.getTea());
                        System.out.println("3. Idly " + " Price = "+foodItems.getIdly());
                        System.out.println("4. Dosa " + " Price = "+foodItems.getDosa());
                        System.out.println("5. Generate Bill");
                        System.out.println("6. Exit");
                        choice1 = input.nextInt();
                        switch (choice1){
                            case 1:
                                System.out.print("Enter the Quantity: ");
                                quantity = input.nextInt();
                                totalQuantity.add(quantity);
                                foodName.add("Coffee");
                                totalPrice.add(15);
                                total += quantity * foodItems.getCoffee();
                                break;
                            case 2:
                                System.out.print("Enter the Quantity: ");
                                quantity = input.nextInt();
                                totalQuantity.add(quantity);
                                foodName.add("Tea");
                                totalPrice.add(10);
                                total += quantity * foodItems.getTea();
                                break;
                            case 3:
                                System.out.print("Enter the Quantity: ");
                                quantity = input.nextInt();
                                totalQuantity.add(quantity);
                                foodName.add("Idly");
                                totalPrice.add(20);
                                total += quantity * foodItems.getIdly();
                                break;
                            case 4:
                                System.out.print("Enter the Quantity: ");
                                quantity = input.nextInt();
                                totalQuantity.add(quantity);
                                foodName.add("Dosa");
                                totalPrice.add(29);
                                total += quantity * foodItems.getDosa();
                                break;
                            case 5:
                                System.out.print("Enter your name: ");
                                customerName = input.next();
                                invoice = random.nextInt(1000);
                                for (int i = 0; i<foodName.size();i++){
                                    System.out.println(foodName.get(i) + " "+ totalPrice.get(i) + " x " + totalQuantity.get(i) );
                                }
                                System.out.println("Total Bill: " + total);
                                totalPrice.clear();
                                totalQuantity.clear();
                                foodName.clear();

                                accountInformation.put("Name", customerName);
                                accountInformation.put("TotalAmount", String.valueOf(total));
                                accountInformation.put("Mode", "DineIn");
                                accountInformation.put("Invoice Number", String.valueOf(invoice));
                                transactionList.add(String.valueOf(accountInformation));
                                total=0;
                                break;
                            case 6:
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Enter a valid number");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("Select an Option");
                        System.out.println("1. Coffee " + " Price = "+takeaway.getCoffee());
                        System.out.println("2. Tea " + " Price = "+takeaway.getTea());
                        System.out.println("3. Idly " + " Price = "+takeaway.getIdly());
                        System.out.println("4. Dosa " + " Price = "+takeaway.getDosa());
                        System.out.println("5. Generate Bill");
                        System.out.println("6. Exit");
                        choice1 = input.nextInt();
                        switch (choice1) {
                            case 1:
                                System.out.print("Enter the Quantity: ");
                                quantity = input.nextInt();
                                totalQuantity.add(quantity);
                                foodName.add("Coffee");
                                totalPrice.add(20);
                                total += quantity * takeaway.getCoffee();
                                break;
                            case 2:
                                System.out.print("Enter the Quantity: ");
                                quantity = input.nextInt();
                                totalQuantity.add(quantity);
                                foodName.add("Tea");
                                totalPrice.add(15);
                                total += quantity * takeaway.getTea();
                                break;
                            case 3:
                                System.out.print("Enter the Quantity: ");
                                quantity = input.nextInt();
                                totalQuantity.add(quantity);
                                foodName.add("Idly");
                                totalPrice.add(28);
                                total += quantity * takeaway.getIdly();
                                break;
                            case 4:
                                System.out.print("Enter the Quantity: ");
                                quantity = input.nextInt();
                                totalQuantity.add(quantity);
                                foodName.add("Dosa");
                                totalPrice.add(35);
                                total += quantity * takeaway.getDosa();
                                break;
                            case 5:
                                System.out.print("Enter your name: ");
                                customerName = input.next();
                                invoice = random.nextInt(1000);
                                for (int i = 0; i<foodName.size();i++){
                                    System.out.println(foodName.get(i) + " "+ totalPrice.get(i) + " x " + totalQuantity.get(i) );
                                }
                                System.out.println("Total Bill: " + total);
                                totalPrice.clear();
                                totalQuantity.clear();
                                foodName.clear();

                                accountInformation.put("Name ", customerName);
                                accountInformation.put("TotalAmount ", String.valueOf(total));
                                accountInformation.put("Mode ", "TakeAway");
                                accountInformation.put("InvoiceNumber ", String.valueOf(invoice));
                                transactionList.add(String.valueOf(accountInformation));
                                total=0;
                                break;
                            case 6:
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Enter a valid number");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println(transactionList);
                        break;
                    case 4:
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Enter a valid number");
                        break;
                }
            }

        }
}