package Factory.SimpleFactory.logger;

public class LoggerFactory {
    public static ILogger createLogger(LogLevel level){
        switch (level) {
            case DEBUG:
                return new DebugLogger();
            case INFO:
                return new InfoLogger();
            case ERROR:
                return new ErrorLogger();
            default:
                return new DebugLogger();
        }
    }
}
