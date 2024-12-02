package static2;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall(); // staticValue = 1

        System.out.println("2. 인스턴스 호출 (1)");
        DecoData data1 = new DecoData();
        data1.instanceCall(); // instanceValue = 1, staticValue = 2

        System.out.println("3. 인스턴스 호출 (2)");
        DecoData data2 = new DecoData();
        data2.instanceCall(); // instanceValue = 1, staticValue = 3

        DecoData.staticCall(data1); // instanceValue = 2
    }
}
