package com.isep.tp1;

public class Piste {
    private final int duration;
    private final String nom;

    public Piste(String nom) {
        this.nom = nom;
        this.duration = 60 * 3;
    }

    public String toString() {
        return "Piste name is : " + nom + " and duration is : " + duration + "sec.";
    }

    public Piste(int duration, String nom) {
        this.duration = duration;
        this.nom = nom;
    }

}
