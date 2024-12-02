package static2;

public class DecoMain1 {
    public static void main(String[] args) {
        String str = "WOODZ";
        DecoUtil1 utils = new DecoUtil1();
        String deco = utils.deco(str);

        System.out.println("Before : " + str);
        System.out.println("After : " + deco);
    }
}
