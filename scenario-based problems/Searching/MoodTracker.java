import java.time.LocalDate;
import java.util.*;

public class MoodTracker {
    public static void main(String[] args) {
        HashMap<LocalDate, List<String>> moodLog = new HashMap<>();
        LocalDate today = LocalDate.now();

        logMood(moodLog, today.minusDays(1), "happy");
        logMood(moodLog, today.minusDays(3), "sad");
        logMood(moodLog, today.minusDays(5), "happy");
        logMood(moodLog, today.minusDays(10), "tired");

        searchMood(moodLog, "happy", 30);
    }

    static void logMood(HashMap<LocalDate, List<String>> log, LocalDate date, String mood) {
        log.putIfAbsent(date, new ArrayList<>());
        log.get(date).add(mood);
    }

    static void searchMood(HashMap<LocalDate, List<String>> log, String mood, int days) {
        LocalDate today = LocalDate.now();
        int count = 0;
        for (LocalDate date : log.keySet()) {
            if (!date.isBefore(today.minusDays(days))) {
                for (String m : log.get(date)) {
                    if (m.equalsIgnoreCase(mood)) {
                        System.out.println("Mood '" + mood + "' found on: " + date);
                        count++;
                    }
                }
            }
        }
        System.out.println("Total '" + mood + "' entries in last " + days + " days: " + count);
    }
}
