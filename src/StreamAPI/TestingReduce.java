package StreamAPI;

import java.util.List;

public class TestingReduce {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);

        //Reducing the list using lambda expression implementation
        int max = list.stream().
                reduce(Integer.MIN_VALUE,(a,b)->a>b ? a:b );
        System.out.println(max);
    }
}
