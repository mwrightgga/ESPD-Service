package eu.europa.ec.grow.espd.xml;

import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * @author vigi
 */
public final class LocalDateAdapter {

    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormat.forPattern("YYYY-dd-MM");

    private LocalDateAdapter() {

    }

    public static LocalDate unmarshal(String v) {
        return LocalDate.parse(v, DATE_FORMAT);
    }

    public static String marshal(LocalDate v) {
        return v.toString(DATE_FORMAT);
    }
}
