package es.uah.matcomp.mp.e1.ejerciciosclases.e1c.PointMovablePoint;

public class MovablePoint extends Point  {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint() {
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }
    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float getXSpeed() {
        return xSpeed;
    }
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;

    }

    public float getYSpeed() {
        return ySpeed;
    }
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;

    }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[] {xSpeed, ySpeed};
    }
   public String toString() {
       return "(x,y) = " + super.toString() + "speed = ( xS " + getXSpeed() + " yS = " + getYSpeed() + ")";
   }
   public MovablePoint move() {

        float x = (getX() + xSpeed);
        float y =(getY() + ySpeed);
        return this;
   }


}
