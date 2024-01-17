package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요 : ");
        int n = sc.nextInt();
        sc.nextLine();

        ProductOrder[] poArray = new ProductOrder[3];

        for (int i = 0; i < n; i++) {
            System.out.println(i + 1 + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명 : ");
            String productName = sc.nextLine();

            System.out.print("가격 : ");
            int price = sc.nextInt();

            System.out.print("수량 : ");
            int quantity = sc.nextInt();

            sc.nextLine();

            poArray[i] = createOrder(productName, price, quantity);
        }

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