package bronze1;

import java.util.Scanner;

public class _2851 {
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arr = new int[10];
        arr[0] = sc.nextInt();
        for (int i = 1; i < 10; i++) {
            arr[i] = sc.nextInt() + arr[i - 1];

            if (arr[i] > 100 && arr[i - 1] <= 100) {
                if(Math.abs(100 - arr[i]) == Math.abs(100 - arr[i - 1])) {
                    System.out.println(arr[i]);
                    return;
                }
                else {
                    System.out.println(Math.abs(100 - arr[i]) < Math.abs(100 - arr[i - 1]) ? arr[i] : arr[i - 1]);
                    return;
                }

            }
        }
        System.out.println(arr[9]);
    }

}
