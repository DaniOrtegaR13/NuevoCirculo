package es.uah.matcomp.mp.e1.ejerciciosclases.e1a.Date;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.text.DecimalFormat;

class DateTest {



    @Test
    void getDay() {
        Date dateday = new Date(1,1,1);
        assertEquals(1,dateday.getDay());
    }

    @Test
    void getMonth() {
        Date datemonth = new Date(1,1,1);
        assertEquals(1,datemonth.getMonth());
    }

    @Test
    void getYear() {
        Date dateyear = new Date(1,1,1);
        assertEquals(1,dateyear.getYear());
    }

    @Test
    void setDay() {
        Date dateday = new Date(1,1,1);
        dateday.setDay(1);
        assertEquals(1,dateday.getDay());
    }

    @Test
    void setMonth() {
        Date datemonth = new Date(1,1,1);
        datemonth.setMonth(1);
        assertEquals(1,datemonth.getMonth());
    }

    @Test
    void setYear() {
        Date dateyear = new Date(1,1,1);
        dateyear.setYear(1);
        assertEquals(1,dateyear.getYear());
    }

    @Test
    void setDate() {
    }

    @Test
    void testToString() {



    }
}