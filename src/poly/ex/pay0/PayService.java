package poly.ex.pay0;

public class PayService {
    public void processPay(String option, int amount) {
        boolean result;

        System.out.println("결제 시작 : option = " + option + ", amount = " + amount);

        if (option.equals("kakao")) {
            KakaoPay kakaoPay = new KakaoPay();
            result = kakaoPay.pay(amount);
        } else if (option.equals("naver")) {
            NaverPay naverPay = new NaverPay();
            result = naverPay.pay(amount);
        } else if (option.equals("new")) {
            NewPay newPay = new NewPay();
            result = newPay.pay(amount);
        } else {
            System.out.println("결제 수단이 없습니다.");
            result = false;
        }
        
        if(result) {
            System.out.println("결제 성공");
            System.out.println("=======");
        } else {
            System.out.println("결제 실패");
            System.out.println("=======");
        }
    }
}
