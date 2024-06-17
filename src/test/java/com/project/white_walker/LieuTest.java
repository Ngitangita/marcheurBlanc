package com.project.white_walker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LieuTest {
    public void testLieuCreation() {
        Lieu lieu = new Lieu("HEI");
        assertEquals("HEI", lieu.nom);
    }

    @Test
    public void testLieuEquality() {
        Lieu lieu1 = new Lieu("HEI");
        Lieu lieu2 = new Lieu("HEI");
        Lieu lieu3 = new Lieu("Pullman");

        assertEquals(lieu1, lieu2);
        assertNotEquals(lieu1, lieu3);
    }

    @Test
    public void testLieuHashCode() {
        Lieu lieu1 = new Lieu("HEI");
        Lieu lieu2 = new Lieu("HEI");

        assertEquals(lieu1.hashCode(), lieu2.hashCode());
    }

    @Test
    public void testLieuToString() {
        Lieu lieu = new Lieu("HEI");
        assertEquals("Lieu{nom='HEI'}", lieu.toString());
    }
}