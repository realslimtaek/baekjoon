import java.io.*;
import java.util.*;

public class _25405 {

    static int M = 0;
    static int K = 0;
    static int N = 0;
    static int now_index = 0;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder answer = new StringBuilder();


        get_N();
        List<Integer> member = new ArrayList<>(N);

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        add_member(member,N,st1);
        get_M_K();

        Collections.sort(member);
        if (M < 1 || M > 1000000000)
            return;

        if (K < 1 || K > N)
            return;

        //get K with same num index with low to high
        int temp = K-1;
        System.out.println(member);
        int K_low = member.indexOf(member.get(temp));
        int K_high = member.lastIndexOf(member.get(temp));

        //get K + 1 with same num index with low to high
        temp += 1;
        int K1_low = member.indexOf(member.get(temp));
        int K1_high = member.lastIndexOf(member.get(temp));

        for(int i = 0 ; i < M; i++){
//            System.out.println("start       low = " + K_low +  "high = "+ K_high);
            for(int j = 0; j < K; j++) {
                if(K_high < K_low){
                    K_high = K1_high;
                    K_low = member.indexOf(member.get(temp));
                    if(temp + 1 < member.size()){
                        temp++;
                        K1_low = member.indexOf(member.get(temp));
                        K1_high = member.lastIndexOf(member.get(temp));
                    }
                }
                if (j >= K_low) {
                    member.set(K_high, member.get(K_high) + 1);
                    K_high--;
//                    System.out.println("j = "+ j +"low = " + K_low +  "high = "+ K_high);
//                    System.out.println(member);
                    continue;
                }
                    member.set(j, member.get(j) + 1);
                    if(Objects.equals(member.get(j), member.get(K_low)))
                        K_low = j;
                    if(Objects.equals(member.get(j), member.get(K1_low)))
                        K1_low = j;
//                System.out.println("low = " + K_low +  "high = "+ K_high);
//                System.out.println(member);
            }
//            System.out.println("end      low = " + K_low +  "high = "+ K_high);
//            System.out.println(i+ "회차 종료"+member + "\n");


        }





//        for (int a = 0; a < M; a++) {
//            asdf(member, K);
//        }

//        Collections.sort(member);
        for (int i : member) {
            answer.append(i).append(" ");
        }
        bw.write(String.valueOf(answer));
        bw.flush();
    }

    public static void get_N() throws IOException {
        N = Integer.parseInt(br.readLine()); // N
    }

    public static void get_M_K() throws IOException {
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st2.nextToken()); // M

        K = Integer.parseInt(st2.nextToken()); // K

    }

    public static void add_member(List<Integer> member, int member_count, StringTokenizer st1){

        for (int i = 0; i < member_count; i++) {
            member.add(Integer.parseInt(st1.nextToken())); //L
        }
    }
    public static void asdf(List<Integer> member, int member_choose){




//        int temp = M + member.get(0);
//        int a = binarySearch(member, temp, 0,member.size()-1);

    }

//    public static Integer binarySearch(List<Integer> member, int key, int low, int high){
//        int mid = 0;
//        if(low <= high){
//            mid = (low + high) / 2;
//            if(key == member.get(mid)) {
//                System.out.println("mid return" + mid);
//                return mid;
//            }
//            if(key == member.get(high)) {
//                System.out.println("high return" + high);
//                return high;
//            }
//            if(key == member.get(low)) {
//                System.out.println("low return" + mid);
//                return low;
//            }
//
//            else if (key < member.get(mid)){
//                return binarySearch(member, key, low, mid-1);
//            }
//            else {
//                return binarySearch(member, key, mid+1, high);
//            }
//        }
//        return 0;
//
//    }

}