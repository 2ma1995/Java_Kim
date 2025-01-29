package poly.ex.pay1;

import java.util.Scanner;

public class PayMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PayService payService = new PayService();
        while (true) {
            System.out.print("결제 수단을 입력하세요:");
            String payOption = sc.nextLine();
            if (payOption.equals("exit")) {
                System.out.println("프로그램 종료");
                return;
            }
            System.out.println("결제금액 입력하세요.");
            int amount = sc.nextInt();
            sc.nextLine();
            payService.processPay(payOption, amount);

        }
    }
}
