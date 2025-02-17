package es.uah.matcomp.mp.e1.ejerciciosclases.e1b.MyTriangle;
import es.uah.matcomp.mp.e1.ejerciciosclases.e1b.MyPoint.MyPoint;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {

        this.v1 = new MyPoint(x1,y1);
        this.v2 = new MyPoint(x2,y2);
        this.v3 = new MyPoint(x3,y3);

    }

    public String toString() {
        return "MyTriangle[v1 = " + v1 + " v2 = " + v2 + " v3 = " + v3 + "]";
    }

    public double getPerimeter() {
        double dist12 = v1.distance(v2);
        double dist13 = v1.distance(v3);
        double dist23 = v2.distance(v3);
        double perimeter = dist12 + dist13 + dist23;
        return perimeter;
    }


    public String Type() {
        String triangleis;
        double dist12 = v1.distance(v2);
        double dist13 = v1.distance(v3);
        double dist23 = v2.distance(v3);
        if (dist12 == dist13 && dist12 == dist23) {
             triangleis = "Equilatero";
        }
        if
        (dist12 != dist13 && dist12 != dist23) {

             triangleis = "Escaleno";
        } else {
             triangleis = "Isoceles";

        }

        return triangleis;
    }
}
