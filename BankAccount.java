import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 1000;
        int deposit;

        System.out.print("Enter deposit amount: ");
        deposit = sc.nextInt();

        balance = balance + deposit;

        System.out.println("Updated Balance: " + balance);
    }
}
