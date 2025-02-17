package es.uah.matcomp.mp.e1.ejerciciosclases.e1a.Rectangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getLength() {
        Rectangle rectanL = new Rectangle(12.0f,15.0f);
        assertEquals(12.0f,rectanL.getLength());
    }

    @Test
    void setLength() {
        Rectangle rectanL = new Rectangle(12.0f,15.0f);
        rectanL.setLength(12.0f);
        assertEquals(12.0f,rectanL.getLength());
    }

    @Test
    void getWidth() {
        Rectangle rectanW = new Rectangle(12.0f,15.0f);
        assertEquals(15.0f,rectanW.getWidth());
    }

    @Test
    void setWidth() {
        Rectangle rectanW = new Rectangle(12.0f,15.0f);
        rectanW.setWidth(15.0f);
        assertEquals(15.0f,rectanW.getWidth());
    }

    @Test
    void getArea() {
        Rectangle rectanA = new Rectangle(12.0f,15.0f);
        assertEquals(180.0f,rectanA.getArea());
    }

    @Test
    void getPerimeter() {
        Rectangle rectanP = new Rectangle(12.0f,15.0f);
        assertEquals(54.0f,rectanP.getPerimeter());
    }

    @Test
    void testToString() {
        Rectangle rectanST = new Rectangle(12.0f,15.0f);
        assertEquals(12.0f,rectanST.getLength());
        assertEquals(15.0f,rectanST.getWidth());
    }
}