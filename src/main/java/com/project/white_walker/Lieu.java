package com.project.white_walker;

import java.util.Objects;

public class Lieu {
    String nom;

    public Lieu(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Lieu{" +
                "nom='" + nom + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lieu lieu = (Lieu) o;
        return Objects.equals(nom, lieu.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom);
    }
}
