package silver3;

import java.util.Scanner;

public class _1003 {
    static int[] arr = new int[41];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr[1] = 1;
        arr[2] = 1;
        for(int i = 3; i<41; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        for(int i = 0; i<n; i++){
            int a = sc.nextInt();
            System.out.println(a-1 >= 0 ? arr[a-1]+" "+ arr[a] : "1 " + arr[a]);
        }


    }
}
