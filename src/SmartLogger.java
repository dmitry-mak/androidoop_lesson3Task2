import java.time.LocalDateTime;

public class SmartLogger implements Logger {

    int logNumber = 1;
    String info = "INFO";
    String error = "ERROR";

    @Override
    public void log(String msg) {

        if (!isError(msg)) {
            LocalDateTime date = LocalDateTime.now();
            System.out.printf("%s#%d [%s] %s\n", info, logNumber, date, msg);
        } else {
            LocalDateTime date = LocalDateTime.now();
            System.out.printf("%s#%d [%s] %s\n", error, logNumber, date, msg);
        }
        logNumber++;
    }

    public boolean isError(String msg) {
        String[] message = msg.split(" ");
        for (String word : message) {
            if (word.toLowerCase().contains("error")) {
                return true;
            }
        }
        return false;
    }
}

