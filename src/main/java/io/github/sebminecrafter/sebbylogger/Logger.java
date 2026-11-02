package io.github.sebminecrafter.sebbylogger;

import java.util.Arrays;

/**
 * A logger instance, for logging messages.
 * Can be instantiated with {@code new Logger()}
 */
@SuppressWarnings("unused")
public class Logger {
    private final boolean timestamps;
    private final String source;

    /**
     * A new logger instance, with default options
     */
    public Logger() {
        this.timestamps = true;
        this.source = null;
    }

    /**
     * A new logger, with options
     * @param timestamps whether timestamps should be added to the beginning of logged messages
     */
    public Logger(boolean timestamps) {
        this.timestamps = timestamps;
        this.source = null;
    }

    /**
     * A new logger, with options
     * @param source the default source for log messages
     */
    public Logger(String source) {
        this.source = source;
        this.timestamps = true;
    }

    /**
     * A new logger, with options
     * @param source the default source for log messages
     * @param timestamps whether timestamps should be added to the beginning of logged messages
     */
    public Logger(String source, boolean timestamps) {
        this.source = source;
        this.timestamps = timestamps;
    }

    /** INFO Message
     * @param text The message to log/send to console
     * @param source The source of the message (e.g. Game)
     */
    public void info(String text, String source) {
        printMessage(text, source, "INFO", "WHITE"); // print full info message
    }

    /** DEBUG Message
     * @param text The message to log/send to console
     * @param source The source of the message (e.g. Game)
     */
    public void debug(String text, String source) {
        printMessage(text, source, "DEBUG", "CYAN"); // print full debug message
    }

    /** WARN Message
     * @param text The message to log/send to console
     * @param source The source of the message (e.g. Game)
     */
    public void warn(String text, String source) {
        printMessage(text, source, "WARN", "YELLOW"); // print full warn
    }

    /** ERROR Message
     * @param text The message to log/send to console
     * @param source The source of the message (e.g. Game)
     */
    public void error(String text, String source) {
        printMessage(text, source, "ERROR", "RED"); // Print full error message
    }

    /** ERROR/TRACE Message
     * @param text The message to log/send to console
     * @param source The source of the message (e.g. Game)
     */
    public void trace(String text, String source) {
        String stacktrace = Arrays.toString(Thread.currentThread().getStackTrace()) // Converts stacktrace (array) to string for printing
                .replace("[","").replace("]",""); // Removes the brackets from conversion
        String newMessage = text + " [Stack trace: " + stacktrace + "]"; // Adds new brackets where I want them
        printMessage(newMessage, source, "ERROR/TRACE", "RED"); // Print full message
    }


    /** INFO Message
     * @param text The message to log/send to console
     */
    public void info(String text) {
        printMessage(text, this.source, "INFO", "WHITE"); // print full info message
    }

    /** DEBUG Message
     * @param text The message to log/send to console
     */
    public void debug(String text) {
        printMessage(text, this.source, "DEBUG", "CYAN"); // print full debug message
    }

    /** WARN Message
     * @param text The message to log/send to console
     */
    public void warn(String text) {
        printMessage(text, this.source, "WARN", "YELLOW"); // print full warn
    }

    /** ERROR Message
     * @param text The message to log/send to console
     */
    public void error(String text) {
        printMessage(text, this.source, "ERROR", "RED"); // Print full error message
    }

    /** ERROR/TRACE Message
     * @param text The message to log/send to console
     */
    public void trace(String text) {
        String stacktrace = Arrays.toString(Thread.currentThread().getStackTrace()) // Converts stacktrace (array) to string for printing
                .replace("[","").replace("]",""); // Removes the brackets from conversion
        String newMessage = text + " [Stack trace: " + stacktrace + "]"; // Adds new brackets where I want them
        printMessage(newMessage, this.source, "ERROR/TRACE", "RED"); // Print full message
    }

    /**
     * Private function to format and print a message, even with colors
     */
    private void printMessage(String text, String source, String messageType, String color) {
        if (source == null) source = "Unknown";

        if (timestamps) System.out.print(Utils.time());              // Add formatted time, if enabled
        System.out.print("[" + source + "]");                        // Source of message (main, render, etc.)
        System.out.print(ConsoleColor.valueOf(color.toUpperCase())); // Add color
        System.out.print("[" + messageType + "]: ");                 // Message type (info, warn, error, etc.)
        System.out.print(text);                                      // Print the message
        System.out.print(ConsoleColor.RESET);                        // Reset color
        System.out.print("\n");                                      // Newline
    }
}
