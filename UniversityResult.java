import java.util.Scanner;

public class UniversityResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks;

        System.out.print("Enter Marks: ");
        marks = sc.nextInt();

        if(marks >= 50)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
}
