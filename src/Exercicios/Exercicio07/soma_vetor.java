package Exercicios.Exercicio07;

import org.w3c.dom.ls.LSOutput;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double sum = 0;
        double avg = 0;

        System.out.println("Quantos numeros voce vai digitar?");
        n = sc.nextInt();
        double[] numbers = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero:");
            numbers[i] = sc.nextDouble();

        }
        System.out.print("VALORES: ");

        for (int i = 0; i < n; i++) {

            System.out.print(" " + numbers[i] + " ");
        }
        System.out.println();
        System.out.print("SOMA = ");
        for (int i = 0; i < n; i++) {

            sum += numbers[i];

        }
        System.out.printf("%.2f%n ", sum);


        System.out.print("MEDIA = ");
        for (int i = 0; i < n; i++) {

            avg = sum / numbers.length;

        }
        System.out.printf("%.2f%n ", avg);
    }


}


