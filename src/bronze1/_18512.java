package bronze1;

import java.util.ArrayList;
import java.util.Scanner;

public class _18512 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();

        ArrayList<int[]> list = new ArrayList<>();

        if (x <= y) {
            list.add(new int[] { x, p1 });
            list.add(new int[] { y, p2 });
        } else {
            list.add(new int[] { y, p2 });
            list.add(new int[] { x, p1 });
        }

        int cnt = 1;
        while (true) {
            int num = list.get(0)[1] + cnt * list.get(0)[0];
            if (num >= 10000 + list.get(0)[1]) {
                System.out.println(-1);
                break;
            }
            num -= list.get(1)[1];
            if (num >= 0 && num % list.get(1)[0] == 0) {
                System.out.println(num + list.get(1)[1]);
                break;
            } else
                cnt++;
        }
    }

}
