package by.belhard.j26.homeworks.hw9.task1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//@SuppressWarnings("all")
public class Task1 {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        /*for (int i = 0; i < 10; i++) {
            set.add((int) (Math.random() * 100));
        }*/
        while (set.size() < 10) {
            set.add(getRandomInt());
        }
        System.out.print(set);
        System.out.println("\t" + set.size());

        int bound = getRandomInt();
        System.out.println(bound);

        /*for (int i : set) {
            if (i < bound) {
                set.remove(i);
            }
        }*/

        /*Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next < bound) {
                iterator.remove();
            }
        }*/

//        set.removeIf(next -> next < bound);

        System.out.print(set);
        System.out.println("\t" + set.size());
    }

    private static int getRandomInt() {
        return (int) (Math.random() * 100);
    }
}
