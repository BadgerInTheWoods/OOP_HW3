package main.drugstore;

import main.drugstore.Component;
import java.util.*;

public class Pharmacy implements Iterator<Component>, Comparable<Pharmacy> {
    private List<Component> components = new ArrayList<>();
    private int index = 0;

    public void addComponents(Component ... components) {
        this.components.addAll(Arrays.asList(components));
    }

    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public Component next() {
        return components.get(index++);
    }


    // сравнение по количеству компонентов
    @Override
    public int compareTo(Pharmacy o) {
        return 0;
    }

    public int compareToQuantity(Pharmacy o) {
        return Integer.compare(this.components.size(), o.components.size());
    }

    public int getPowers() {
        int sum = 0;
        for (Component c : this.components) {
            sum += c.getPower();
        }
        return sum;
    }

    public int compareToPower(Pharmacy o) {
        int pow1 = this.getPowers();
        int pow2 = o.getPowers();

        return Integer.compare(pow1, pow2);
    }

//    @Override
//    public int compareTo(Pharmacy o) {
//        return Integer.compare();
//    }
}

