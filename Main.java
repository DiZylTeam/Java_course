package Java_course;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", new ArrayList<>(List.of("beshenstvo", "klesch")), "Siamskiy kot", 5, new Date(), "male", true);
        Cat cat2 = new Cat("Max", new ArrayList<>(List.of("beshenstvo")), "Sfinks", 2, new Date(), "famale", false);
        Cat cat3 = new Cat("Bob", new ArrayList<>(List.of("klesch")), "No breed", 3, new Date(), "male", true);

        CatClinic catClinic = new CatClinic();
        catClinic.checkCat(cat1);
    }
}
