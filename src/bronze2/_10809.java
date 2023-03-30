package bronze2;

import java.util.*;

public class _10809 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        char[] charr = a.toCharArray();
        int[] arr = new int[26];
        Arrays.fill(arr,-1);
        for(int i = 0; i<charr.length; i++){
            if(arr[charr[i]-97] == -1) arr[charr[i]-97] = i;
        }
        for(int v : arr){
            System.out.print(v +" ");
        }
    }
}
