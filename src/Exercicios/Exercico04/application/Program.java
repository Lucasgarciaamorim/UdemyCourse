package Exercicios.Exercico04.application;

import Exercicios.Exercico04.entities.CurrencyConverter;
import IntroduçãoAProgramaçãoOrientadaAObjetos.Aula71.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();

        System.out.println("How many dollars will be bought? ");
        double dollarQuant = sc.nextDouble();

        double paidReais = CurrencyConverter.calculatorDollar(dollarPrice, dollarQuant);

        System.out.printf("Amount to be paid in reais = $ %.2f%n", paidReais);

    }
}
