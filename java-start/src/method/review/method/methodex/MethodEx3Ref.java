package src.method.review.method.methodex;

public class MethodEx3Ref {
    public static void main(String[] args) {
        int balance = 10000;
        balance = deposit(balance, 1000);
        balance = withdraw(balance, 2000);

        System.out.println("최종 잔액: " + balance + "원");

    }
//입금
    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입급하였습니다." + balance + "원");
        return balance;
    }
//출금
    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 입급하였습니다." + balance + "원");
        } else {
            System.out.println(balance + "원을 출금 하ㅏ려 했느아 잔액이 부족합니다.");
        }
        return balance;
    }
}