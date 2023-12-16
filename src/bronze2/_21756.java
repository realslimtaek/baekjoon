package bronze2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _21756 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i+1);
        }

        int k = 0;
        while (list.size() != 1){
            list.remove(k);
            k += 1;
            if(k >= list.size()){
                k = 0;
            }
        }
        System.out.println(list.get(0));

    }
}
