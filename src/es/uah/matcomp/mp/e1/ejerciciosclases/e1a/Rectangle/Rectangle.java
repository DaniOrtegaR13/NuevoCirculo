package es.uah.matcomp.mp.e1.ejerciciosclases.e1a.Rectangle;
//1.3
public class Rectangle {
    //public  Rectangle {  // Save as "Circle.java"
        // private instance variable, not accessible from outside this class
        private float length;
        private float width;

        // Constructors (overloaded)

        /**
         * Constructs a Circle instance with default value for radius and color
         */
        public Rectangle() {  // 1st (default) constructor
            length = 1.0f;
            width = 1.0f;
        }
        public Rectangle(float length, float width){
            this.length = length;
            this.width = width;

        }

    public float getLength(){
        return length;
    }

    public void setLength(float length) {
        this.length = length;   // "this.length" refers to the instance variable
        // "length" refers to the method's argument
    }

    public float getWidth(){
        return width;
    }

    public void setWidth(float width) {
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
        return "Rectangle[length=" + length + " Width" + width + " Area " + getArea() + " Perimeter " + getPerimeter() + " ]";
    }

    }



