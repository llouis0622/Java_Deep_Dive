package class1.ex;

public class ProductOrderMain {

    public static void main(String[] args) {
        ProductOrder[] poArray = new ProductOrder[3];

        ProductOrder po1 = new ProductOrder();
        po1.productName = "두부";
        po1.price = 2000;
        po1.quantity = 2;
        poArray[0] = po1;

        ProductOrder po2 = new ProductOrder();
        po2.productName = "김치";
        po2.price = 5000;
        po2.quantity = 1;
        poArray[1] = po2;

        ProductOrder po3 = new ProductOrder();
        po3.productName = "콜라";
        po3.price = 1500;
        po3.quantity = 2;
        poArray[2] = po3;

        int total = 0;

        for (ProductOrder p : poArray) {
            System.out.println("상품명 : " + p.productName + ", 가격 : " + p.price + ", 수량 : " + p.quantity);

            total += p.price * p.quantity;
        }

        System.out.println("총 결제 금액 : " + total);
    }
}