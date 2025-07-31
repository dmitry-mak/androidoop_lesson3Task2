import java.time.LocalDateTime;

public class SimpleLogger implements Logger {

    @Override
    public void log(String msg) {
        LocalDateTime date = LocalDateTime.now();
        System.out.println("[" + date + "] " + msg);
    }
}
