package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("상품 가격을 입력 (-1을 입력하면 종료) >> ");
            int price = sc.nextInt();

            if (price == -1) {
                System.out.println("프로그램 종료");
                break;
            }

            System.out.print("구매 수량을 입력 >> ");
            int quantity = sc.nextInt();

            System.out.println("총 비용 : " + (price * quantity));
        }
    }
}
