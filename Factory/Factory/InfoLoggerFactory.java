package Factory.Factory;

import Factory.SimpleFactory.logger.ILogger;
import Factory.SimpleFactory.logger.InfoLogger;

public class InfoLoggerFactory implements IFactory {
    @Override
    public ILogger createLogger(){
        return new InfoLogger();
    }
}
