package cond.ex;

public class CondOpEx {

    public static void main(String[] args) {
        int a = 10, b = 20;
        int big = (a > b) ? a : b;

        System.out.println("더 큰 숫자는 " + big + "입니다.");
    }
}