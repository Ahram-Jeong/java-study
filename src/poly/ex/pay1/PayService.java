package poly.ex.pay1;

public class PayService {
    // 변하지 않는 부분
    public void processPay(String option, int amount) {
        System.out.println("결제 시작 : option = " + option + ", amount = " + amount);

        Pay pay = PayStore.findPay(option); // 역할에만 의존
        // 실제 결제
        boolean result = pay.pay(amount);

        if(result) {
            System.out.println("결제 성공");
            System.out.println("=======");
        } else {
            System.out.println("결제 실패");
            System.out.println("=======");
        }
    }
}
