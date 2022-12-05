package Points;

import org.apache.tools.ant.types.selectors.SelectSelector;

public class Point implements Comparable<Point> {

   private int x;
   private int y;

   public Point(int xo,int yo){
       this.x = xo;
       this.y = yo;
   }

    public Point(Point point) {
       this.x = point.x;
       this.y = point.y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean method1_is_above(Point other){
        return (this.y > other.y);
    }

    public boolean method_is_under(Point other){
        return (!method1_is_above(other));
    }

    @Override
    public int compareTo(Point o) {
        if (this.y > o.y) {
            return 1;
        }
        else {
            return -1;
        }
    }}

