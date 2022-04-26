import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Logger {

    private static Logger logger;
    protected int num = 1;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) return logger = new Logger();
        return logger;

    }

    public void log(String msg) {
        DateTimeFormatter formatter = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.MEDIUM);
        System.out.println("[" + LocalDateTime.now().format(formatter) + " " + num++ + "] " + msg);
    }

}
