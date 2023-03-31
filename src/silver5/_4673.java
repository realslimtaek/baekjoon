package silver5;

public class _4673 {

    public static void main(String[] args) {

        boolean[] check = new boolean[10101];
        check[2] = true;
        for(int i = 0; i<10001; i++){
            int a = i;
            int val1 = 0;
            while(a !=0){
                val1 += a%10;
                a /=10;
            }
            check[i+val1] = true;
        }
        for(int j = 1; j<=10000; j++){
            if(!check[j]) System.out.println(j);
        }
    }
}
