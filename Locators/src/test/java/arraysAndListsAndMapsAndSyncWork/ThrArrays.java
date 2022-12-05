package arraysAndListsAndMapsAndSyncWork;


import java.util.Arrays;

public class ThrArrays {

    public static void main(String[] args) {
        String[] colors = new String[4];
        colors[0] = "blue";
        colors[1] = "white";
        colors[2] = "red";
        colors[3] = "orange";
        //System.out.println(Arrays.toString(colors));

        String[][] stringss = new String[2][2];
        stringss[0][0] = "Ben";
        stringss[0][1] = "Mozal";
        stringss[1][0] = "et";
        stringss[1][1] = "ggg";

        for(int i=0 ; i< 2; i++){
            for (int j=0; j<2; j++){
                System.out.println(Arrays.deepToString(stringss));
            }

        }

    }}












