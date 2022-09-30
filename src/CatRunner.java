public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Jar", 8, 95);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Jam", 4, 78);
        cat2.introduce();
        cat2.printCatInfo();
    }
}
