import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LoggerImpl implements Logger{

    private static LoggerImpl logger;
    protected int num = 1;

    private LoggerImpl() {
    }

    public static LoggerImpl getInstance() {
        if (logger == null) return logger = new LoggerImpl();
        return logger;

    }

    public void log(String msg) {
        DateTimeFormatter formatter = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.MEDIUM);
        System.out.println("[" + LocalDateTime.now().format(formatter) + " " + num++ + "] " + msg);
    }

}
