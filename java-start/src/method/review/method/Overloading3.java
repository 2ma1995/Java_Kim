package src.method.review.method;

//매개변수의 타입이 다른 오버로딩
public class Overloading3 {
    public static void main(String[] args) {
        System.out.println("1: "+add(1,2));
        System.out.println("1: "+add(1.2, 1.5));
    }
// 아래 코드가 없어도 형변환이 가능한경우 형변환이 되서, 실행
//    public static int add(int a, int b) {
//        System.out.println("1번 호출");
//        return a + b;
//    }

    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}
