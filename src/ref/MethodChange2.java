package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메소드 호출 전 : dataA.value = " + dataA.value); // 10
        System.out.println("dataA = " + dataA);

        changeRef(dataA);
        System.out.println("메소드 호출 후 : dataA.value = " + dataA.value); // 20
    }

    static void changeRef(Data dataX) {
        System.out.println("dataX = " + dataX);
        dataX.value = 20;
    }
}
