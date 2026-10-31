package io.github.sebminecrafter.sebbylogger;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
    /** Returns the formatted date (HH.mm.ss) */
    public static String time() {
        return "(" + new SimpleDateFormat("HH.mm.ss").format(new Date()) + ")";
    }
}
