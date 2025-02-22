package poly.ex.pay1;

public abstract class PayStore {
    // 변하는 부분
    public static Pay findPay(String option) {
        // 결제 수단 선택
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else if (option.equals("new")) {
            return new NewPay();
        } else {
            // Null Object Pattern
            return new DefaultPay();
        }
    }
}
