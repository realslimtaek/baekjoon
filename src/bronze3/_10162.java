package bronze3;
import java.util.*;

public class _10162 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b1 = 0, b2 =0, b3 = 0;

        while(n/10 != 0){

            if(n >=300){
                b1 += n/300;
                n %= 300;
                continue;
            }
            if(n>=60){
                b2 += n/60;
                n %= 60;
                continue;
            }
                b3 += n/10;
                n %= 10;
        }
        if(n !=0) {
            System.out.println("-1");
        } else System.out.println(b1 + " " + b2 + " " + b3);
    }
}
