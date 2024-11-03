package oop1.ex;

public class Account {
    int balance = 0; // 잔액

    // 입금
    void deposit(int amount) {
        balance += amount;
    }

    // 출금
    void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("잔액이 부족합니다. 현재 잔액 : " + balance);
        }
    }
}
