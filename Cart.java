import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int items;

        System.out.print("Enter number of items: ");
        items = sc.nextInt();

        System.out.println(items + " items added to cart");
    }
}
