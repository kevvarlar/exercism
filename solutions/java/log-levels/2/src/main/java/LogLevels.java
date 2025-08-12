public class LogLevels {
    
    public static String message(String logLine) {
      int cutAt = logLine.indexOf(":")+ 1;
      String result = logLine.substring(cutAt, logLine.length());
      return result.trim();
    }

    public static String logLevel(String logLine) {
      int end = logLine.indexOf("]") + 1;
      return logLine.substring(0, end);
    }

    public static String reformat(String logLine) {
      return message(logLine) + "(" + logLevel(logLine) + ")";
    }
}
