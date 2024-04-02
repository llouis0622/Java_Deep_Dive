package lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();

        System.out.println("currentTimeMillis : " + currentTimeMillis);

        long currentTimeNano = System.nanoTime();

        System.out.println("currentTimeNano : " + currentTimeNano);

        System.out.println("getenv = " + System.getenv());

        System.out.println("properties = " + System.getProperties());
        System.out.println("Java version : " + System.getProperty("java.version"));

        char[] originalArray = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];

        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        System.out.println("copiedArray = " + copiedArray);
        System.out.println("Arrays.toString = " + Arrays.toString(copiedArray));

        System.exit(0);
    }
}