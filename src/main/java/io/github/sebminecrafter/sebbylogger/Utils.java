package io.github.sebminecrafter.sebbylogger;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Utility class for SebbyLogger
 */
@SuppressWarnings("unused")
public class Utils {
    /**
     * Prevents instantiation
     */
    private Utils() {
        throw new UnsupportedOperationException(
                "This is a utility class and cannot be instantiated."
        );
    }
    /**
     * Formats the current date-time to a string
     * @return the formatted time surrounded by parentheses (HH.mm.ss)
     */
    public static String time() {
        return "(" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + ")";
    }

    /**
     * Gets the version of SebbyLogger and returns it as a string
     * @return the current SebbyLogger version as a string
     */
    public static String getVersion() {
        try (InputStream stream = Logger.class.getResourceAsStream("/version")) {
            if (stream == null) {
                return "Unknown";
            }
            return new String(stream.readAllBytes()).trim();
        } catch (Exception e) {
            return "Unknown";
        }
    }

    /**
     * Prints the current version of SebbyLogger
     */
    public static void printVersion() {
        String logo = "Using SebbyLogger version "+ getVersion();
        new Logger().info(logo,"SebbyLogger/Main");
    }
}
