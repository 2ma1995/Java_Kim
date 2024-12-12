package src.method.review.method;

public class MethodReturn2 {
    public static void main(String[] args) {
        checkAge(16);
        checkAge(20);
    }

    public static void checkAge(int age) {
        if (18 > age) {
            System.out.println(age + " 살. 미성년자는 출입이 불가합니다.");
            return;
        }
        System.out.println(age + " 살. 출입이 가능합니다.");
    }


}
