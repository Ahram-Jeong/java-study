package casting;

public class Casting2 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647;
        long overIntValue = 2147483648L;
        int intValue = 0;

        intValue = (int)maxIntValue; // 명시적 형변환
        System.out.println("maxIntValue casting = " + intValue); // 2147483647

        intValue = (int)overIntValue;
        System.out.println("overIntValue casting = " + intValue); // -2147483648
    }
}
