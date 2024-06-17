package com.project.white_walker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RueTest {

    @Test
    public void testRueCreation() {
        Lieu lieu1 = new Lieu("HEI");
        Lieu lieu2 = new Lieu("Pullman");
        Rue rue = new Rue(lieu1, lieu2, "Andriatsihoarana");

        assertEquals(lieu1, rue.from);
        assertEquals(lieu2, rue.to);
        assertEquals("Andriatsihoarana", rue.nom);
    }
}