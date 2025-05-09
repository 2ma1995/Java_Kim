package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger = Integer.valueOf(10);// 빨간줄이 나오는 이유: 미래에 삭제예정, 대신에 valueOf()를 사용
        Integer integerObj = Integer.valueOf(10);//-128 ~ 127 자주 사용하는 숫자 값 재사용,불변
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);

        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("비교");
        System.out.println("==: " + (newInteger == integerObj)); // 서로 다른 참조를 보고있기때문에 false값반환
        System.out.println(".equals(): " + (newInteger.equals(integerObj)));


    }
}
