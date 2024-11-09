package construct.ex;

public class Book {
    String title; // 제목
    String author; // 저자
    int page; // 페이지 수

    // 생성자 코드
    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    Book(String title, String author) {
        this(title, author, 0);
//        this.title = title;
//        this.author = author;
//        this.page = 0;
    }

    Book() {
        this("", "");
//        this.title = "";
//        this.author = "";
    }

    void displayInfo() {
        System.out.println("제목 : " + title + ", 저자 : " + author + ", 페이지 : " + page);
    }
}
