package com.isep.tp1;

public class Main {
    public static void main(String[] args) {
        Piste[] pistes = new Piste[4];
        pistes[0] = new Piste("La Marseillaise.");
        pistes[1] = new Piste(5 * 60, "I will Survive.");
        pistes[2] = new Piste(3 * 60, "Bande Organisée.");
        pistes[3] = new Piste(4 * 60, "Hot Stuff.");

        for (Piste current : pistes) {
            System.out.println(current);
        }
    }

}
