package lang.string.test;

public class TestString7 {
    public static void main(String[] args) {
        String original = "          Hello Java   ";
        String trim = original.trim();
//        String stripped = original.strip(); // 이렇게도 사용가능
        System.out.println(trim);
    }
}
