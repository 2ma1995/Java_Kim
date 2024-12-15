package construct.ex;

public class Book {
    String title;
    String author;
    int page;

    //        생성자의 이름은 클래스 이름과 동일, 반환타입이 없음
    Book(){
        this("","",0);
    }

    Book(String title, String author){
        this(title,author,0);
    }
    Book(String title, String author, int page){
        this.title = title;
        this.author = author ;
        this.page =page ;
    }
    void displayInfo(){
        System.out.println("제목: "+title+", 저자: "+author+", 페이지: "+page);
    }
}
