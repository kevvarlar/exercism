public class LogLine {

  private final LogLevel logLevel;
  private final String message;

  public LogLine(String logLine) {
    this.message = logLine.substring(7);
    switch (logLine.substring(1, 4)) {
      case "TRC":
        this.logLevel = LogLevel.TRACE;
        break;
      case "DBG":
        this.logLevel = LogLevel.DEBUG;
        break;
      case "INF":
        this.logLevel = LogLevel.INFO;
        break;
      case "WRN":
        this.logLevel = LogLevel.WARNING;
        break;
      case "ERR":
        this.logLevel = LogLevel.ERROR;
        break;
      case "FTL":
        this.logLevel = LogLevel.FATAL;
        break;
      default:
        this.logLevel = LogLevel.UNKNOWN;
        break;
    }
  }

  public LogLevel getLogLevel() {
    return logLevel;
  }

  public String getOutputForShortLog() {
    return logLevel.getEncodedLevel() + ":" + message;
  }
}
