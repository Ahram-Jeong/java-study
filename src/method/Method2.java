package method;

public class Method2 {
    public static void main(String[] args) {
        printHeader();
        System.out.println("RUNNING:-)");
        printFooter();
    }
    
    public static void printHeader() {
        System.out.println("***** 프로그램 시작 *****");
        return; // void의 경우 생략 가능
    }

    public static void printFooter() {
        System.out.println("***** 프로그램 종료 *****");
    }
}
