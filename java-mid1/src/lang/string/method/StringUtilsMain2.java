package lang.string.method;

public class StringUtilsMain2 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        String  str = "Hello, Java!";

        // format 메서드 //%d = 숫자, %b = 불리언, %s = 문자
        String format1 = String.format("num: %d, bool: %b, str: %s", num, bool, str);
        System.out.println(format1);

        String format2 = String.format("숫지: %.2f", 10.1234);//%.2f = 소숫점 2번째 자리(소수점 선택출력)
        System.out.println(format2);

        //printf
        System.out.printf("숫자: %.2f\n", 10.1234);

        //matches 메서드
        String regex = "Hello, (Java!|World)";
        System.out.println("'str'이 패턴과 일치하는가? " + str.matches(regex));
    }
}
