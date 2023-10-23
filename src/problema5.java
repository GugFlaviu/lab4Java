import java.util.Scanner;

public class problema5 {
    public static void main(String []args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introdu numarul dorit:\n");
        int numar = keyboard.nextInt();
        int firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + numar + " terms:");

        for (int i = 1; i <= numar; ++i) {
            System.out.print(firstTerm + ", ");

            // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

}

