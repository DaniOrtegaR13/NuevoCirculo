package es.uah.matcomp.mp.e1.ejerciciosclases.e1c.Point2DyPoint3D;

public class Point3D extends Point2D{
    private float z;

    public Point3D() {
        super();
        this.z = 0.0f;
    }

    public Point3D(float x, float y, float z) {
        super(x,y);
        this.z = z;
    }
    public float getZ(){return z;}
    public void setZ(float z) {this.z = z;}

    public void setXYZ(float x, float y, float z) {
       super.setXY(x,y) ;

        this.z = z;
    }
    public float[] getXYZ() {

        return new float[] {super.getX(),super.getY(),z};

    }
    public String toString() {
        return "[x =" + super.getX() + "y= " + super.getY() + " z=" + z +"]";
    }


}
