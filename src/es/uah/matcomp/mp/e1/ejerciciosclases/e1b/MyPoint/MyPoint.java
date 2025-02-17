package es.uah.matcomp.mp.e1.ejerciciosclases.e1b.MyPoint;
import java.lang.Math;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {return x;}
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {return y;}

    public void setY(int y) {
        this.y=y;
    }
    public int[] getXY() {
        return new int[]{x, y};
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(int x1, int y1) {
        double dx1 = x1-x;
        double dy1 = y1 -y;

        return Math.sqrt(Math.pow(dx1,2)+ Math.pow(dy1,2));
    }
    public double distance(MyPoint another) {
        double dax = another.getX() - x;
        double day = another.getY() - y;
        return Math.sqrt(Math.pow(dax,2)+ Math.pow(day,2));

    }


    public double distance() {
        double dx0 = x;
        double dxy = y;
        return Math.sqrt(Math.pow(x,2)+ Math.pow(y,2));
    }
    public String toString(){
        return "(x " + x + "," + y + ")";
    }
}
