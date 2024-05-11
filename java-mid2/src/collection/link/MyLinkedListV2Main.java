package collection.link;

public class MyLinkedListV2Main {
    public static void main(String[] args) {
        MyLinkedListV2 list = new MyLinkedListV2();

        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        System.out.println("첫 번째 항목에 추가");
        list.add(0,"d");
        System.out.println(list);
        System.out.println("첫 번째 항목 삭제");
        list.remove(0);
        System.out.println(list);

        System.out.println("중간 항목에 추가");
        list.add(1,"e");
        System.out.println(list);
        System.out.println("중간 항목 삭제");
        list.remove(1);
        System.out.println(list);
    }
}