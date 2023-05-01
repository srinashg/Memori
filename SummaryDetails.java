import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Summary {
    private static final int MAX_CHARACTERS = 2200;

    public static void main(String[] args) {
        // set reminder for user to write summary
        Date reminderTime = new Date();
        reminderTime.setHours(18); // set reminder time to 6:00 pm
        setReminder(reminderTime);

        // user starts writing summary
        String summaryText = "";
        while (true) {
            // get user input
            String input = getUserInput();

            // check if user is done writing
            if (input.equals("done")) {
                break;
            }

            // check if summary exceeds maximum character limit
            if (summaryText.length() + input.length() > MAX_CHARACTERS) {
                System.out.println("Error: Summary exceeds maximum length of " + MAX_CHARACTERS + " characters.");
            } else {
                // add input to summary
                summaryText += input;
            }
        }

        // user finalizes and submits summary
        saveSummary(summaryText);
    }

    public static void setReminder(Date reminderTime) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                // send reminder notification to user
                sendNotification("It's time to write your daily summary!");
            }
        }, reminderTime);
    }

    public static void sendNotification(String message) {
        // send notification to user's device
    }

    public static String getUserInput() {
        // get user input from UI
        return getUserInput();
    }

    public static void saveSummary(String summaryText) {
        // save summary to database or file system
    }

    public static int countWords(String text) {
        int wordCount = 0;

        // split text into words
        String[] words = text.split("\\s+");

        // count words
        for (String word : words) {
            if (word.matches("[a-zA-Z]+")) {
                wordCount++;
            }
        }

        return wordCount;
    }
}





