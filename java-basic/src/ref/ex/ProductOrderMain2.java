package ref.ex;

public class ProductOrderMain2 {

    public static void main(String[] args) {
        ProductOrder[] poArray = new ProductOrder[3];

        poArray[0] = createOrder("두부", 2000, 2);
        poArray[1] = createOrder("김치", 5000, 1);
        poArray[2] = createOrder("콜라", 1500, 2);

        printOrder(poArray);

        int total = getTotalAmount(poArray);

        System.out.println("총 결제 금액 : " + total);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder po = new ProductOrder();

        po.productName = productName;
        po.price = price;
        po.quantity = quantity;

        return po;
    }

    static void printOrder(ProductOrder[] poArray) {
        for (ProductOrder i : poArray) {
            System.out.println("상품명 : " + i.productName + ", 가격 : " + i.price + ", 수량 : " + i.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] poArray) {
        int total = 0;

        for (ProductOrder i : poArray) {
            total += i.price * i.quantity;
        }

        return total;
    }
}