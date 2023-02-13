import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder answer = new StringBuilder();

        int member_count = Integer.parseInt(br.readLine()); // N

        List<Integer> member = new ArrayList<>(member_count);
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        addmember(member,member_count,st1);

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int training_count = Integer.parseInt(st2.nextToken()); // M

        if (training_count < 1 || training_count > 1000000000)
            return;
        int member_choose = Integer.parseInt(st2.nextToken()); // K

        if (member_choose < 1 || member_choose > member_count)
            return;

        for (int a = 0; a < training_count; a++) {
            asdf(member,member_choose);
        }
        Collections.sort(member);
        for (int i : member) {
            answer.append(i).append(" ");
        }
        bw.write(String.valueOf(answer));
        bw.flush();
    }
    public static void addmember(List<Integer> member, int member_count, StringTokenizer st1){

        for (int i = 0; i < member_count; i++) {
            member.add(Integer.parseInt(st1.nextToken())); //L
        }
    }
    public static void asdf(List<Integer> member, int member_choose){
        Collections.sort(member);
        for(int i = 0; i<member_choose; i++){
            member.set(i, member.get(i) + 1);
        }
    }

}