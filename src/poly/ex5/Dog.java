package poly.ex5;

public class Dog implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("Bow-wow");
    }

    @Override
    public void move() {
        System.out.println("개 이동");
    }
}
