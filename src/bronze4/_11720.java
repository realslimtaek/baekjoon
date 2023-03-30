package bronze4;
import java.util.*;
public class _11720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        String a = sc.next();
        for(char ch : a.toCharArray()){
            sum += ch-'0';
        }
        System.out.println(sum);
    }
}
