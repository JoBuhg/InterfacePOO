package intrfaceAval;

public class LoggerFactrory implements Logger  {
    public static Logger onConsole() {
        return new LoggerConsole();
    }
    public static Logger onFile(){
        return new LoggerFile();
    }
}