import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pass;

        System.out.print("Enter Password: ");
        pass = sc.nextLine();

        if(pass.equals("java123"))
            System.out.println("Access Granted");
        else
            System.out.println("Wrong Password");
    }
}
