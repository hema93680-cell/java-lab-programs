import java.util.Scanner;

public class SecureBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pin = 1234;
        int input;

        System.out.print("Enter PIN: ");
        input = sc.nextInt();

        if(input == pin)
            System.out.println("Login Successful");
        else
            System.out.println("Invalid PIN");
    }
}
