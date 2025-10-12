import java.util.Scanner;

public class checkingpositivnegativ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println(n + "it is positive");
        } else if (n == 0) {
            System.out.println("it is zero");
        } else {
            System.out.println(n + "it is negative");
        }
        sc.close();
    }

}
