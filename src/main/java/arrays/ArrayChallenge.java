package arrays;

import java.util.Objects;
import java.util.Scanner;

public class ArrayChallenge {

    /*
    Declare and initialize an array of the 5 weekdays: Monday, Tuesday, ..., Friday — without using new.
Print the first and last day in the array.
Replace Wednesday with WEDNESDAY (all caps).
Print the entire updated array using a for loop.
     */
    public static void main(String[] args) {
      String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday"};
        System.out.println("First element:"+days[0]);
        System.out.println("Last element:"+days[days.length-1]);
        days[2] = days[2].toUpperCase();
        System.out.println("Replace wednesday to caps"+days[2].toUpperCase());
        System.out.println("Print all the days:");
        for(String day : days) {
            System.out.println(day);
        }
        System.out.println("Do you want to update any days to uppercase?, Enter the index:");
        Scanner daysToUppercase = new Scanner(System.in);
        int index = daysToUppercase.nextInt();
        if (index >= 0 && index < days.length) {
            days[index] = days[index].toUpperCase();
        } else {
            System.out.println("Invalid index. Please enter a number between 0 and " + (days.length - 1));
        }
        for(String day : days) {
            System.out.println(day);
        }

        System.out.println("Do you want to update any days to uppercase?, Enter the name of day:");
        Scanner dayNameToUppercase = new Scanner(System.in);
        String dayName = dayNameToUppercase.nextLine();
        boolean notMatchAnyDay= true;
        for(int i=0;i<days.length;i++) {
            if(days[i].equalsIgnoreCase(dayName)) {
                notMatchAnyDay = false;
                days[i] = days[i].toUpperCase();
                break;
            }
        }
        if(notMatchAnyDay) {
            System.out.println("Invalid given day. Please enter a valid day");
            dayNameToUppercase.close();
        }



    }
}
