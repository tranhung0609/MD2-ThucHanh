package JavaCollection.ThucHanh.HashMapHashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Studen studen1 = new Studen("Hung", 20, "ND");
        Studen studen2 = new Studen("Hydra", 24, "HN");
        Studen studen3 = new Studen("Edward", 26, "ND");

        Map<Integer, Studen> studenMap = new HashMap<Integer, Studen>();
        studenMap.put(2 , studen1);
        studenMap.put(3 , studen2);
        studenMap.put(4 , studen3);

        for (Map.Entry<Integer, Studen> studen : studenMap.entrySet()) {
            System.out.println(studen.toString());
        }

        System.out.println("--------------");
        Set<Studen> studens = new HashSet<Studen>();
        studens.add(studen1);
        studens.add(studen2);
        studens.add(studen3);

        for (Studen studen : studens) {
            System.out.println(studen.toString());
        }
    }
}
