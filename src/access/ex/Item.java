package access.ex;

public class Item {
    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    // 본인의 데이터는 본인이 계산하는 것이 가장 좋음
    // 추후에 변경이 생길 때에도 본인만 수정하면 됨
    public int getTotalPrice() {
        return price * quantity;
    }
}
