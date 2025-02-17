package es.uah.matcomp.mp.e1.ejerciciosclases.e1a.Ball;


public class Ball {

    private float x;
    private float y;
    private int radius;
    private float Xdelta;
    private float Ydelta;

    public Ball (float x, float y, int radius, float Xdelta, float Ydelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.Xdelta = Xdelta;
        this.Ydelta = Ydelta;

    }

    public float getX() {
        return x;
    }
    public void setX(float x) {this.x = x;}
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public float getXDelta() {
        return Xdelta;
    }
    public void setXDelta(float deltaX) {
        this.Xdelta = deltaX;
    }
    public float getYDelta() {
        return Ydelta;
    }
    public void setYDelta(float deltaY) {
        this.Ydelta = deltaY;
    }

    public void  move() {
        //MOve one step
        x += Xdelta;
        y +=Ydelta;
    }
    public void reflectHorizontal() {
        Xdelta= -Xdelta;
    }
    public void reflectVertical() {
        Ydelta= -Ydelta;
    }

    public String toString() {
        return "Ball[position =(" + x + "," + y + ") speed= (" + Xdelta + "," + Ydelta + ")]";
    }

}
