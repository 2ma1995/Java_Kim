package repeat.lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] fruit = fruits.split(",");
        for (String string : fruit) {
            System.out.println(string);
        }
        String joinedString = String.join("->", fruit);
        System.out.println("joinedString = " + joinedString);
    }
}
