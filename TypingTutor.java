import java.util.Scanner;

public class TypingTutor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word = "java";
        String input;

        System.out.println("Type the word: java");
        input = sc.nextLine();

        if(input.equals(word))
            System.out.println("Correct typing");
        else
            System.out.println("Try again");
    }
}
