package Creational.SingleTon;

class Logger{
    private static Logger logger;
    private Logger(){}

    //thread safe singleton implementation
    public static Logger getLogger() {
        if (logger == null) {
            synchronized (Logger.class) {

                //double locking
                if (logger == null) {
                    logger = new Logger();
                }
            }
        }
        return logger;
    }
}
