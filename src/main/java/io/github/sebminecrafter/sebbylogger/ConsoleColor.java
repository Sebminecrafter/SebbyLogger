package io.github.sebminecrafter.sebbylogger;

/**
 * {@code enum} of all available colors in terminal/console.
 * <p>
 * Each constant holds an ANSI escape sequence. Printing a constant (or
 * concatenating it with a string) will be interpreted by most
 * terminals as a formatting change.
 */
@SuppressWarnings("unused")
public enum ConsoleColor {
    /** Resets colors */
    RESET("\033[0m"),

    // Normal colors

    /** Black foreground text */
    BLACK("\033[0;30m"),
    /** Red foreground text */
    RED("\033[0;31m"),
    /** Green foreground text */
    GREEN("\033[0;32m"),
    /** Yellow foreground text */
    YELLOW("\033[0;33m"),
    /** Blue foreground text */
    BLUE("\033[0;34m"),
    /** Purple (magenta) foreground text */
    PURPLE("\033[0;35m"),
    /** Cyan foreground text */
    CYAN("\033[0;36m"),
    /** White foreground text */
    WHITE("\033[0;37m"),

    // Bold

    /** Bold black foreground text */
    BLACK_BOLD("\033[1;30m"),
    /** Bold red foreground text */
    RED_BOLD("\033[1;31m"),
    /** Bold green foreground text */
    GREEN_BOLD("\033[1;32m"),
    /** Bold yellow foreground text */
    YELLOW_BOLD("\033[1;33m"),
    /** Bold blue foreground text */
    BLUE_BOLD("\033[1;34m"),
    /** Bold purple (magenta) foreground text */
    PURPLE_BOLD("\033[1;35m"),
    /** Bold cyan foreground text */
    CYAN_BOLD("\033[1;36m"),
    /** Bold white foreground text */
    WHITE_BOLD("\033[1;37m"),

    // Underline

    /** Underlined black foreground text */
    BLACK_UNDERLINED("\033[4;30m"),
    /** Underlined red foreground text */
    RED_UNDERLINED("\033[4;31m"),
    /** Underlined green foreground text */
    GREEN_UNDERLINED("\033[4;32m"),
    /** Underlined yellow foreground text */
    YELLOW_UNDERLINED("\033[4;33m"),
    /** Underlined blue foreground text */
    BLUE_UNDERLINED("\033[4;34m"),
    /** Underlined purple (magenta) foreground text */
    PURPLE_UNDERLINED("\033[4;35m"),
    /** Underlined cyan foreground text */
    CYAN_UNDERLINED("\033[4;36m"),
    /** Underlined white foreground text */
    WHITE_UNDERLINED("\033[4;37m"),

    // Background

    /** Black background */
    BLACK_BACKGROUND("\033[40m"),
    /** Red background */
    RED_BACKGROUND("\033[41m"),
    /** Green background */
    GREEN_BACKGROUND("\033[42m"),
    /** Yellow background */
    YELLOW_BACKGROUND("\033[43m"),
    /** Blue background */
    BLUE_BACKGROUND("\033[44m"),
    /** Purple (magenta) background */
    PURPLE_BACKGROUND("\033[45m"),
    /** Cyan background */
    CYAN_BACKGROUND("\033[46m"),
    /** White background */
    WHITE_BACKGROUND("\033[47m"),

    // Bright

    /** Bright black (gray) foreground text */
    BLACK_BRIGHT("\033[0;90m"),
    /** Bright red foreground text */
    RED_BRIGHT("\033[0;91m"),
    /** Bright green foreground text */
    GREEN_BRIGHT("\033[0;92m"),
    /** Bright yellow foreground text */
    YELLOW_BRIGHT("\033[0;93m"),
    /** Bright blue foreground text */
    BLUE_BRIGHT("\033[0;94m"),
    /** Bright purple (magenta) foreground text */
    PURPLE_BRIGHT("\033[0;95m"),
    /** Bright cyan foreground text */
    CYAN_BRIGHT("\033[0;96m"),
    /** Bright white foreground text */
    WHITE_BRIGHT("\033[0;97m"),

    // Bold Bright

    /** Bold bright black (gray) foreground text */
    BLACK_BOLD_BRIGHT("\033[1;90m"),
    /** Bold bright red foreground text */
    RED_BOLD_BRIGHT("\033[1;91m"),
    /** Bold bright green foreground text */
    GREEN_BOLD_BRIGHT("\033[1;92m"),
    /** Bold bright yellow foreground text */
    YELLOW_BOLD_BRIGHT("\033[1;93m"),
    /** Bold bright blue foreground text */
    BLUE_BOLD_BRIGHT("\033[1;94m"),
    /** Bold bright purple (magenta) foreground text */
    PURPLE_BOLD_BRIGHT("\033[1;95m"),
    /** Bold bright cyan foreground text */
    CYAN_BOLD_BRIGHT("\033[1;96m"),
    /** Bold bright white foreground text */
    WHITE_BOLD_BRIGHT("\033[1;97m"),

    // Bright Background

    /** Bright black (gray) background */
    BLACK_BACKGROUND_BRIGHT("\033[0;100m"),
    /** Bright red background */
    RED_BACKGROUND_BRIGHT("\033[0;101m"),
    /** Bright green background */
    GREEN_BACKGROUND_BRIGHT("\033[0;102m"),
    /** Bright yellow background */
    YELLOW_BACKGROUND_BRIGHT("\033[0;103m"),
    /** Bright blue background */
    BLUE_BACKGROUND_BRIGHT("\033[0;104m"),
    /** Bright purple (magenta) background */
    PURPLE_BACKGROUND_BRIGHT("\033[0;105m"),
    /** Bright cyan background */
    CYAN_BACKGROUND_BRIGHT("\033[0;106m"),
    /** Bright white background */
    WHITE_BACKGROUND_BRIGHT("\033[0;107m");

    /** The ANSI escape sequence represented by this constant */
    private final String value;

    /**
     * Creates a {@code ConsoleColor} with {@code value} as the escape sequence.
     *
     * @param value the ANSI escape sequence for the color or style
     */
    ConsoleColor(String value) {
        this.value = value;
    }

    /**
     * Returns the escape sequence for this color, so it can be
     * used directly in string concatenation or printing.
     *
     * @return the ANSI escape sequence for the color/style
     */
    @Override
    public String toString() {
        return value;
    }
}