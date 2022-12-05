package ClassInClass;

public class NewCircle
{
    int radius;
    private NewPoint newPoint;

    public  class NewPoint
    {
        private int x;
        private int y;

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public NewPoint(){

    }
        public NewPoint(int x,int y){
            this.x = x;
            this.y = y;
        }

        public NewPoint(NewPoint m){
            this.x = m.x;
            this.y = m.y;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

    public NewCircle(){

    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setNewPoint(NewPoint newPoint) {
        this.newPoint = newPoint;
    }

    public int getRadius() {
        return radius;
    }

    public NewPoint getNewPoint() {
        return new NewPoint(newPoint);
    }

    public NewCircle(int x, int y, int radius){
        NewPoint mnm = new NewPoint(x, y);
         this.newPoint = new NewPoint(mnm);
         this.radius = radius;
    }

    public NewCircle(NewPoint po,int radius){
        this.radius = radius;
        this.newPoint = new NewPoint(po);
    }
}
