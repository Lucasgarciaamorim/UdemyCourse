package Exercicios.Exercicio05.application;

import Exercicios.Exercicio05.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        //correção

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        System.out.println("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.println("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        if (response == 'y') {
            System.out.println("Enter initial deposit value:");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        } else {
            account = new Account(number, holder);
        }
        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(account);


        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(account);


        //como eu fiz
//
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter account number: ");
//        int number = sc.nextInt();
//
//        System.out.println("Enter account holder: ");
//        sc.nextLine();
//        String holder = sc.nextLine();
//
//        System.out.println("Is there an initial deposit (y/n)? ");
//        char response = sc.next().charAt(0);
//
//        if(response == 'y'){
//            System.out.println("Enter initial deposit value:");
//
//        }
//
//        Account account = new Account();
//
//
//        account.setAccountNumber(sc.nextInt());
//
//
//        account.setAccountName(sc.next());
//
//
//        String confirmDeposit = sc.next();
//        switch (confirmDeposit) {
//            case "y":
//
//                account.setBalance(sc.nextInt());
//                break;
//
//            case "n":
//                System.out.println("n");
//                break;
//
//            default:
//        }
//        System.out.println("Account data: ");
//        System.out.println();
//        System.out.println("Account " + account.getAccountNumber() + ", " + "Holder:" + account.getAccountName() + ", " + "Balance: $" + account.getBalance());
//
//        System.out.println("Enter a deposit value: ");
//        account.deposit(sc.nextInt());
//
//        System.out.println("Account " + account.getAccountNumber() + ", " + "Holder:" + account.getAccountName() + ", " + "Balance: $" + account.getBalance());
//
//        System.out.println("Enter a withdraw value: ");
//        account.withdraw(sc.nextInt());
//
//        System.out.println("Account " + account.getAccountNumber() + ", " + "Holder:" + account.getAccountName() + ", " + "Balance: $" + account.getBalance());
//
//
//        sc.close();
    }
}
