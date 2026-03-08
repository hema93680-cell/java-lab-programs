import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 5000;
        int withdraw;

        System.out.print("Enter amount to withdraw: ");
        withdraw = sc.nextInt();

        if(withdraw <= balance) {
            balance = balance - withdraw;
            System.out.println("Please collect your cash");
            System.out.println("Remaining balance: " + balance);
        } 
        else {
            System.out.println("Insufficient balance");
        }
    }
}
