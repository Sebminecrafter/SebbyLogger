import io.github.sebminecrafter.sebbylogger.Logger;
import io.github.sebminecrafter.sebbylogger.Utils;

public class Demo {
    public static void main(String[] args) {
        Logger logger = new Logger("Demo", true);
        Utils.printVersion();
        logger.info("Hello World!");
        logger.warn("This is a warning!");
        logger.error("This is an error!");
        logger.debug("This is a debug message!");
        logger.trace("This is a trace message!");
    }
}
