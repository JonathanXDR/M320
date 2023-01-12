package calendar;

import com.tbz.q3.DumbUserException;
import static java.time.temporal.ChronoUnit.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Calendar {
    private LocalDate start;
    private LocalDate end;
    private DateTimeFormatter formatter;
    private static Calendar instance;

    public static Calendar getInstance() {
        if (instance == null) {
            instance = new Calendar();
        }
        return instance;
    }

    public static void setInstance(String start, String end, String pattern) throws DumbUserException {
        instance = new Calendar(start, end, pattern);
    }

    private Calendar() {}

    private Calendar(String start, String end, String pattern) throws DumbUserException {
        DateTimeFormatter formatter;
        try {
            if (pattern.equals("")) formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            else {
                formatter = DateTimeFormatter.ofPattern(pattern);
            }
        } catch (IllegalArgumentException e) {
            throw new DumbUserException("\u001b[31m\n\"" + pattern + "\" can't be parsed by the DateTimeFormatter\u001b[0m");
        }
        this.formatter = formatter;
        try {
            this.start = LocalDate.parse(start, this.formatter);
            this.end = LocalDate.parse(end, this.formatter);
        } catch (DateTimeParseException e) {
            throw new DumbUserException("\u001b[31m\nCome on now... is this \"" + e.getParsedString() + "\" a date to you...\u001b[0m");
        }
    }

    public LocalDate getStart() {
        return start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public DateTimeFormatter getFormatter() {
        return formatter;
    }

    public long secondsBetween() {
        return SECONDS.between(this.start.atStartOfDay(), this.end.atStartOfDay());
    }

    public long minutesBetween() {
        return MINUTES.between(this.start.atStartOfDay(), this.end.atStartOfDay());
    }

    public long hoursBetween() {
        return HOURS.between(this.start.atStartOfDay(), this.end.atStartOfDay());
    }

    public long monthsBetween() {
        return MONTHS.between(this.start, this.end);
    }

    public long yearsBetween() {
        return YEARS.between(this.start, this.end);
    }
}
