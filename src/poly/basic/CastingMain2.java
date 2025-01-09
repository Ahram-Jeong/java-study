package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        // 부모 변수가 자신 인스턴스를 참조 (다형적 참조)
        Parent poly = new Child();

        // 단, 자식의 기능은 호출 불가, 컴파일 오류 발생
//        poly.childMethod();

        // 다운캐스팅 (부모 타입 -> 자식 타입)
//        Child child = (Child) poly;
//        child.childMethod();

        // 일시적 다운캐스팅 - 해당 메소드를 호출하는 순간만 다운캐스팅
        // 연산자 우선순위가 애매하기 때문에 이중 괄호 필요
        ((Child) poly).childMethod();
    }
}
