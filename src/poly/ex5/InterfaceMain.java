package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
        // 인스턴스 생성 불가
//        InterfaceAnimal interfaceAnimal = new InterfaceAnimal();

        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
    }

    // 동물이 추가 되어도 변하지 않는 부분
    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
