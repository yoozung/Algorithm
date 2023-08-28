package baekjoon;

import java.util.Scanner;

public class _11720 {

    public static void main(String[] args) {
        int sum = 0;
        Scanner s = new Scanner(System.in);

        int amt = s.nextInt();
        String num = s.next();

        for (int i=0; i < amt; i++) {
            sum += num.charAt(i)-48;
        }
        System.out.println(sum);
    }
}
