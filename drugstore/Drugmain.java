package main.drugstore;

import main.drugstore.components.Azitronite;
import main.drugstore.components.Penicillin;
import main.drugstore.components.Water;

import java.util.*;

//Добавить интерфейс Copmparable<Pharmacy> к классу Pharmacy. Переопределить метод compareTo()
//подсказка: можно добавить, а можно не добавлять в класс поля;
//
//Создать несколько экземпляров Pharmacy, добавить их в ArrayList, написать метод,
// выводящий Pharmacy в отсортированном виде.
//
//*(усложненное, не обязательное) Постараться написать еще 1 метод сортировки лекарств,
// но уже по другому параметру

public class Drugmain {

    public static void main(String[] args) {
        Component water = new Water("Water", 10D, 1);
        Component azitronite = new Azitronite("Azitronite", 2D, 14);
        Component penicillin = new Penicillin("penicillin", 1.6D, 6);


        Pharmacy p1 = new Pharmacy();
        p1.addComponents(water, penicillin);

        Pharmacy p2 = new Pharmacy();
        p2.addComponents(azitronite);

        Pharmacy p3 = new Pharmacy();
        p3.addComponents(azitronite, penicillin, azitronite);

        List<Pharmacy> pharmacys = new ArrayList<>();

        pharmacys.add(p1);
        pharmacys.add(p2);
        pharmacys.add(p3);

        //System.out.println(pharmacys);

        //---------------------------------------------------------------------
        //первые два сорта это сортировка по количеству компонентов, последний сортирует по сумме сил компонентов
        //Collections.sort(pharmacys,Comparator.naturalOrder());
        //Collections.sort(pharmacys,Pharmacy::compareTo);

        Collections.sort(pharmacys,Pharmacy::compareToPower);
        //---------------------------------------------------------------------
        //System.out.println(pharmacys);


        for (Pharmacy i : pharmacys) {
            Iterator<Component> iterator = i;
            while (iterator.hasNext()) {
                System.out.println(i.next().toString());
            }
            System.out.println();
        }


//        for (Component c : p2) {
//            System.out.println(c);
//        }

    }
}
