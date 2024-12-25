package lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

//        toString()은 Object 클래스의 메서드(java에서ㅏ 모든객체의 최종부모는 Object)
        String string = child.toString();
        System.out.println(string);
    }
}
