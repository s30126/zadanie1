import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {


        Scanner NumberScanner = new Scanner(System.in);

        int number = NumberScanner.nextInt();

        if (number == 0) {
            System.out.println("The value equals 0");
        } else if (number < 0) {
            System.out.println("The number is negative");
        } else if (number > 0) {
            System.out.println("The number is positive");
        }


    }
}
