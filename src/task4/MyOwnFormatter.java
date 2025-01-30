package task4;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class MyOwnFormatter extends Formatter {

    @Override
    public String format(LogRecord record) {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        String date = formatter.format(localDateTime);
        String level = record.getLevel().toString();
        String message = formatMessage(record);
        String className = record.getLoggerName();
        Throwable throwable = record.getThrown();
        if (Objects.nonNull(throwable)) {
            return date + " " + level + " " + className + ": " + message + "\n" + throwable.getMessage();
        }
        return date + " " + level + " " + className + ": " + message;
    }
}
