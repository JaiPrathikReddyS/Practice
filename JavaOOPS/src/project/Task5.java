package project;
import java.util.Calendar;
public class Task5 {
    public static String findDayOfWeekAfterKDays(String currentDay, int k) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Calendar calendar = Calendar.getInstance();
        int currentDayIndex = -1;
        for (int i = 0; i < daysOfWeek.length; i++) {
            if (daysOfWeek[i].equalsIgnoreCase(currentDay)) {
                currentDayIndex = i;
                break;
            }
        }
        if (currentDayIndex == -1) {
            return "Invalid day of week";
        }
        calendar.add(Calendar.DATE, k);
        int futureDayIndex = (currentDayIndex + k) % 7;
        return daysOfWeek[futureDayIndex];
    }
    public static void main(String[] args) {
        String day = "Monday";
        int k = 3;
        System.out.println("Day of the week is "+ findDayOfWeekAfterKDays(day, k));
        day = "Tuesday";
        k = 101;
        System.out.println("Day of the week is " + findDayOfWeekAfterKDays(day, k));
    }
}
