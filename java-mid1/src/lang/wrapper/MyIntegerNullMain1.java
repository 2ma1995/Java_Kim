package lang.wrapper;

public class MyIntegerNullMain1 {
    public static void main(String[] args) {
        MyInteger[] intArr = {new MyInteger(-1),new MyInteger(0),new MyInteger(1)};
        System.out.println(findValue(intArr,-1)); //-1 값리턴
        System.out.println(findValue(intArr,0));
        System.out.println(findValue(intArr,1));
        System.out.println(findValue(intArr,100)); //없는값이기때문에 -1리턴
    }

    private static MyInteger findValue(MyInteger[] intArr,int target){
        for (MyInteger myInteger : intArr) {
            if (myInteger.getValue() == target){
                return myInteger;
            }
        }
        return null;
    }
}
