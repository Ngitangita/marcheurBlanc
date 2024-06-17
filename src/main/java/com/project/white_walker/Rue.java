package com.project.white_walker;

public class Rue {
    Lieu from;
    Lieu to;
    String nom;

    public Rue(Lieu from, Lieu to, String nom) {
        this.from = from;
        this.to = to;
        this.nom = nom;
    }
}
