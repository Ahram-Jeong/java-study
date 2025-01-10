package poly.basic;

// 다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {
    public static void main(String[] args) {
        // 업캐스팅이 안전하고, 다운캐스팅이 위험한 이유
        // 업캐스팅의 경우 이런 문제가 절대로 발생하지 않음
        // 이유는 객체를 생성하면 해당 타입의 상위 부모 타입이 모두 함께 생성되기 때문
        // 반면에 다운캐스팅의 경우 인스턴스에 존재하지 않는 하위 타입으로 캐스팅하는 문제가 발생할 수 있음
        // 왜냐하면 객체를 생성하면 부모타입을 모두 함께 생성되지만, 하위 자식 타입은 생성되지 않음

        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod(); // 문제 없음

        Parent parent2 = new Parent(); // 부모 타입 객체를 생성, 따라서 메모리 상에 자식 타입은 전혀 존재하지 않음
        // 사용할 수 없는 타입으로 다운캐스팅
        Child child2 = (Child) parent2; // 하위 타입에 대입 불가, ClassCastException, 런타임 오류
        child2.childMethod(); // 실행 불가
    }
}
