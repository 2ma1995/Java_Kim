package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

//        split()
        String[] splitStr = str.split(",");
        for (String s : splitStr) {
            System.out.println(s);
        }
        
        String joinStr = "";
        for (String string : splitStr) {
            joinStr+=string+"-";
        }
        //위코드처럼 작성시 마지막에 "-" 가 하나더 붙어서 출력
        //아래코드는 "-" 없애기위한 코드
//        for (int i = 0; i < splitStr.length; i++) {
//            String string = splitStr[i];
//            joinStr+=string;
//            if (i != splitStr.length-1){
//                joinStr+="-";
//            }
//        }
        System.out.println("joinStr = " + joinStr);
        // join()
        String joinedStr = String.join("-","A","B","C");
        System.out.println("연결된 문자열 = " + joinedStr);

        // 문자열 배열 연결
        String result = String.join("-",splitStr);
        System.out.println("result = " + result);

    }
}
