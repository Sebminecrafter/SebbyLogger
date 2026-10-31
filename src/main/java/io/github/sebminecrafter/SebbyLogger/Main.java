package io.github.sebminecrafter.SebbyLogger;

import java.util.Arrays;

/** Main class for SebbyLogger */
public class Main {
    /** SebbyLogger Version */
    public final static String SEBBYLOGGER_VERSION = "0.2";

    /** Startup Message */
    private static void startupMessage() {
        String logo = "Using SebbyLogger version "+ SEBBYLOGGER_VERSION;
        new Logger().info(logo,"SebbyLogger/Main");
    }

    /** Main function */
    public static void main(String[] args) {
        if (!Arrays.asList(args).contains("nologo")) {
            startupMessage();
        }
    }
}