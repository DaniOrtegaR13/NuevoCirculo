package es.uah.matcomp.mp.e1.ejerciciosclases.e1b.MyCircle;


import es.uah.matcomp.mp.e1.ejerciciosclases.e1b.MyPoint.MyPoint;

public class MyCircle {
    private MyPoint center;
    private int radius;

    public MyCircle() {
    }

    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x,y);
        this.radius = radius;

    }

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public MyPoint getCenter() {
        return center;
    }
    public void setCenter(MyPoint center) {
        this.center = center;
    }
    public int getCenterX() {
        return center.getX();
    }

    public void setCenterX(int x){
        center.setX(x);
    }

    public int getCenterY() {
        return center.getY();
    }
    public void setCenterY(int y){
        center.setY(y);
    }

    public int[] getCenterXY () {
        return new int[] {getCenterX(),getCenterY()};
    }
    public void setCenterXY (int x1, int y1) {
        center.setXY(x1,y1) ;
    }
    public String toString() {
        return "MyCircle[radius = " + radius + " center = " + center + "]";
    }

    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }
    public double distance(MyCircle another) {

       MyPoint a = new MyPoint(getCenterX(),getCenterY());
       MyPoint b = new MyPoint(another.getCenterX(), another.getCenterY());
       double dist = a.distance(b);
       return dist;
    }



}
