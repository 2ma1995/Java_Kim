package oop1.ex;

public class Account {
    int balance;

    void deposit(int amount) {
        balance += amount;
        System.out.println("입금했습니다. 현재잔액: " + balance);
    }

    void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("잔액 부족. 현재잔액: " + balance);
        } else {
            balance -= amount;
            System.out.println("출금했습니다. 현재잔액: " + balance);
        }
    }
// 선생님 답
//    void deposit(int amount){
//        balance+=amount;
//    }
//
//    void withdraw(int amount){
//        if (balance >= amount){
//            balance-=amount;
//        }else {
//            System.out.println("잔액부족");
//        }
//    }


}
