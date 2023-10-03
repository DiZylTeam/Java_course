package Java_course;

import java.util.ArrayList;
import java.util.List;

public class CatClinic {
    private List<Cat> listCats = new ArrayList<>();
    public void checkCat(Cat cat) {
        if (cat.getState()) {
            listCats.add(cat);
            System.out.println(listCats);
        }
        else {
            System.out.printf("The cat, " + cat.getName() + ", is health!");
        }
    }
}
