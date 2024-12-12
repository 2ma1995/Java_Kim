package src.array.review.array;

public class EnhancedFor {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
//        일반for문
        for (int i = 0; i < numbers.length; i++) {
             int number = numbers[i];
            System.out.println(number);
        }
        System.out.println("============================");
//        향상된 for문, for-each문 = iter
        for (int number: numbers){
            System.out.println(number);
        }
//        for-each문을 사용할수 없는경우, 증가하는 index값 필요한경우
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number"+i+"번의 결과는: "+numbers[i]);
        }

        }
    }

