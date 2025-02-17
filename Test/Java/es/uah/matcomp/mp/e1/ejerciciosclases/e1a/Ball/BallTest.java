package es.uah.matcomp.mp.e1.ejerciciosclases.e1a.Ball;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    @Test
    void getX() {
        Ball ballx = new Ball(2.0F, 2.0F,1, 1.0F, 1.0F);
        assertEquals(2.0, ballx.getX() );
    }

    @Test
    void setX() {
        Ball ballx = new Ball(2.0F, 2.0F,1, 1.0F, 1.0F);
        ballx.setX(2.0F);
        assertEquals(2.0, ballx.getX() );

    }

    @Test
    void getY() {
        Ball bally = new Ball(2.0F, 1.0F,1, 1.0F, 1.0F);
        assertEquals(1.0, bally.getY() );
    }

    @Test
    void setY() {
        Ball bally = new Ball(2.0F, 1.0F,1, 1.0F, 1.0F);
        bally.setY(1.0F);
        assertEquals(1.0, bally.getY() );
    }

    @Test
    void getRadius() {
        Ball ballr = new Ball(2.0F, 2.0F,3, 2.0F, 3.0F);
        assertEquals(3, ballr.getRadius() );
    }

    @Test
    void setRadius() {
        Ball ballr = new Ball(2.0F, 2.0F,3, 2.0F, 3.0F);
        ballr.setRadius(3);
        assertEquals(3, ballr.getRadius() );
    }

    @Test
    void getXDelta() {
        Ball balldx = new Ball(2.0F, 2.0F,3, 2.0F, 3.0F);
        assertEquals(2.0, balldx.getXDelta() );
    }

    @Test
    void setXDelta() {
        Ball balldx = new Ball(2.0F, 2.0F,3, 2.0F, 3.0F);
        balldx.setXDelta(2.0F);
        assertEquals(2.0, balldx.getXDelta() );
    }

    @Test
    void getYDelta() {
        Ball balldy = new Ball(2.0F, 2.0F,3, 2.0F, 3.0F);
        assertEquals(3,0, balldy.getYDelta() );
    }

    @Test
    void setYDelta() {
        Ball balldy = new Ball(2.0F, 2.0F,3, 2.0F, 3.0F);
        balldy.setYDelta(3.0F);
        assertEquals(3,0, balldy.getYDelta() );
    }

    @Test
    void move() {
        Ball ballm = new Ball(2.0F, 1.0F,1, 1.0F, 1.0F);
        assertEquals(2.0, ballm.getX() );
        assertEquals(1.0, ballm.getY() );


    }

    @Test
    void reflectHorizontal() {
        Ball ballrh = new Ball(2.0F, 2.0F,3, 2.0F, 3.0F);
        assertEquals(-2.0, -ballrh.getXDelta() );
    }

    @Test
    void reflectVertical() {
        Ball ballrv = new Ball(2.0F, 2.0F,3, 2.0F, 3.0F);
        assertEquals(-3.0, -ballrv.getYDelta() );
    }

    @Test
    void testToString() {
        Ball ballst = new Ball(2.0F, 2.0F,3, 2.0F, 3.0F);
        assertEquals(2.0, ballst.getX() );
        assertEquals(2.0, ballst.getY() );
        assertEquals(3, ballst.getRadius() );
        assertEquals(2.0, ballst.getXDelta() );
        assertEquals(3.0, ballst.getYDelta() );

    }
}