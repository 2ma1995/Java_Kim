package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjecctBox integerBox = new ObjecctBox();
        integerBox.set(10);
//        Object object = integerBox.get();
//        Integer integer = (Integer) object;
//        ctrl+alt+n = inline variable //위에두줄의 코드를 합치는것. 아래코드로 함축됨.
        Integer integer = (Integer) integerBox.get(); // Object -> Integer 캐스팅
        System.out.println("integer = " + integer);

        ObjecctBox stringBox = new ObjecctBox();
        stringBox.set("hello");
        String string = (String) stringBox.get(); // Object -> String 캐스팅
        System.out.println("string = " + string);

//      잘못된 타입의 인수 전달시
        integerBox.set("문자100");
        Integer result = (Integer) integerBox.get(); // String -> Integer 캐스팅 예외
        System.out.println("result = " + result);

    }
}
