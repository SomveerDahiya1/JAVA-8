package LambdaExpression;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = ()->{
            System.out.println("Running");
        };
        runnable.run();



}
