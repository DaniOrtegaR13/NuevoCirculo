package es.uah.matcomp.mp.e1.ejerciciosclases.e1a.Time;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void getHour() {
        Time timeH = new Time(3,14,16);

        assertEquals(3,timeH.getHour());
    }

    @Test
    void getMinute() {
        Time timeM = new Time(3,14,16);
        ;
        assertEquals(14,timeM.getMinute());
    }


    @Test
    void getSecond() {
        Time timeS = new Time(3,14,16);

        assertEquals(16,timeS.getSecond());
    }

    @Test
    void setHour() {
        Time timeH = new Time(3,14,16);
        timeH.setHour(7);
        assertEquals(7,timeH.getHour());
    }

    @Test
    void setMinute() {
        Time timeM = new Time(3,14,16);
        timeM.setMinute(2);
        assertEquals(2,timeM.getMinute());
    }

    @Test
    void setSecond() {
        Time timeS = new Time(3,14,16);
        timeS.setSecond(1);
        assertEquals(1,timeS.getSecond());
    }

    @Test
    void setTime() {
        Time timeT = new Time(3,14,16);
        timeT.setTime(16,18,3);
        assertEquals(16,timeT.getHour());
        assertEquals(18,timeT.getMinute());
        assertEquals(3,timeT.getSecond());
    }

    @Test
    void nextSecond() {
        Time timeT = new Time(16,18,3);
        timeT.setTime(16,18,3);
        assertEquals(16,timeT.getHour());
        assertEquals(18,timeT.getMinute());
        assertEquals(3,timeT.getSecond());

    }

    @Test
    void previousSecond() {
        Time timeT = new Time(3,14,16);
        timeT.setTime(16,18,3);
        assertEquals(16,timeT.getHour());
        assertEquals(18,timeT.getMinute());
        assertEquals(3,timeT.getSecond());
    }

    @Test
    void testToString() {
        Time timeST = new Time(3,14,16);
        assertEquals(3,timeST.getHour());
        assertEquals(14,timeST.getMinute());
        assertEquals(16,timeST.getSecond());
    }
}