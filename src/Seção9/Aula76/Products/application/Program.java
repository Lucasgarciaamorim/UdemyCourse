package Seção9.Aula76.Products.application;

import Seção9.Aula76.Products.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Product Data: ");

        System.out.println("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.println("Quantity in Stock: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);
        System.out.println();
        System.out.println("Product data:" + product);

        System.out.println("Enter the number of products to be added in stock:");
        quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data " + product);

        System.out.println("Product data:" + product);
        System.out.println("Enter the number of products to be remove in stock:");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data " + product);


        sc.close();
    }
}
