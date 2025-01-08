package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        // 부모 변수가 자신 인스턴스를 참조 (다형적 참조)
        Parent poly = new Child();

        // 단, 자식의 기능은 호출 불가, 컴파일 오류 발생
//        poly.childMethod();

        // 다운캐스팅 (부모 타입 -> 자식 타입)
        // 1. 다운캐스팅을 통해 부모 타입을 자식 타입으로 변환한 다음에 대입 시도
        // 2. 참조 값을 읽은 다음 자식 타입으로 지정 (poly의 참조 값을 복사하여 대입)
        Child child = (Child) poly;
        child.childMethod();
        // 캐스팅을 한다고 해서 Parent poly의 타입이 변하는 것이 아니라 해당 참조 값을 꺼내고, 꺼낸 참조 값이 Child 타입이 되는 것
        // 따라서, poly의 타입은 Parent로 기존과 같이 유지
    }
}
