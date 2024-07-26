package Exercicios.Exercicio05.entities;

public class Account {

    //correção

        private int number;
        private String holder;
        private double balance;

        public Account(int number, String holder) {
            this.number = number;
            this.holder = holder;
        }

        public Account(int number, String holder, double initialDeposit) {
            this.number = number;
            this.holder = holder;
            deposit(initialDeposit);
        }

        public int getNumber() {
            return number;
        }

        public String getHolder() {
            return holder;
        }

        public void setHolder(String holder) {
            this.holder = holder;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public void withdraw(double amount) {
            balance -= amount + 5.0;
        }

        public String toString() {
            return "Account "
                    + number
                    + ", Holder: "
                    + holder
                    + ", Balance: $ "
                    + String.format("%.2f", balance);
        }
    }


    //como eu fiz
//
//    private int accountNumber;
//    private String accountHolder;
//    private double balance = 0;
//    private static final double tax = -5;
//
//
//
//
//
//    public void deposit(double amount) {
//        balance += amount;
//
//    }
//
//    public void withdraw(double amount) {
//        balance -= amount - tax;
//    }
//
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
//
//    public int getAccountNumber() {
//        return accountNumber;
//    }
//
//    public void setAccountNumber(int accountNumber) {
//        this.accountNumber = accountNumber;
//    }
//
//    public String getAccountName() {
//        return accountHolder;
//    }
//
//    public void setAccountName(String accountName) {
//        this.accountHolder = accountName;
//    }


