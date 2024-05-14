package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Methods {
    public static void main(String[] args) {

        List<String> names=new ArrayList<>();
        names.add("ankit");
        names.add("Hrithik");
        names.add("Ravi");
        names.add("aman");

        //Filter(Predicate )
        // boolean value function
        // e -> e>10
        List<String> result=names.stream().filter(e->e.startsWith("a")).collect(Collectors.toList());
        System.out.println(result);



        //Map(Function) work on element
        List<Integer> value=new ArrayList<>();
        value.add(5);value.add(3);value.add(2);value.add(22);value.add(10);
           value.stream().map(i->i*i).forEach(y->System.out.println("First Method:"+y));
        value.stream().map(i->i*i).forEach(System.out::println);

        List<Integer> newData=value.stream().map(i->i*i).collect(Collectors.toList());
           System.out.println("Another way To Print Data:" + newData);

           //Sort Method
        List<Integer> sort=value.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted Value:"+sort);
        value.stream().sorted().forEach(System.out::println);

        //Min function
        Integer min=value.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println("Min value:"+min);

        //Max function
        Integer max=value.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println("Max value:"+max);

    }

}
