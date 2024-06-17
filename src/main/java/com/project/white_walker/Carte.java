package com.project.white_walker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Carte {
    private Map<Lieu, List<Rue>> adjList = new HashMap<>();

    public void ajouterLieu(Lieu lieu) {
        adjList.putIfAbsent(lieu, new ArrayList<>());
    }

    public void ajouterRue(Lieu from, Lieu to, String nom) {
        Rue rue = new Rue(from, to, nom);
        adjList.get(from).add(rue);
        adjList.get(to).add(new Rue(to, from, nom));
    }

    public List<Rue> getRues(Lieu lieu) {
        return adjList.getOrDefault(lieu, new ArrayList<>());
    }
}
