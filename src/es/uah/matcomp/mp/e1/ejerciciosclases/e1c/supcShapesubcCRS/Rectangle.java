package es.uah.matcomp.mp.e1.ejerciciosclases.e1c.supcShapesubcCRS;
//1.3
public class Rectangle extends Shape{
    //public  Rectangle {  // Save as "Circle.java"
        // private instance variable, not accessible from outside this class
        private double length;
        private double width;

        // Constructors (overloaded)

        /**
         * Constructs a Circle instance with default value for radius and color
         */
        public Rectangle() {  // 1st (default) constructor
            super();
            length = 1.0f;
            width = 1.0f;
        }
        public Rectangle(double length, double width){
            super();
            this.length = length;
            this.width = width;




        }
    public Rectangle(double length, double width, String color, boolean filled){
            super(color, filled);
        this.length = length;
        this.width = width;

    }

    public double getLength(){
        return length;
    }

    public void setLength(double length) {
        this.length = length;   // "this.length" refers to the instance variable
        // "length" refers to the method's argument
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width) {
        this.width = width;   // "this.width" refers to the instance variable
        // "width" refers to the method's argument
    }

    /** Returns the area of this rectangle instance */
    public double getArea() {
        return length*width;

    }

    public double getPerimeter(){
        return 2 *(length + width);
    }
    /** Return a self-descriptive string of this instance in the form of rectangle[radius=?,color=?] */
    public String toString() {
        return "Rectangle[" + super.toString() + " length=" + length + " Width" + width +
                " Area " + getArea() + " Perimeter " + getPerimeter() +  " ]";
    }






    }



