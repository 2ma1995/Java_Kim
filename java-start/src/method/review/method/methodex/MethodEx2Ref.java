package src.method.review.method.methodex;

public class MethodEx2Ref {
    public static void main(String[] args) {
        String message = "hello, world!";
        fmessage(message,4);
        fmessage(message,5);
        fmessage(message,7);
    }
    public static void fmessage(String message, int times){
        for (int j = 0; j < times; j++) {
            System.out.println(message);
        }
    }
}