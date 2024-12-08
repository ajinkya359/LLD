package Factory.SimpleFactory;

import Factory.SimpleFactory.logger.ILogger;
import Factory.SimpleFactory.logger.LogLevel;
import Factory.SimpleFactory.logger.LoggerFactory;

public class Client {
    public static void main(String[] args) {
        ILogger debugLogger = LoggerFactory.createLogger(LogLevel.DEBUG);
        ILogger errorLogger = LoggerFactory.createLogger(LogLevel.ERROR);
        ILogger infoLogger = LoggerFactory.createLogger(LogLevel.INFO);
        
        debugLogger.log("Debug msg");
        infoLogger.log(("Info message"));

    }
}

//The problem with this, is that this is not following 
//O -> cause we need to make changes in the Factory class to add something new
// Dependency inversion ==> the factoru which is a higher class is dependenton the enum