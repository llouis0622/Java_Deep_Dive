package poly.basic;

public class CastingMain1 {

    public static void main(String[] args) {
        Parent poly = new Parent();
//        poly.childMethod();

        Child child = (Child) poly;
        child.childMethod();
    }
}