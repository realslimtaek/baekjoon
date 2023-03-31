package bronze1;
import java.util.*;

public class _10448 {

    static int[] gauss;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        gauss = new int[45];
        gauss[1] = 1;
        for(int i = 2; i<45; i++){
            gauss[i] = gauss[i-1]+i;
        }
        boolean flag = false;
        for(int i = 0; i<n;i++){
            flag=false;
            int val = arr[i];
            for(int j = 1; j<45;j++){
                if(flag) break;
                for(int k = 1; k<45; k++){
                    if(flag) break;
                    for(int l = 1; l<45; l++){
                        if(flag) break;
                        if(gauss[j]+gauss[k]+gauss[l] == val){
                            sb.append("1").append("\n");
                            flag = true;
                        }
                    }
                }
            }
            if(!flag) sb.append("0").append("\n");
        }

        System.out.println(sb);

    }
}
