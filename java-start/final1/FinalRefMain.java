package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();

//        참조 대상의 값은 변경 가능(참조대상만 변경을못하는것.)
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
