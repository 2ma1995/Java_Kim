package src.method.review.method;

public class Method1Ref {
    public static void main(String[] args) {

        //계산1
        int sum1 = add(5, 10);
        System.out.println("결과1 출력: " + sum1);
        System.out.println("======================");
        //계산2
        int sum2 = add(15, 20);
        System.out.println("결과2 출력:" + sum2);
//      반환값없이 메서드 호출만 할수도 있음.
        add(100,200);

    }

// 메서드 생성
        public static int add(int a,int b){
        System.out.println(a + "+" + b + " 연산 수행");
        int sum = a + b;
        return sum;

        }
}
