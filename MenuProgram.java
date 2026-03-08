import java.util.Scanner;

public class MenuProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice, a = 10, b = 5;

        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Multiply");

        System.out.print("Enter choice: ");
        choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Sum = " + (a + b));
                break;

            case 2:
                System.out.println("Difference = " + (a - b));
                break;

            case 3:
                System.out.println("Product = " + (a * b));
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}
