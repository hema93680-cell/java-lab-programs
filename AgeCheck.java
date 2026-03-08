import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age;

        System.out.print("Enter Age: ");
        age = sc.nextInt();

        if(age >= 18)
            System.out.println("Eligible");
        else
            System.out.println("Not Eligible");
    }
}
