package Exercicios.Exercicio06;



import java.util.Locale;
import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Quantos numeros voce vai digitar?");
        n = sc.nextInt();

        int[] numbers = new int[n];


        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            numbers[i] = sc.nextInt();
        }
        System.out.println("NUMEROS NEGATIVOS");


        for (int i = 0; i < n; i++) {
            if (numbers[i] < 0) {
                System.out.println(numbers[i]);
            }
        }

    }


}

