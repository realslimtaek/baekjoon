package bronze2;
import java.util.*;
public class _2908 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder val1 = new StringBuilder();
        StringBuilder val2 = new StringBuilder();
        for(int i = 0; i<3; i++){
            val1.append(a % 10);
            a /= 10;
            val2.append(b % 10);
            b /= 10;
        }
        System.out.println(Math.max(Integer.parseInt(val1.toString()),Integer.parseInt(val2.toString())));
    }
}
