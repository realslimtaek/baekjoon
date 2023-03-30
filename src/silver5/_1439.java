package silver5;
import java.util.*;
import java.io.*;
public class _1439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        StringTokenizer st1 = new StringTokenizer(s,"0");
        StringTokenizer st2 = new StringTokenizer(s,"1");

        System.out.println(Math.min(st1.countTokens(),st2.countTokens()));

    }
}
