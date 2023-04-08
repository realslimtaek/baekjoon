package silver4;

import java.util.Scanner;

public class _25379 {

    public static void main(String[] args) {
        int size = 0;
        int idx = 0;
        long sum = 0;
        long cntL = 0, cntR= 0;

        Scanner sc = new Scanner(System.in);

        size = sc.nextInt();
        int[] list = new int[size];

        for(int i = 0; i < size; i++){
        //리스트에 숫자를 넣으며
            list[i] = sc.nextInt();
        //들어온 수가 짝수라면
            if(list[i]%2 == 0){
        //짝수의 개수 세두고
                sum += idx++;
        //맨 왼쪽에 넣기 위해  들어온 개수만 큼 ++
                cntL += i;
        //짝수를 맨 우측에 둔다면 들어온 총 개수만큼++
                cntR += size-1-i;
            }
        }
        System.out.printf("%d",Math.min(cntL,cntR)-sum);
    }






}
