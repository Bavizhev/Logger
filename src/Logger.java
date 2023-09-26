
public class Logger {
    protected int num = 1;

    java.util.Date date = new java.util.Date();

    public void log(String msg) {
        System.out.println("[" + date + " " + num + "] " + msg);
        num++;
    }

    private static Logger logger;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }
}
