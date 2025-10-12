import java.util.Scanner;

public class Checkevenodd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + "it is even");
        } else {
            System.out.println("it id odd");
        }
        scanner.close();
        System.out.println("Thank you for using the program!");

    }
}
