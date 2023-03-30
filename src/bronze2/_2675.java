package bronze2;
import java.util.*;

public class _2675 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m;
        String a;

        for(int i = 0; i<n; i++){
            m = sc.nextInt();
            a = sc.next();
            for(char ch : a.toCharArray()){
                System.out.print(Character.toString(ch).repeat(m));
            }
            System.out.println();
        }
    }
}
