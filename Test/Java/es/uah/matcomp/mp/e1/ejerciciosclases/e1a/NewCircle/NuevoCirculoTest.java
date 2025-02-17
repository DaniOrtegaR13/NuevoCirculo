package es.uah.matcomp.mp.e1.ejerciciosclases.e1a.NewCircle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NuevoCirculoTest {

    @Test
    void getRadius() {
        NuevoCirculo ncr = new NuevoCirculo(3);
        assertEquals(3, ncr.getRadius());
    }

    @Test
    void setRadius() {
        NuevoCirculo ncr = new NuevoCirculo(3);
        ncr.setRadius(3.0f);
        assertEquals(3.0, ncr.getRadius());
    }

    @Test
    void getArea() {
        NuevoCirculo nca = new NuevoCirculo(3);
        assertEquals(3*3* Math.PI, nca.getArea());
    }

    @Test
    void getCircumference() {
        NuevoCirculo ncc = new NuevoCirculo(3);
        assertEquals(3*2* Math.PI, ncc.getCircumference());
    }

    @Test
    void testToString() {
        NuevoCirculo ncst = new NuevoCirculo(3);
        assertEquals(3, ncst.getRadius());
    }
}