
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Data {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat df1 = new SimpleDateFormat("dd-MMM-yyyy");
        Date date = null;
System.out.println("===============================");
        try {
            System.out.print("Enter star day(dd-mm-yyy): ");
            date = df.parse(sc.nextLine());
        } catch (Exception e){
        }

System.out.println("Star day: " + df1.format(date));

        long dateInms = date.getTime();

        Date endDay = new Date(dateInms + (7 * 24 * 60 * 60 * 1000));
        System.out.println("End day: " + df1.format(endDay));
        System.out.println("===============================");
    }

}
