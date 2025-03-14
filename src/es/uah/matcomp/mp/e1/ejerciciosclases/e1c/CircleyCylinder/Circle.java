package es.uah.matcomp.mp.e1.ejerciciosclases.e1c.CircleyCylinder;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }
    public Circle(double radius) {
        this.radius = radius;

    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor() {
        this.color = color;
    }
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }
    public String toString() {
        return "Cricle[radius= " + radius + "color = " + color + "]";
    }
}
