import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Task015 {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>(List.of(1, 5, 10, 15, 20, 5));
        Set<Integer> hashSetL = new LinkedHashSet<>(List.of(1, 5, 10, 15, 20, 5));
        Set<Integer> treeSet = new TreeSet<>(List.of(1, 5, 10, 15, 20, 5));
        System.out.println(hashSet);
        System.out.println(hashSetL);
        System.out.println(treeSet);
    }
}
