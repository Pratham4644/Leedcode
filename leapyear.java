import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        boolean isleap;
        if (year % 400 == 0) {
            isleap = true;
        } else if (year % 100 == 0) {
            isleap = false;
        } else if (year % 4 == 0) {
            isleap = true;
        } else {
            isleap = false;
        }
        if (isleap) {
            System.out.println(year + " is a leap year.");

        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

}