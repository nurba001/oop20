package Laba;

import java.time.MonthDay;
import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("raspisanie Java6");
        System.out.print("Vvodyte text: ");
        String name =scanner.nextLine().toUpperCase(Locale.ROOT);

        switch (name) {
            case "MONDAY":

                System.out.println(Week.MONDAY.getIn());

            case "TUESDAY":
                System.out.println(Week.TUESDAY.getIn());
                break;
            case "WEDNESDAY":
                System.out.println(Week.WEDNESDAY.getIn());
                break;
            case "THURSDAY":
                System.out.println(Week.THURSDAY.getIn());
                break;
            case "FRIDAY":
                System.out.println(Week.FRIDAY.getIn());
                break;
            case "SATRUDAY":
            case "SUNDAY":
                System.out.println(Week.SATRUDAY.getIn());
                break;
            case "WEEK":
                for (Week week : Week.values()
                ) {
                    System.out.println(week);
                    System.out.println(" " + week.getIn());
                }

                break;
            default:
                System.out.println("----------");
                break;
        }

    }
}
