package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalCost = 0;
        boolean flag = true;

        while (flag) {
            System.out.println("1 : 상품 입력, 2 : 결제, 3 : 프로그램 종료");
            int option = sc.nextInt();
            sc.nextLine(); // \n (이전에 입력된 개행 문자) 제거 용

            switch (option) {
                case 1 :
                    System.out.print("상품 명 입력 >> ");
                    String product = sc.nextLine();
                    System.out.print("상품 가격 입력 >> ");
                    int price = sc.nextInt();
                    System.out.print("구매 수량 입력 >> ");
                    int quantity = sc.nextInt();

                    totalCost += price * quantity;
                    System.out.println("상품 명 : " + product + ", 가격 : " + price + ", 수량 : " + quantity + ", 합계 : " + (price * quantity));
                    break;
                case 2 :
                    System.out.println("총 비용 : " + totalCost);
                    totalCost = 0;
                    break;
                case 3 :
                    System.out.println("프로그램 종료");
                    flag = false;
                    break;
                default :
                    System.out.println("올바른 옵션을 선택하세요.");
                    break;
            }
        }
    }
}
