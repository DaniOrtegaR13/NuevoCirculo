package es.uah.matcomp.mp.e1.ejerciciosclases.e1c.supcShapesubcCRS;

public class Square extends Rectangle {
    private double side;

    public Square() {
        this.side = 1.0f;
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        super.setLength(side);
        super.setWidth(side);
    }
    public void setWidth(double side) {
        this.side = side;

    }
    public void setLength(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() +  "]";
    }
}
