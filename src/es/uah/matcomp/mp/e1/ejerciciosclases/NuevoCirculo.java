package es.uah.matcomp.mp.e1.ejerciciosclases;
public class NuevoCirculo {  // Save as "NuevoCirculo.java"
    // private instance variable, not accessible from outside this class
    private double radius;

    // Constructors (overloaded)

    /**
     * Constructs a Circle instance with default value for radius and color
     */
    public NuevoCirculo() {  // 1st (default) constructor
        radius = 1.0;

    }

    /** Constructs a Circle instance with the given radius and default color */
    public NuevoCirculo(double radius) {
        this.radius = radius;   // "this.radius" refers to the instance variable
        // "radius" refers to the method's parameter


    }

    /** Returns the radius */
    public double getRadius() {
        return radius;
    }


    /** Sets the radius to the given value */
    public void setRadius(double radius) {
        this.radius = radius;   // "this.radius" refers to the instance variable
        // "radius" refers to the method's argument
    }

    /** Returns the area of this Circle instance */
    public double getArea() {
        return radius*radius*Math.PI;

    }

    public double getCircumference(){
        return 2 *radius*Math.PI;
    }
    /** Return a self-descriptive string of this instance in the form of Circle[radius=?,color=?] */
    public String toString() {
        return "Circle[radius=" + radius + " ]";
    }
}