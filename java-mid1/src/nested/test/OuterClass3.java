package nested.test;
// 지역클래스
public class OuterClass3 {
    public void myMethod(){

        class LocalClass{
            public void hello(){
                System.out.println("LocalClass.hello");
            }
        }
        LocalClass local = new LocalClass();
        local.hello();
    }
}
