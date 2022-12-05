package Points;

import java.util.ArrayList;
import java.util.List;

public class ListOfPoints {

    List<Point> pointlist ;

    public ListOfPoints(List<Point> pointlistww){
        this.pointlist= pointlistww;
}

    public void setPointlist(List<Point> pointlist) {
        this.pointlist = pointlist;
    }

    public List<Point> getPointlist() {
        return pointlist;
    }

    public ListOfPoints(){
    }
}
