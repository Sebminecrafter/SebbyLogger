package io.github.sebminecrafter.sebbylogger;

import java.io.InputStream;
import java.util.Arrays;

/** Main class for SebbyLogger */
public class Main {
    /** SebbyLogger Version */
    public final static String SEBBYLOGGER_VERSION = loadVersion();

    /** Startup Message */
    private static void startupMessage() {
        String logo = "Using SebbyLogger version "+ SEBBYLOGGER_VERSION;
        new Logger().info(logo,"SebbyLogger/Main");
    }

    private static String loadVersion() {
        try (InputStream stream = Logger.class.getResourceAsStream("/version")) {
            if (stream == null) {
                return "Unknown";
            }
            return new String(stream.readAllBytes()).trim();
        } catch (Exception e) {
            return "Unknown";
        }
    }

    /** Main function */
    public static void main(String[] args) {
        if (!Arrays.asList(args).contains("nologo")) {
            startupMessage();
        }
    }
}