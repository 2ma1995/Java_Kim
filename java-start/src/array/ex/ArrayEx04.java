package src.array.ex;

import java.util.Scanner;

public class ArrayEx04 {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        int sum = 0;
        double avg;
        Scanner scanner = new Scanner(System.in);
//        입력
        System.out.println("5개의 정수를 입력하세요.");
        for (int i = 0; i < numbers.length; i++) {
          numbers[i] = scanner.nextInt();
        }
//        합계입력
        for (int number : numbers) {
            sum+=number;
        }
        avg = (double) sum/ numbers.length;
        System.out.println("입력한 정수의 합계: "+sum);
//        평균
        System.out.print("입력한 정수의 평균: "+avg);
    }
}
