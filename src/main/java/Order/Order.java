package Order;

public class Order {
    private Long memberId;
    private int price;
    private String itemName;

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getDiscountprice() {
        return discountprice;
    }

    public void setDiscountprice(int discountprice) {
        this.discountprice = discountprice;
    }

    private int discountprice;

    public Order(Long memberId, String itemName,int price, int discountprice) {
        this.memberId = memberId;
        this.price = price;
        this.itemName = itemName;
        this.discountprice = discountprice;
    }
}
