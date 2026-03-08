import java.util.Scanner;

public class ShapeArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r, area;

        System.out.print("Enter radius: ");
        r = sc.nextDouble();

        area = 3.14 * r * r;

        System.out.println("Area of Circle = " + area);
    }
}
