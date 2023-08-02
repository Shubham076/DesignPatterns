package Structural.Adapter;

//implements the target interface
public class LoggerAdapter implements OldLogger{
    NewLogger logger;
    public LoggerAdapter(NewLogger logger) {
        this.logger = logger;
    }
    @Override
    public void info(String msg) {
        logger.Info(msg);
    }

    @Override
    public void error(String msg) {
        logger.Error(msg);
    }
}
