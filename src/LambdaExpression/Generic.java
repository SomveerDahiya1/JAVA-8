package LambdaExpression;

import java.util.*;

public class Generic {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList(); // Generic <Integer> List Elements Datatype
        //throw compile time error
        list1.add(1) ;
        //list1.add("Somveer") ; // list1 can only add Integer Element.
        List list2 = new ArrayList();
        list2.add(1);
        list2.add("Dahiya") ;
        //list2 can add any type of data because they have not any generic type
    }
}
