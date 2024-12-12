package src.method.review.method;

public class MethodValue1 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. changeNumber 호출전, num1: "+num1);
        changeNumber(num1);
//        num1이 5인 이유는 num2가 10으로 바뀐거고 num1의 값은 그대로인것.
        System.out.println("4. changeNumber 호출후, num1: "+num1);
    }
    public static void changeNumber(int num2){
        System.out.println("2. changeNumber 변경전, num2: "+num2);
        num2 = num2*2;
        System.out.println("3. changeNumber 변경후, num2: "+num2);
    }
}
