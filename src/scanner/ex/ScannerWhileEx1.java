package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("이름 입력 (종료 입력 시, 종료) >> ");
            String name = sc.nextLine();

            if (name.equals("종료")) {
                System.out.println("프로그램 종료!");
                break;
            }

            System.out.print("나이 입력 >> ");
            int age = sc.nextInt(); // 10\n
            sc.nextLine(); // \n -> 개행 문자를 읽고 버리는 용도로 추가

            System.out.println("이름 : " + name + ", 나이 : " + age);
        }
    }
}
