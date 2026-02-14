package LambdaExpression;

public class Main {
    public static void main(java.lang.String[] args) {
        Runnable thread = () -> {
            for(int i=1 ; i<=10 ;i++){
                System.out.println(i);
                try{
                    Thread.sleep(1000);
                }
                catch (Exception e){
                    e.getMessage();
                }
            }
        };


        Calc calc = (a,b)->a+b ;
        System.out.println(calc.add(5,10));

        String s =(string) -> {
            if(string.length()<=5) return true ;
            return false ;
        } ;
        System.out.println(s.checkLength("Hey"));
    }
}
