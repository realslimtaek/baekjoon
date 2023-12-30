package bronze1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _1259 {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String answer = "yes";
            char[] str = br.readLine().toCharArray();
            if(str[0] == '0') break;
            int lt = 0;
            int rt = str.length - 1;
            while (lt <= rt) {
                if(str[lt] == str[rt]){
                    lt++;
                    rt--;
                } else {
                    answer = "no";
                    break;
                }
            }

            System.out.println(answer);
        }

    }
}