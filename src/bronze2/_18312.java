package bronze2;

import java.util.Scanner;

public class _18312 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int cnt= 0;
        boolean check1 = false;
        boolean check2 = false;
        boolean check3 = false;

        for(int h = 0; h<=n;h++){
            check1 = false;
            if(h/10 == k || h%10 == k)
                check1 = true;
            for(int m = 0;m<60;m++){
                check2= false;
                if(m/10 == k || m%10 == k)
                    check2 = true;
                for(int s = 0; s<60; s++ ){
                    check3 = false;
                    if(s/10 == k || s%10 == k)
                        check3 = true;

                    if(check1 ||check2 || check3) cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
