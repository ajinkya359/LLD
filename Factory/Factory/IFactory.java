package Factory.Factory;

import Factory.SimpleFactory.logger.ILogger;

public interface IFactory {
    public ILogger createLogger();
}
