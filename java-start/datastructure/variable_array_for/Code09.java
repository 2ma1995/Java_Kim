package datastructure.variable_array_for;

import java.util.Scanner;

// n개의 정수를 입력받아 순서대로 배열에저장한다.
// 그런다음 모든 정수들을 한칸씩 오른쪽으로 shift하고
// 마지막정수는 배열의 첫번째칸으로 이동.
public class Code09 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        int[] data = new int[n];

        for (int i = 0; i < n; i++) {
            data[i] = kb.nextInt();
        }
        int temp = data[n - 1];//[n - 1]은 배열의 마지막 인덱스를 의미

        for (int i = n - 2; i >= 0; i--) {
            data[i + 1] = data[i];
        }
        data[0] = temp;

        for (int i=0; i<n;i++){
            System.out.println(data[i]);
        }

    }
}
