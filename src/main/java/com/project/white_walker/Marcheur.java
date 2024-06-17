package com.project.white_walker;


import java.util.*;

public class Marcheur {
    private Lieu positionActuelle;

    public Marcheur(Lieu lieuDeDépart) {
        this.positionActuelle = lieuDeDépart;
    }

    public List<Lieu> marcherVers(Lieu destination, Carte carte) {
        Queue<List<Lieu>> queue = new LinkedList<>();
        Set<Lieu> visités = new HashSet<>();

        List<Lieu> cheminInitial = new ArrayList<>();
        cheminInitial.add(positionActuelle);
        queue.add(cheminInitial);
        visités.add(positionActuelle);

        while (!queue.isEmpty()) {
            List<Lieu> chemin = queue.poll();
            Lieu dernierLieu = chemin.get(chemin.size() - 1);

            if (dernierLieu.equals(destination)) {
                return chemin;
            }

            for (Rue rue : carte.getRues(dernierLieu)) {
                if (!visités.contains(rue.to)) {
                    visités.add(rue.to);
                    List<Lieu> nouveauChemin = new ArrayList<>(chemin);
                    nouveauChemin.add(rue.to);
                    queue.add(nouveauChemin);
                }
            }
        }
        return Collections.emptyList();
    }
}
