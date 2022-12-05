package Points;

import java.util.Map;

public class MapOfListsOfPoints {
     Map<String,ListOfPoints> mapo;

     public MapOfListsOfPoints(){
     }

     public MapOfListsOfPoints(Map<String,ListOfPoints> mape){
         mapo = mape;
     }

    public Map<String, ListOfPoints> getMapo() {
        return mapo;
    }

    public void setMapo(Map<String, ListOfPoints> mapo) {
        this.mapo = mapo;
    }
}
