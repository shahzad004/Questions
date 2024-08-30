package Questions;

public class MintuesToHours {
    public static void main(String[] args) {
        int totalMinutes=185;
        int hours= totalMinutes/60;
        int mintues=totalMinutes%60;

        System.out.println("Hours and mintues remaining are : ");
        System.out.println("Hours " +hours+" mintues "+ mintues);
    }
}
