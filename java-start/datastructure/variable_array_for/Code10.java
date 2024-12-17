package datastructure.variable_array_for;

//1~100000 사이의 모든 소수들을 찾아서 출력하는 프로그램
public class Code10 {
    public static void main(String[] args) {

        for (int n = 2; n <= 100000; n++) {

            boolean isPrime = true;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(n);
            }
        }
    }
}
