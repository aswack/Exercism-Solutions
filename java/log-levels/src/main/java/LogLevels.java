public class LogLevels {
    
    public static String message(String logLine) {
        int messageOpen = logLine.indexOf(':')+2;
        String messageOnly = logLine.substring(messageOpen);
        return messageOnly.trim();
    }

    public static String logLevel(String logLine) {
        String trimLogLine = logLine.trim();
        int logOpen = trimLogLine.indexOf('[')+1;
        int logClose = trimLogLine.indexOf(']');
        String logLevel = trimLogLine.substring(logOpen, logClose);
        return logLevel.toLowerCase();
    }

    public static String reformat(String logLine) {
        int logOpen = logLine.indexOf('[')+1;
        int logClose = logLine.indexOf(']');
        int messageOpen = logLine.indexOf(':')+2;
        String mainMessage = logLine.substring(messageOpen);
        String trimMessage = mainMessage.trim();
        String logLevel = logLine.substring(logOpen, logClose);
        String trimLogLevel = logLevel.trim();
        return trimMessage+" ("+trimLogLevel.toLowerCase()+")";
        
    }
}
