package Exercicios.Exercicio01.application;

import Exercicios.Exercicio01.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {

        Rectangle x;
        x = new Rectangle();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter rectangle width and height");

        System.out.println("Height:");
        x.Height = sc.nextDouble();

        System.out.println("Width:");
        x.Width = sc.nextDouble();

        System.out.printf("AREA = %.2f", +x.Area());
        System.out.println();

        System.out.printf("PERIMETER = %.2f", x.Perimeter());
        System.out.println();

        System.out.printf("DIAGONAL = %.2f", x.Diagonal());

        sc.close();
    }
}
