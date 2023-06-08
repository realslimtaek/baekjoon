package bronze2;

import java.util.Scanner;

public class _5622 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int sum = str.length();
        int i = 0;
        while(i<str.length()){
            switch(str.charAt(i)){
                case 'A': case 'B': case 'C':
                    sum += 2;
                    i++;
                    break;
                case 'D': case 'E': case 'F':
                    sum +=3;
                    i++;
                    break;
                case 'G': case 'H': case 'I':
                    sum +=4;
                    i++;
                    break;
                case 'J': case 'K': case 'L':
                    sum +=5;
                    i++;
                    break;
                case 'M': case 'N': case 'O':
                    sum += 6;
                    i++;
                    break;
                case 'P': case 'Q': case 'R': case 'S':
                    sum +=7;
                    i++;
                    break;
                case 'T': case 'U': case 'V':
                    sum += 8;
                    i++;
                    break;
                case 'W': case 'X': case 'Y': case 'Z':
                    sum += 9;
                    i++;
                    break;
            }
        }
        System.out.println(sum);
    }

}
