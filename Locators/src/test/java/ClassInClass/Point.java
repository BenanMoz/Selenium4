package ClassInClass;

public class Point
{
  private int x;
   private int y;

   public Point(int xo,int yo){
       this.x = xo;
       this.y = yo;
   }

   public Point(Point other){
       x = other.x;
       y = other.y;
   }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean is_above(Point other){
       return (this.y > other.y);
    }
}
