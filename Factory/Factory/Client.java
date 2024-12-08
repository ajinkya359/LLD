package Factory.Factory;

import Factory.SimpleFactory.logger.ILogger;

public class Client {
    public static void main(String[] args) {
        IFactory infoLoggerFactory = new InfoLoggerFactory();
        IFactory errorLoggerFactory = new ErrorLoggerFactory();

        ILogger infoLogger = infoLoggerFactory.createLogger();
        ILogger errorLogger =  errorLoggerFactory.createLogger();
        infoLogger.log("Info");
        errorLogger.log("Error");
    }
}
