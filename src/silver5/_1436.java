package silver5;

import java.util.Scanner;

public class _1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt = 0;
        int i = 0;
        while(n!= cnt){
            i++;
            if(String.valueOf(i).contains("666")){
                cnt++;
            }
        }
        System.out.println(i);
    }
}
