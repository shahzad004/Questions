package Questions;

public class DistancePoints {
    public static void main(String[] args) {
        double x1=4.0, y1=3.0;
        double x2=6.0 , y2=7.0;

        double distanceBtPoints = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));

        System.out.println("Distance between two points is : ");
        System.out.println(distanceBtPoints);
    }
}
