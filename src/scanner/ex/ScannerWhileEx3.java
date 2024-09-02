package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int cnt = 0;
        int input = 0;

        System.out.println("숫자 입력 (입력을 중단하려면 -1) >> ");

        while (true) {
            input = sc.nextInt();

            if (input == -1) {
                break;
            }

            sum += input;
            cnt++;
        }

/*
        while ((input = sc.nextInt()) != -1) {
            sum += input;
            cnt++;
        }
*/

        double avg = (double) sum / cnt;
        System.out.println("입력한 숫자들의 합계 : " + sum + ", 입력한 숫자들의 평균 : " + avg);
    }
}
