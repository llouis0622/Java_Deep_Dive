package operator;

public class Operator1 {

    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        int sum = a + b; // 덧셈
        System.out.println("a + b = " + sum);

        int diff = a - b; // 뺄셈
        System.out.println("a - b = " + diff);

        int multi = a * b; // 곱셈
        System.out.println("a * b = " + multi);

        int div = a / b; // 나눗셈
        System.out.println("a / b = " + div);

        int mod = a % b; // 나머지
        System.out.println("a % b = " + mod);
    }
}