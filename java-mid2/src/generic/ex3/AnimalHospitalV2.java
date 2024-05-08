package generic.ex3;

public class AnimalHospitalV2<T> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        animal.toString();
        animal.equals(null);
    }

    public T getBigger(T target) {
        return null;
    }
}