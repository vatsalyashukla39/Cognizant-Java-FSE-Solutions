import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConfigLoader {

    private static final Logger logger = LoggerFactory.getLogger(ConfigLoader.class);

    public void load(String fileName) {
        if (fileName == null || fileName.isEmpty()) {
            logger.error("Config file name is missing.");
            return;
        }

        if (!fileName.endsWith(".properties")) {
            logger.warn("Unexpected file extension for config file: {}", fileName);
        }

        logger.info("Loading config file: {}", fileName);
        // Simulate load
    }

    public static void main(String[] args) {
        ConfigLoader loader = new ConfigLoader();
        loader.load("");                            // logs ERROR
        loader.load("config.txt");                  // logs WARN
        loader.load("application.properties");      // logs INFO
    }
}