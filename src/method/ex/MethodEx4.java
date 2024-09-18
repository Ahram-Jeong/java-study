package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        int balance = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("======================================");
            System.out.println("1. 입급 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("======================================");
            System.out.print("선택 >> ");
            int choice = sc.nextInt();
            int amount;

            switch (choice) {
                case 1:
                    System.out.print("입금액 입력 : ");
                    amount = sc.nextInt();
                    balance = deposit(balance, amount);
                    break;
                case 2:
                    System.out.print("출금액 입력 : ");
                    amount = sc.nextInt();
                    balance = withdraw(balance, amount);
                    break;
                case 3:
                    System.out.println("현재 잔액 : " + balance + "원");
                    break;
                case 4:
                    System.out.println("프로그램 종료!");
                    return; // 플래그 바꾸지 않아도 while문 종료 가능 -> main 메소드를 종료
                default:
                    System.out.println("숫자를 다시 선택해주세요.");
            }
        }
    }

    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원 입금 완료. 현재 잔액 : " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원 출금 완료. 현재 잔액 : " + balance + "원");
        } else {
            System.out.println("잔액 부족. 현재 잔액 : " + balance + "원");
        }
        return balance;
    }
}
