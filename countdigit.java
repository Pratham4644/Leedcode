import java.util.Scanner;

public class countdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int deg = 0;
        while (n != 0) {
            n = n / 10;
            deg++;

        }
        System.out.println(deg + " digits");
        sc.close();
    }
}