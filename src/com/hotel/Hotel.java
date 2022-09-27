package com.hotel;

import java.util.Scanner;

public class Hotel {
    static int total=0;
    public static void main(String[] args) {

        int y;

        Scanner s=new Scanner(System.in);
        while (true) {
            System.out.println("enter the choice");
            System.out.println("1.Tea 10$");
            System.out.println("2.juice 30$");
            System.out.println("3.cake 35$");
            System.out.println("4.Pizza 15$");
            System.out.println("5.ice cream 35$");
            System.out.println("6.BILL");
            System.out.println("7.exit");
            y=s.nextInt();

            switch (y) {
                case 1:
                    System.out.println("how many quantity");

                case 3:
                    System.out.println("how many quantity");
                    int m = s.nextInt();
                    total = (10 * m) + total;
                    break;
                case 2:
                    System.out.println("how many quantity");
                    int n = s.nextInt();
                    total = (30 * n) + total;
                    break;
                case 4:
                    System.out.println("how many quantity");
                    int l = s.nextInt();
                    total = (15 * l) + total;
                    break;
                case 5:
                    System.out.println("how many quantity");
                    int p = s.nextInt();
                    total = (35 * p) + total;
                    break;
                case 6:System.out.println("total bill="+total);
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid input");
            }
        }

    }

    public static class FoodItems {
            Integer Coffee;
            Integer Tea;
            Integer Idly;
            Integer Dosa;

            //Constructor
            public FoodItems(Integer coffee, Integer tea, Integer idly, Integer dosa) {
                Coffee = coffee;
                Tea = tea;
                Idly = idly;
                Dosa = dosa;
            }

            //Getters and Setters
            public Integer getCoffee() {
                return Coffee;
            }

            public void setCoffee(Integer coffee) {
                Coffee = coffee;
            }

            public Integer getTea() {
                return Tea;
            }

            public void setTea(Integer tea) {
                Tea = tea;
            }

            public Integer getIdly() {
                return Idly;
            }

            public void setIdly(Integer idly) {
                Idly = idly;
            }

            public Integer getDosa() {
                return Dosa;
            }

            public void setDosa(Integer dosa) {
                Dosa = dosa;
            }
    }
}