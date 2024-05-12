package collection.set;

public class StringHashMain {
    static final int CAPATICY = 10;
    public static void main(String[] args) {
        char charA = 'A';
        char charB = 'B';

        System.out.println(charA + " = " + (int)charA);
        System.out.println(charB + " = " + (int)charB);

        System.out.println("hashCode(A) = " + hashCode("A"));
        System.out.println("hashCode(B) = " + hashCode("B"));
        System.out.println("hashCode(AB) = " + hashCode("AB"));

        System.out.println("hashIndex(A) = " + hashIndex(hashCode("A")));
        System.out.println("hashIndex(B) = " + hashIndex(hashCode("B")));
        System.out.println("hashIndex(AB) = " + hashIndex(hashCode("AB")));
    }

    static int hashCode(String str) {
        char[] charArray = str.toCharArray();
        int sum = 0;

        for (char c : charArray) {
            sum += c;
        }

        return sum;
    }

    static int hashIndex(int value) {
        return value % CAPATICY;
    }
}