import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int temp;

        System.out.print("Enter temperature: ");
        temp = sc.nextInt();

        if(temp < 20)
            System.out.println("Cold");
        else if(temp <= 35)
            System.out.println("Normal");
        else
            System.out.println("Hot");
    }
}
