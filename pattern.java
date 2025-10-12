public class pattern {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
