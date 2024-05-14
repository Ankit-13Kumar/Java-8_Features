package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        //streamAPI - collection of process
        //collection/group of object

        //1 way -blank stream object e- values who returning nothing
        Stream<Object> emptyStream=Stream.empty();
            emptyStream.forEach(e-> System.out.println(e));

            //2 way- array,collection,object

            String names[]={"Ankit", "Ravi" , "Sumit" , "Sanju"};
            Stream<String> stream1=Stream.of(names);
            stream1.forEach(e-> System.out.println(e));

          //3
        Stream<Object> streamBuilder=Stream.builder().build();

        //4
                   IntStream stream=Arrays.stream(new int[] {2,5,7,12});
                   stream.forEach(e->{System.out.println(e);});

                   //5 list,set
        List<Integer> list2=new ArrayList<>();
        list2.add(7); list2.add(17); list2.add(71); list2.add(9);
        Stream<Integer> stream3=list2.stream();
        stream3.forEach(e->{System.out.println(e);});

    }

}
