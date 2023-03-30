package silver5;
import java.util.*;
import java.io.*;
public class _1316 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        boolean flag = false;

        String[] arr = new String[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.next();
        }
        for(String s : arr){
            char[] charr = s.toCharArray();
            ArrayList<Character> list = new ArrayList<>();
            list.add(charr[0]);
            flag = false;
            for(int i = 1; i<charr.length; i++){
                if(charr[i] != charr[i-1]){
                    if(list.contains(charr[i])) flag = true;
                    list.add(charr[i]);
                }
            }
            if(!flag)answer++;
        }
        System.out.println(answer);


    }
}
