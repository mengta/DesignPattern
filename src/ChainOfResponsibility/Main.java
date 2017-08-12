package ChainOfResponsibility;

public class Main {
    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger=new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger=new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger=new ConsoleLogger(AbstractLogger.INFO);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }
    public static void main(String[] args){
        AbstractLogger loggerChain=getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO,"info");
        loggerChain.logMessage(AbstractLogger.DEBUG,"debug level");
        loggerChain.logMessage(AbstractLogger.ERROR,"error level");
    }
}
