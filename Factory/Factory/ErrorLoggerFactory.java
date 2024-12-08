package Factory.Factory;

import Factory.SimpleFactory.logger.ErrorLogger;
import Factory.SimpleFactory.logger.ILogger;

public class ErrorLoggerFactory implements IFactory{
    @Override
    public ILogger createLogger(){
        return new ErrorLogger(); 
    }
}