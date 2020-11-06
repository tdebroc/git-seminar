package com.isep.tp1;

public class Piste {
    public static int MAX_DURATION = 60 * 30;
    private int duration;
    private String nom;

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

    public void printPiste(int i) {
        System.out.println("Piste " + i + " is " + getNom() + " and duration is " + duration);
    }

    public String getNom() {
        return nom;
    }

}
