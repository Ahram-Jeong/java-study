package extends1.super2;

/**
 * 실행 순서 : ClassA -> ClassB -> ClassC
 */
public class ClassC extends ClassB {
    public ClassC() {
        super(10, 20);
        System.out.println("ClassC 생성자");
    }
}
