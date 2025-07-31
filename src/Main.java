public class Main {

    public static void main(String[] args) throws InterruptedException {

        Logger simpleLogger = new SimpleLogger();

        simpleLogger.log("Демонстрация работы простого логгера");

        Logger smartLogger = new SmartLogger();
        smartLogger.log("Умный логгер");
        Thread.sleep(500);
        smartLogger.log("второе сообщение");
        Thread.sleep(500);
        smartLogger.log("на всякий случай- третье");
        Thread.sleep(500);
        smartLogger.log("а здесь что-то с error");
    }
}
