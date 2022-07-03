package Lesson_4;

import java.io.IOException;
import java.util.Scanner;

public class Payment2 {
    private String name;
    private int cost;
    private Product[] prodArray;

    public Payment2() {
        //super();
        this.name = "";
        this.cost = 0;
    }

    public Payment2(String name) {
        //super();
        this.name = name;
    }

    private class Product {         //начало внутреннего класса
        private String productName;
        private int productCost;

        public Product() {
            //super();
            productName = "";
            productCost = 0;
        }

        public Product(String productName, int productCost) {
            //super();
            this.productName = productName;
            this.productCost = productCost;
        }

        //public String getProductName() {
            //return productName;
        //}

        //public int getProductCost() {
            //return productCost;
        //}
    }                                 //КОНЕЦ внутреннего класса

    public void setPayment2() throws IOException {
        //cost = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите приобретаемое количество товаров: ");

        try {
            int a = sc.nextInt();
            prodArray = new Product[a];
            for (int i = 0; i < a; i++) {
                System.out.println("Товар " + (i + 1) + ":");
                System.out.print("Наименование товара: ");
                String b = sc.next();
                System.out.print("Цена: ");
                int c = sc.nextInt();
                prodArray[i] = new Product(b,c);
                this.cost = this.cost + prodArray[i].productCost;
            }
        }
        catch(NumberFormatException e) {
            System.out.print("Неверный формат");
        }
        catch(NegativeArraySizeException e) {
            System.out.print("Размерность массива не может быть <0");
        }
        catch(NullPointerException e) {
            System.out.println();
            System.out.println("Массив не создан");
        }
    }

    public void printCheque() throws IOException {
        try {
            if (prodArray.length != 0) {
                System.out.println("========================================");
                System.out.println("            " + name);
                System.out.println("========================================");
                for (int i = 0; i < prodArray.length; i ++) {
                    System.out.printf("%10d", i+1);
                    System.out.printf("%15s",prodArray[i].productName);
                    System.out.printf("%10d",prodArray[i].productCost);
                    System.out.println();
                }
                System.out.println("========================================");
                System.out.println("Общая стоимость: ");
                System.out.printf("%10d",cost);
                System.out.println();
                System.out.println("========================================");
            }
            else {
                System.out.println();
                System.out.println("Массив не создан");
            }
        }
        catch (NullPointerException e) {
            System.out.println();
            System.out.println("Массив не создан");
        }
    }

}
