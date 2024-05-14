package Method_Reference;

import java.util.List;

public class StreamMain1 {
    public static void main(String[] args) {


        List<Integer> number=List.of(45,23,12,5,1,8,20);
        System.out.println(number);
        number.stream().forEach(System.out::println); //:: Reference Variable


    }
}
