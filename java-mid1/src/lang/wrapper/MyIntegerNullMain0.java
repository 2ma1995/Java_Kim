package lang.wrapper;

public class MyIntegerNullMain0 {
    public static void main(String[] args) {
        int[] intArr = {-1,0,1,2,3};
        System.out.println(findValue(intArr,-1)); //-1 값리턴
        System.out.println(findValue(intArr,0));
        System.out.println(findValue(intArr,1));
        System.out.println(findValue(intArr,100)); //없는값이기때문에 -1리턴
    }
    private static int findValue(int[] intArr,int target){
        for (int value : intArr) {
            if (value==target){
                return value;
            }
        }
        return -1;
    }
}
