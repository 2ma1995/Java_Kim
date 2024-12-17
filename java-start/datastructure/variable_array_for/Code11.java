package datastructure.variable_array_for;

import java.util.Scanner;

//사용자로부터 먼저 정수의 개수 n을 입력받고, 순서대로 배열에 저장한다,
// 중복된 정수쌍의 개수를 카운트하여 출력.
//예를들어 n=6이고 입력된 정수들이 2,4,2,4,5,2 일때 중복된 정수쌍은 (2,2),(2,2),(2,2),(4,4) 이다
public class Code11 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = kb.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n ; j++) {
                if (data[i]==data[j]){
                   count++;
                }
            }
        }
        System.out.println(count);
    }
}
