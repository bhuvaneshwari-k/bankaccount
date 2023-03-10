package org.example;
import java.util.logging.Logger;
import java.util.*;
/**
 * Hello world!
 *
 */
class Bankaccount
{
    static Logger l=Logger.getLogger("welcome");
    String username;
    long number;
    double balance;

    public Bankaccount(String username1, long num1, double balance1) {
        username = username1;
        number = num1;
        balance = balance1;
        l.log(Level.INFO, () -> "Your name is:" +username);
        l.log(Level.INFO, () -> "Your account number is:" +number);
        l.info("your account is created!!!");
    }

    void deposit(long amount) {
        balance = balance + amount;
        l.info("your amount is deposited successfully!!!");
    }

    void withdrawal(long amount) {
        balance = balance - amount;
        l.info("your amount is withdrawn successfully!!!");
    }

    void displaybalance() {
        l.log(Level.INFO, () -> "Your current balance is:" +balance);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
       static Logger l=Logger.getLogger("welcome");
        l.info("Enter username:");
        String username1 = s1.nextLine();
        l.info("Enter account number:");
        long num1 = s.nextLong();
        Bankaccount ba = new Bankaccount(username1, num1, 0.0);
        while (true) {
            l.info("1.Deposit\n2.Withdrawal\n3.Current Balance\n4.Exit");
            l.info("Enter your choice:");
            int ch = s.nextInt();
            switch (ch) {
                case 1 -> {
                    l.info("Enter the amount to deposit:");
                    long amt = s.nextLong();
                    ba.deposit(amt);
                }
                case 2 -> {
                    l.info("Enter the amount to withdraw:");
                    long amt1 = s.nextLong();
                    ba.withdrawal(amt1);
                }
                case 3 -> ba.displaybalance();
                default -> {
                    l.info("you are exiting...!");
                    System.exit(0);
                }
            }
        }
    }
}
