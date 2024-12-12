package src.method.review.method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double number = 1.5;
//        printNumber(number); double형이여서, int에 값을 반환받지 못함.(컴파일오류)
        printNumber((int) number);//명시적 형변환을 사용해 double을 int로 형변환.
    }
    public static void printNumber(int n){
        System.out.println("숫자: "+n);
    }
}
