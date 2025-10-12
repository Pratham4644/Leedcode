public class majority {
    public static int major(int[] arr)

    {
        int cnt = 0;
        int el = 0;

        for (int i = 0; i < arr.length; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = arr[i];
            } else if (el == arr[i])

            {
                cnt++;
            } else {
                cnt--;
            }
        }

        int cnt1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el) {
                cnt1++;
            }
        }
        if (cnt1 > arr.length / 2) {
            return el;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 1, 2, 2, 2 };
        int result = major(arr);
        if (result != -1) {
            System.out.println("Majority : " + result);

        } else

        {
            System.out.println("No majority ");
        }
    }
}