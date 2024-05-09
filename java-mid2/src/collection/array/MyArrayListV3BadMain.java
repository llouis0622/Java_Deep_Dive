package collection.array;

public class MyArrayListV3BadMain {
    public static void main(String[] args) {
        MyArrayListV3 numberList = new MyArrayListV3();

        numberList.add(1);
        numberList.add(2);
        numberList.add("문자3");
        System.out.println(numberList);

        Integer num1 = (Integer) numberList.get(0);
        Integer num2 = (Integer) numberList.get(1);

        Integer num3 = (Integer) numberList.get(2);
    }
}