import java.util.Scanner;

public class ExceptionCalc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a,b;

        try {
            System.out.print("Enter first number: ");
            a = sc.nextInt();

            System.out.print("Enter second number: ");
            b = sc.nextInt();

            System.out.println("Division = " + (a/b));
        }
        catch(Exception e) {
            System.out.println("Error: Cannot divide by zero");
        }
    }
}
