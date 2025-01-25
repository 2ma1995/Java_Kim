package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요.");
        int input = sc.nextInt();
        sc.nextLine();
        ProductOrder[] orders = new ProductOrder[input];
        for (int i = 0; i < orders.length; i++) {
            System.out.print((i + 1) + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            String productName = sc.nextLine();

            System.out.print("가격: ");
            int productPrice = sc.nextInt();

            System.out.print("수량: ");
            int productQuantity = sc.nextInt();
            sc.nextLine();

        orders[i] = createOrder(productName, productPrice, productQuantity);
        }

        printOrder(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 합계 가격 : " + totalAmount);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printOrder(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price + ", 수량 : " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int total = 0;
        for (ProductOrder order : orders) {
            total += order.price * order.quantity;
        }
        return total;
    }
}
