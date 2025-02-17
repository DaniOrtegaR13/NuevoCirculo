package es.uah.matcomp.mp.e1.ejerciciosclases.e1b.MyLinemyPoint;
import java.lang.Math;


public class MyLine {

    private MyPoint begin;
    private MyPoint end;


public MyLine(int x1, int y1, int x2, int y2) {
    this.begin = new MyPoint(x1, y1);
     this.end = new MyPoint(x2, y2);
}
public MyLine (MyPoint begin, MyPoint end) {
    this.begin = begin;
    this.end = end;
    }
    public MyPoint getBegin () {
        return begin;
    }
    public void setBegin () {
    this.begin = begin;
    }
    public MyPoint getEnd () {
        return end;
    }
    public void setEnd () {
        this.end = end;
    }
    public int getBeginX () {
        return begin.getX();
    }
    public void setBeginX (int x1) {
         begin.setX(x1);

    }
    public int getBeginY () {
        return begin.getY();
    }
    public void setBeginY (int y1) {
         begin.setY(y1) ;
    }

    public int getEndX () {
        return end.getX();
    }
    public void setEndX (int x2) {
        end.setX(x2);

    }
    public int getEndY () {
        return end.getY();
    }
    public void setEndY (int y2) {
        end.setY(y2) ;
    }
    public int[] getBeginXY () {
        return new int[] {getBeginX(),getBeginY()};
    }
    public void setBeginXY (int x1, int y1) {
        begin.setXY(x1,y1) ;
    }

    public int[] getEndXY () {
        return new int[] {getEndX(),getEndY()};
    }
    public void setEndXY (int x2, int y2) {
        end.setXY(x2,y2);

    }

    public double[]  getLength(MyPoint end,MyPoint begin) {
        int distX = getEndX() - getBeginX();
     int distY = getEndY() - getBeginY() ;
    return new double[]{Math.sqrt(Math.pow(distX, 2) + Math.pow(distY, 2))};

    }

    public double getGradient() {
    int yDiff = getEndY() - getBeginY();
    int xDiff = getEndX() - getBeginX();
    return Math.atan2(yDiff,xDiff);
    }


    public String toString() {
        return "MyLine: begin=" + begin + ", end=" + end;
    }



}




