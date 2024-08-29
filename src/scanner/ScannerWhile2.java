package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째, 두 번째 정수가 모두 0일 시 종료");
        while (true) {
            System.out.print("첫 번째 정수 입력 >> ");
            int num1 = sc.nextInt();

            System.out.print("두 번째 정수 입력 >> ");
            int num2 = sc.nextInt();

            if (num1 == 0 && num2 ==0) {
                System.out.println("프로그램 종료!");
                break;
            }
            int sum = num1 + num2;
            System.out.println("두 수의 합 >> " + sum);
        }
    }
}
