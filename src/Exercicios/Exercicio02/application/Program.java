package Exercicios.Exercicio02.application;

import Exercicios.Exercicio02.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();


        System.out.println("Name: ");
        employee.name = sc.nextLine();

        System.out.println("Gross salary:  ");
        employee.grossSalary = sc.nextDouble();

        System.out.println("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println("Employee:" + employee);
        System.out.println("Witch percentage to increase salary?");
        double percentage = sc.nextDouble();

        employee.IncreaseSalary(percentage);

        System.out.println();
        System.out.println("Updated Data:" + employee);
        sc.close();


    }
}
