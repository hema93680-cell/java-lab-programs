import java.util.Scanner;

public class BinaryPermission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int read, write;

        System.out.print("Enter Read Permission (1/0): ");
        read = sc.nextInt();

        System.out.print("Enter Write Permission (1/0): ");
        write = sc.nextInt();

        if(read == 1)
            System.out.println("Read Permission Granted");
        else
            System.out.println("Read Permission Denied");

        if(write == 1)
            System.out.println("Write Permission Granted");
        else
            System.out.println("Write Permission Denied");
    }
}
