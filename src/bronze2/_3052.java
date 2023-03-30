package bronze2;

import java.util.*;

public class _3052 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[10];
        for(int i = 0; i<10; i++){
            arr[i] = String.valueOf(sc.nextInt() % 42);
        }
        HashSet<String> hash = new HashSet<>(Arrays.asList(arr));

        System.out.println(hash.size());

    }
}
