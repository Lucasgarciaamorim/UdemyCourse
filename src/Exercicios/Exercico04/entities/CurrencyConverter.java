package Exercicios.Exercico04.entities;

public class CurrencyConverter {

    public static final double IOF = 6;


    public static double calculatorDollar(double dollarPrice, double dollarQuant) {
        return (dollarPrice * dollarQuant) + (IOF / 100 * dollarPrice * dollarQuant);

    }


}

