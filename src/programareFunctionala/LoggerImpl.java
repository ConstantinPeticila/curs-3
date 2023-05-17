package programareFunctionala;

public class LoggerImpl implements Logger{
    @Override
    public void log(String input) {
        System.out.println("logare cu OOP: " + input);
    }
}
