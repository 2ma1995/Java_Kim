package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10 ;
        System.out.println( "메서드 호출전: a = "+dataA.value);
        changeReference(dataA);
        System.out.println( "메서드 호출후: a = "+dataA.value);
    }
    public static void changeReference(Data datax){
        datax.value =20;
    }
}
