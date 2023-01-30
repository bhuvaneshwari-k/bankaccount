package org.example;

import java.util.*;
/**
 * Hello world!
 *
 */
class bankaccount
{
    String username;
    long number;
    double balance;

    public bankaccount(String username1, long num1, double balance1) {
        username = username1;
        number = num1;
        balance = balance1;
        System.out.println("your name is:" + username);
        System.out.println("your account number is:" + number);
        System.out.println("your account is created!!!");
    }

    void deposit(long amount) {
        balance = balance + amount;
        System.out.println("your amount is deposited successfully!!!");
    }

    void withdrawal(long amount) {
        balance = balance - amount;
        System.out.println("your amount is withdrawn successfully!!!");
    }

    void displaybalance() {
        System.out.println("your current balance is:" + balance);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter username:");
        String username1 = s1.nextLine();
        System.out.println("Enter account number:");
        long num1 = s.nextLong();
        bankaccount ba = new bankaccount(username1, num1, 0.0);
        while (true) {
            System.out.println("1.Deposit\n2.Withdrawal\n3.Current Balance\n4.Exit");
            System.out.println("Enter your choice:");
            int ch = s.nextInt();
            switch (ch) {
                case 1 -> {
                    System.out.println("Enter the amount to deposit:");
                    long amt = s.nextLong();
                    ba.deposit(amt);
                }
                case 2 -> {
                    System.out.println("Enter the amount to withdraw:");
                    long amt1 = s.nextLong();
                    ba.withdrawal(amt1);
                }
                case 3 -> ba.displaybalance();
                default -> {
                    System.out.println("you are exiting...!");
                    System.exit(0);
                }
            }
        }
    }
}
