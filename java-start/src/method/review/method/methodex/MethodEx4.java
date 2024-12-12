package src.method.review.method.methodex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        int balance = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("-----------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("-----------------------------------");
            System.out.print("선택: ");

            int choice = scanner.nextInt();
            int amount;
            switch (choice) {
                case 1:
                    System.out.println("입금액을 입력하세요: ");
                    balance += choice;
                    System.out.println(choice + "원을 입력하였습니다. 현재잔액:" + amount);
                    break;
                case 2:
                    System.out.println("출금액을 입력하세요: ");
                    if (balance>choice){
                    balance -= choice;
                    System.out.println(choice + "원을 입력하였습니다. 현재잔액:" + balance);
                    }else {
                        System.out.println(choice+"를 출금하려했으나 잔액이 부족합니다.");
                    }
                    break;
                case 3:



            }
        }

    }
}
