package construct.ex;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayInfo();

        Book book2 = new Book("Drowning", "WOODZ");
        book2.displayInfo();

        Book book3 = new Book("Hidden Side", "민현", 700);
        book3.displayInfo();
    }
}
