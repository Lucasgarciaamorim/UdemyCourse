package Exercicios.Exercicio03.application;

import Exercicios.Exercicio03.entities.Estudent;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Estudent estudent = new Estudent();

        System.out.println("Name: ");
        estudent.name = sc.nextLine();

        System.out.println("Grade: ");
        estudent.grade1 = sc.nextDouble();
        estudent.grade2 = sc.nextDouble();
        estudent.grade3 = sc.nextDouble();

        System.out.printf("FINAL GRADE %.2f%n", estudent.finalGrade());

        if (estudent.finalGrade() < 60) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", estudent.missingPoint());
        } else {
            System.out.println("PASS");

        }
        sc.close();
    }

}
