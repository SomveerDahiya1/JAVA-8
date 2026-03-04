package StreamAPI;


import java.util.Arrays;
import java.util.List;

public class TestingDistinct {
    public static void main(String[] args) {
        List list1 = List.of(1,1,1,2,2,3,4,4,4,5);
        list1.stream()
                .distinct()
                .forEach(i-> System.out.println(i));
    }
}
