package Seção8.Aula64.Triangle.application;

import Seção8.Aula64.Triangle.entities.Triangle;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Triangle x, y;

        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %4f%n", areaX);
        System.out.printf("Triangle Y area: %4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Largest Area X");
        } else
            System.out.println("Largest Area Y");
        scanner.close();

    }
}
