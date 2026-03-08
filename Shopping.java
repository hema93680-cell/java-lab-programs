import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;

        System.out.println("1.Mobile");
        System.out.println("2.Laptop");
        System.out.println("3.Headset");

        System.out.print("Choose product: ");
        choice = sc.nextInt();

        switch(choice) {
            case 1: System.out.println("Mobile added to cart"); break;
            case 2: System.out.println("Laptop added to cart"); break;
            case 3: System.out.println("Headset added to cart"); break;
            default: System.out.println("Invalid choice");
        }
    }
}
