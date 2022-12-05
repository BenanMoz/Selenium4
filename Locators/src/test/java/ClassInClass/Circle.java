package ClassInClass;

public class Circle {

   public static int serialNumber;
   private Point center;
    private int radius;
    int counter = 0;

    public Circle(int x,int counter, Point pop) {
        this.radius = x;
        this.center = new Point(pop);
        counter++;
        serialNumber = counter;

    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                ", counter=" + counter +
                '}';
    }

    public Circle(int x, int y, int r, int counter){
        this.center = new Point(x,y);
        this.radius = r;
        counter++;
        serialNumber = counter;

    }

    public static int getSerialNumber() {
        return serialNumber;
    }

    public static void setSerialNumber(int serialNumber) {
        Circle.serialNumber = serialNumber;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}

