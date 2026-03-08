import java.util.Scanner;

public class MarksValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks;

        System.out.print("Enter Marks: ");
        marks = sc.nextInt();

        if(marks >=0 && marks <=100)
            System.out.println("Valid Marks");
        else
            System.out.println("Invalid Marks");
    }
}
