package repeat.lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.parentMethod();
        child.parentMethod();

//        toString()은 Object 클래스의 메서드
        String string = child.toString();
        System.out.println(string);
    }
}
