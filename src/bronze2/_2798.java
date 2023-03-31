package bronze2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _2798 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int temp = 0, answer = 0;

        for(int i = 0; i<n-2; i++){
            if(arr[i] > m) continue;
            for(int j = i+1; j<n-1; j++){
                if(arr[j] > m) continue;
                for(int k = j+1; k<n;k++){
                    if(arr[k] > m) continue;

                    temp = arr[i]+arr[j]+arr[k];
                    if(temp > m) continue;
                    if(m - answer > m - temp )
                        answer = temp;
                }


            }
        }
        System.out.println(answer);
    }

}