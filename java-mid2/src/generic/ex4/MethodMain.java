package generic.ex4;

public class MethodMain {
    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);
//        Object에 넣은 값은 Integer로 캐스팅을 해줘야 한다.
//        Integer result = (Integer) GenericMethod.objMethod(i);

//        타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
//      GenericMethod는 메서드를 호출할때 타입형 ex)<Integer>를 적어야함
        Integer result = GenericMethod.<Integer>genericMethod(i);
        Integer integerValue = GenericMethod.<Integer>numberMethod(100); // 숫자값만 입력가능
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);
// Generic Method 타입추론 타입형을 안적어도된다.
        Integer result1 = GenericMethod.genericMethod(i);
        Integer integerValue1 = GenericMethod.numberMethod(100); // 숫자값만 입력가능
        Double doubleValue1 = GenericMethod.numberMethod(20.0);

    }
}
