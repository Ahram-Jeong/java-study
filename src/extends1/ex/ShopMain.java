package extends1.ex;

public class ShopMain {
    public static void main(String[] args) {
        Book book = new Book("Java", 10000, "조승연", "1234csy");
        Album album = new Album("OO-LI", 30000, "WOODZ");
        Movie movie = new Movie("Cinema Paradiso", 18000, "Giuseppe Tornatore", "Giuseppe Tornatore");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("상품 가격의 합 : " + sum);
    }
}
