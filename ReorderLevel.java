import java.util.Scanner;

public class ReorderLevel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stock, reorder = 50;

        System.out.print("Enter current stock: ");
        stock = sc.nextInt();

        if(stock <= reorder)
            System.out.println("Reorder required");
        else
            System.out.println("Stock is sufficient");
    }
}
