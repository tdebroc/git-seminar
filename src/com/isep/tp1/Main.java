package com.isep.tp1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Piste> pistes = new ArrayList<>();
        pistes.add(new Piste("La Marseillaise."));
        pistes.add(new Piste(5 * 60, "I will Survive."));
        pistes.add(new Piste(3 * 60, "Bande Organisée."));
        pistes.add(new Piste(4 * 60, "Hot Stuff."));
        pistes.add(new Piste(2 * 60, "Zumba."));
        pistes.add(new Piste(7 * 60, "Billy Jean"));
        pistes.add(new Piste(7 * 60, "Lola"));
        pistes.add(new Piste(7 * 60, "Bella Ciao"));
        pistes.add(new Piste(4 * 60, "Dance on the Mars"));
        pistes.add(new Piste(4 * 60, "Tu verras"));
        pistes.add(new Piste(4 * 60, "Californication"));


        for (Piste current : pistes) {
            System.out.println(current);
        }
    }

}
