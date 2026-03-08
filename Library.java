import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int books;

        System.out.print("Enter number of books issued: ");
        books = sc.nextInt();

        if(books > 3)
            System.out.println("Limit exceeded");
        else
            System.out.println("Books issued successfully");
    }
}
