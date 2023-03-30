package bronze2;
import java.util.*;
public class _1152 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        ArrayList<String> list = new ArrayList<>(List.of(arr));

        int cnt = 0;
        for(int i = 0; i<arr.length - cnt; i++){
            if(Objects.equals(list.get(i), "")){
                System.out.println("hi");
                list.remove(i-cnt);
                cnt++;
            }
        }

        System.out.println(list.size());
    }
}
