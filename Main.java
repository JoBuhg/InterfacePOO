package intrfaceAval;

public class Main {
    public static void main(String[] args) {
        Logger loggerConsole = LoggerFactrory.onConsole();
        Logger loggerFile = LoggerFactrory.onFile();

        loggerConsole.log(Level.DEBUG, "Esta é uma mensagem de debug");
        loggerConsole.log(Level.WARNING, "Esta é uma mensagem de aviso");
        loggerConsole.log(Level.ERROR, "Esta é uma mensagem de erro");

        loggerFile.log(Level.DEBUG, "Esta é uma mensagem de debug");
        loggerFile.log(Level.WARNING, "Esta é uma mensagem de aviso");
        loggerFile.log(Level.ERROR, "Esta é uma mensagem de erro");
    }
}