package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestingFilter {
    public static void main(String[] args) {
        List<String> contactNumbers = List.of("+91-18638173","+91-128573123","+65-3298642","+1-124896468","+31-8765143");

        System.out.println("Printing contactNumbers using Normal for-Each");
        //Printing contactNumbers using Normal for-each
        for(String contactNumber:contactNumbers){
            System.out.println(contactNumber);
        }

        //Printing contactNumbers using StreamAPI forEach with lambda Expression
        System.out.println("Printing contactNumbers using StreamAPI forEach with lambda Expression");
        contactNumbers.stream()
                .forEach(contactNumber-> System.out.println(contactNumber)); //Lambda Expression: implementing Accept method of Consumer functional interface




    }
}
