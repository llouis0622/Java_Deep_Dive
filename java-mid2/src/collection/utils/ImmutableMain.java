package collection.utils;

import java.util.*;

public class ImmutableMain {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3);

        ArrayList<Integer> mutableList = new ArrayList<>(list);
        mutableList.add(4);
        System.out.println("mutableList = " + mutableList);
        System.out.println("mutableList class = " + mutableList.getClass());

        List<Integer> unmodifiableList = Collections.unmodifiableList(mutableList);
        System.out.println("unmodifiableList class = " + unmodifiableList.getClass());
    }
}