package datastructure.variable_array_for;

import java.util.Scanner;

public class Code08 {
    public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int[] data = new int[n];
        for (int i = 0; i < n; i++)
            data[i] = kb.nextInt();
            int sum = 0;
//            int max = 0;// 이렇게 할경우 음수는 반환을 못함(아래코드로 수정을하면 값이 잘나온다.)
            int max = data[0]; // 데이터 배열의 하나의 인덱스를 설정하면 배열안에서 실행되기때문에 음수도 잘나온다.
            for (int j = 0; j < n; j++) {
                sum+=data[j];
                if (data[j]>max)
                    max = data[j];
            }

            System.out.println("the sum is "+sum+ "\nmax is "+max);

    }


}
