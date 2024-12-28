package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
//split
        String[] splitFruits = fruits.split(",");
        for (String fruit : splitFruits) {
            System.out.println(fruit);
        }
//join
        String joinFruit = String.join("->", splitFruits);
        System.out.println("joinedString = "+joinFruit);
    }
}
