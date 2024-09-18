package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        printMsg("Ashley in Paris:)", 3);
        printMsg("WOODZ", 5);
        printMsg("la tour Eiffel", 7);
    }

    public static void printMsg(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
