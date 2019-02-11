package badcode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your password:");
        String pass = sc.nextLine();
        System.out.println("Enter the amount you want to withdraw:");
        String amount = sc.nextLine();

        Bank bank = new Bank();
        bank.withdrawmoney(name, pass, Double.parseDouble(amount));
    }
}
