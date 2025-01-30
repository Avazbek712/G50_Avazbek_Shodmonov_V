package task4;

import java.io.IOException;
import java.util.logging.*;

public class App {
    static Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        MyOwnFormatter myOwnFormatter = new MyOwnFormatter();
        logger.setLevel(Level.ALL);
        Handler handler = null;
        try {
            handler = new FileHandler("Logging.txt" , true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        handler.setFormatter(myOwnFormatter);
        logger.addHandler(handler);
        logger.log(Level.INFO, "Hello World");
    }
}
