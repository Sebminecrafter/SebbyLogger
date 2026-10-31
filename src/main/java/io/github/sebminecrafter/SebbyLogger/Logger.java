package io.github.sebminecrafter.SebbyLogger;

import java.util.Arrays;

public class Logger {
    /** INFO Message
     * @param source The source of the message (e.g. Game)
     * @param text The message to log/send to console
     */
    @SuppressWarnings("unused")
    public void info(String text, String source) {
        formatMessage(text, source, "INFO", "WHITE"); // print full info message
    }

    /** DEBUG Message
     * @param source The source of the message (e.g. Game)
     * @param text The message to log/send to console
     */
    @SuppressWarnings("unused")
    public void debug(String text, String source) {
        formatMessage(text, source, "DEBUG", "CYAN"); // print full debug message
    }

    /** WARN Message
     * @param source The source of the message (e.g. Game)
     * @param text The message to log/send to console
     */
    @SuppressWarnings("unused")
    public void warn(String text, String source) {
        formatMessage(text, source, "WARN", "YELLOW"); // print full warn
    }

    /** ERROR Message
     * @param source The source of the message (e.g. Game)
     * @param text The message to log/send to console
     */
    @SuppressWarnings("unused")
    public void error(String text, String source) {
        formatMessage(text, source, "ERROR", "RED"); // Print full error message
    }

    /** ERROR/TRACE Message
     * @param source The source of the message (e.g. Game)
     * @param text The message to log/send to console
     */
    @SuppressWarnings("unused")
    public void trace(String text, String source) {
        String stacktrace = Arrays.toString(Thread.currentThread().getStackTrace()) // Converts stacktrace (array) to string for printing
                .replace("[","").replace("]",""); // Removes the brackets from conversion
        String newMessage = text + " [Stack trace: " + stacktrace + "]"; // Adds new brackets where I want them
        formatMessage(newMessage, source, "ERROR/TRACE", "RED"); // Print full message
    }

    /** Private formatMessage to format and print a message, even with colors*/
    private static void formatMessage(String text, String source, String messageType, String color) {
        System.out.println(
                ConsoleColor.valueOf(color.toUpperCase()) + // Add color
                        Utils.time() + // Add formatted time
                        "[" + source + "]" + // Source of message (main, render, etc.)
                        "[" + messageType + "]: " + // Message type (info, warn, error, etc.)
                        text + // Just the message text
                        ConsoleColor.RESET // Reset color
        );
    }
}
