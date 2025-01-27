package poly.car1;

/**
 * 전략 패턴 (Strategy Pattern)
 * Car를 사용하는 클라이언트 코드인 Driver 코드의 변경없이 새로운 자동차를 확장할 수 있음
 */
public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver(); // 자동차의 핵심 클라이언트

        // 차량 선택 (K3)
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();

        // 차량 변경 (K3 -> Model3)
        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();

        // 차량 변경 (Model3 -> NewCar)
        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();
    }
}
