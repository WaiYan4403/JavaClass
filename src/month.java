import java.util.ArrayList;

public class month {
    public static void main(String[] args) {
        ArrayList<String> futureMonths = new ArrayList<String>();

        switch (13){
            case 1:
                futureMonths.add("Jan");
                //break;
            case 2:
                futureMonths.add("Feb");
                //break;
            case 3:
                futureMonths.add("Mar");
                //break;
            case 4:
                futureMonths.add("Apr");
                //break;
            case 5:
                futureMonths.add("May");
                //break;
            case 6:
                futureMonths.add("Jun");
                //break;
            case 7:
                futureMonths.add("Jul");
                //break;
            case 8:
                futureMonths.add("Aug");
                //break;
            case 9:
                futureMonths.add("Sep");
                //break;
            case 10:
                futureMonths.add("Oct");
                //break;
            case 11:
                futureMonths.add("Nov");
                //break;
            case 12:
                futureMonths.add("Dec");
                break;
            default:
                break;
        }

        if(futureMonths.isEmpty()){
            System.out.println("Invalid month number");
        }
        else{
            for(String monthName : futureMonths){
                System.out.println(monthName);
            }
        }
    }
}
