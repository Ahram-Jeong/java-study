package static2;

import static static2.DecoData.staticCall;

public class DecoDataMain2 {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        staticCall();
        staticCall();
        staticCall();

        System.out.println("2. 인스턴스 호출 (1)");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출 (2)");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        staticCall(data1);

        // 추가
        // static 메소드에 인스턴스를 통한 접근 -> 권장 X
        DecoData data3 = new DecoData();
        data3.staticCall();

        // static 메소드에 클래스를 통한 접근 -> 권장 O
        staticCall();
    }
}