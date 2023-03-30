package bronze3;

import java.util.Scanner;

public class _4619 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a == 0 && b == 0) break;
            int i = 0;
            int val1 = 0, val2 = 0;
            while(true){
                if(Math.pow(i,b) <= a){
                    val1 = i;
                } else if(Math.pow(i+1,b) > a){
                    val2 = i;
                    break;
                }
                i++;
            }
            System.out.println(Math.abs(Math.pow(val1,b)-a) <= Math.abs(Math.pow(val2,b)- a)? val1: val2);
        }
    }
}
