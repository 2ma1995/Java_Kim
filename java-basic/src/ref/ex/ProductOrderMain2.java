package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 2);
        printOrder(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 합계 가격 : "+totalAmount);
    }
    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity=quantity;
        return productOrder;
    }
    static void printOrder(ProductOrder[] orders){
        for (ProductOrder order : orders) {
            System.out.println("상품명 : "+order.productName+", 가격 : "+order.price+", 수량 : "+order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders){
        int total=0;
        for (ProductOrder order : orders) {
           total += order.price * order.quantity;
        }
        return total;
    }
}
