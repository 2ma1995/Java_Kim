package exception.ex3;




import exception.ex3.exception.NetworkClientExceptionV3;

import java.util.Scanner;

public class MainV3 {
    public static void main(String[] args) throws NetworkClientExceptionV3 {
        NetworkServiceV3_1 networkService = new NetworkServiceV3_1();

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("전송할 문자 : ");
            String input = scanner.nextLine();
            if (input.equals("exit")){
                break;
            }
            //밑에 코드가 사라지고
            // throw new RuntimeException("ex"); 가 여기로와서 에러발생
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
