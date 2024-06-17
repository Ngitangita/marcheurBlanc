package com.project.white_walker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarteTest {
    private Carte carte;
    private Lieu HEI, Pullman, Balancoire, ESTI, Marais, Sekolintsika, Nexta, BoulevardDeLeurope;

    @BeforeEach
    public void setUp() {
        carte = new Carte();

        HEI = new Lieu("HEI");
        Pullman = new Lieu("Pullman");
        Balancoire = new Lieu("Balancoire");
        ESTI = new Lieu("ESTI");
        Marais = new Lieu("Marais");
        Sekolintsika = new Lieu("Sekolintsika");
        Nexta = new Lieu("Nexta");
        BoulevardDeLeurope = new Lieu("Boulevard de l'Europe");

        carte.ajouterLieu(HEI);
        carte.ajouterLieu(Pullman);
        carte.ajouterLieu(Balancoire);
        carte.ajouterLieu(ESTI);
        carte.ajouterLieu(Marais);
        carte.ajouterLieu(Sekolintsika);
        carte.ajouterLieu(Nexta);
        carte.ajouterLieu(BoulevardDeLeurope);

        carte.ajouterRue(HEI, Pullman, "Andriatsihoarana");
        carte.ajouterRue(Pullman, Balancoire, "Ranaivo");
        carte.ajouterRue(Balancoire, ESTI, "NonNommee");
        carte.ajouterRue(Balancoire, BoulevardDeLeurope, "NonNommee");
        carte.ajouterRue(BoulevardDeLeurope, ESTI, "NonNommee");
        carte.ajouterRue(Pullman, Nexta, "NonNommee");
        carte.ajouterRue(HEI, Sekolintsika, "NonNommee");
        carte.ajouterRue(Sekolintsika, Marais, "NonNommee");
        carte.ajouterRue(HEI, Balancoire, "NonNommee");
    }

    @Test
    public void testAjouterLieu() {
        Lieu lieu = new Lieu("New Lieu");
        carte.ajouterLieu(lieu);

        assertTrue(carte.getRues(lieu).isEmpty());
    }

    @Test
    public void testAjouterRue() {
        Lieu lieu1 = new Lieu("New Lieu1");
        Lieu lieu2 = new Lieu("New Lieu2");

        carte.ajouterLieu(lieu1);
        carte.ajouterLieu(lieu2);
        carte.ajouterRue(lieu1, lieu2, "New Rue");

        List<Rue> rues = carte.getRues(lieu1);
        assertEquals(1, rues.size());
        assertEquals("New Rue", rues.get(0).nom);
    }

    @Test
    public void testGetRues() {
        List<Rue> ruesHEI = carte.getRues(HEI);
        List<Rue> ruesPullman = carte.getRues(Pullman);

        assertEquals(3, ruesHEI.size());
        assertEquals(3, ruesPullman.size());
    }

    @Test
    public void testGetRuesFromNonExistentLieu() {
        Lieu nonExistent = new Lieu("NonExistent");
        List<Rue> rues = carte.getRues(nonExistent);

        assertTrue(rues.isEmpty());
    }

    @Test
    public void testAjouterLieuDeuxFois() {
        Lieu lieu = new Lieu("HEI");
        carte.ajouterLieu(lieu);
        carte.ajouterLieu(lieu);

       List<Rue> rues = carte.getRues(lieu);
        assertNotNull(rues);
    }
}