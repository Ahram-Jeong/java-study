package method.ex;

public class MethodEx3 {
    public static void main(String[] args) {
        int balance = 10000;

        // 입금 1000원
        balance = deposit(balance, 1000);

        // 출금 2000원
        balance = withdraw(balance, 2000);

        System.out.println("최종 잔액 : " + balance + "원");
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
