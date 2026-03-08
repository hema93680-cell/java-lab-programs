import java.util.Scanner;

public class Emergency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int level;

        System.out.print("Enter emergency level (1-3): ");
        level = sc.nextInt();

        switch(level) {
            case 1: System.out.println("Low Alert"); break;
            case 2: System.out.println("Medium Alert"); break;
            case 3: System.out.println("High Alert"); break;
            default: System.out.println("Invalid level");
        }
    }
}
