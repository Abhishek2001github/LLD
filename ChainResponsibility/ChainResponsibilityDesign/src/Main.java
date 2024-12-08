//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
LogProcessor logObject =new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
logObject.log(LogProcessor.ERROR,"ERROR");

    }
}