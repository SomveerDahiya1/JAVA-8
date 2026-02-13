package LambdaExpression;

public class Main {
    public static void main(java.lang.String[] args) {
        Runnable runnable = () -> {
            System.out.println("Running");
        };
        runnable.run();

        Calc calc = (a,b)->a+b ;
        System.out.println(calc.add(5,10));

        String s =(string) -> {
            if(string.length()<=5) return true ;
            return false ;
        } ;
        System.out.println(s.checkLength("Hey"));
    }
}
