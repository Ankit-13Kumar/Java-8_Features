package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Added
import java.util.HashMap;
import java.util.Set;

public class StreamMain {
    public static void main(String[] args) {

        // Q-> create a list and filter all even numbers from List
         //listof immutable we cannot add lateer
        List<Integer> list1=List.of(2, 5, 7, 9, 12, 50, 32, 8 ,33);
        List<Integer> list2=new ArrayList<Integer>();
        List<Integer> list3=Arrays.asList(5,6,7,12);
        list2.add(7); list2.add(17); list2.add(71); list2.add(9);
        System.out.println("list1: "+list1 + " list2: "+list2 +" list3: "+list3);

      //we will work on list1 without stream filter copy data from list 1 and paste into new list
        List<Integer> listEven=new ArrayList<>();
        for (Integer i :list1){
            if (i%2==0){
                listEven.add(i);

            }
        }
        System.out.println("Listeven:" + listEven);



        //using stream API
        Stream<Integer> stream= list1.stream();
        List<Integer> newList=stream.filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println("NewList: " +newList);


        //same as above in short line
        List<Integer> newListShort=list1.stream().filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println("NewListShort: " +newListShort);

        //Number greater than 30
        List<Integer> list30=list1.stream().filter(i-> i>30).collect(Collectors.toList());
        System.out.println("Greater than 30:" + list30);





//Added Stream features for java 8

////        Benefit of Java Stream
////        There are some benefits because of which we use Stream in Java as mentioned below:
////        No Storage
////        Pipeline of Functions
////        Laziness
////        Can be infinite
////        Can be parallelized
////        Can be created from collections, arrays, Files Lines, Methods in Stream, IntStream etc.

//        //1 - forEach() ->The forEach method is used to iterate through every element of the stream.
       ArrayList<Integer> value=new ArrayList<Integer>();
       value.add(12); value.add(18); value.add(12); value.add(8);
       value.stream().map(x->x*x).forEach(y->System.out.println(value));

//        //2 - filter() ->The filter method is used to select elements as per the Predicate passed as an argument.
       ArrayList<String> value1=new ArrayList<String>();
       value1.add("12"); value1.add("18"); value1.add("12"); value1.add("8");
       List<String> result=value1.stream().filter(s->s.startsWith("1")).collect(Collectors.toList());
          System.out.println(result);

//        //3 - map() ->The map method is used to return a stream consisting of the results of applying the given function to the elements of this stream.
       ArrayList<Integer> value2=new ArrayList<Integer>();
      value2.add(12); value2.add(18); value2.add(12); value2.add(8);
       List<Integer> result2= value2.stream().map(x->x*x).collect(Collectors.toList());
       System.out.println("result:"+ result2);


//        //4 - collect() - The collect method is used to return the result of the intermediate operations performed on the stream.
       ArrayList<Integer> value3=new ArrayList<Integer>();
       value3.add(12);
       value3.add(10);
       Set<Integer> result3=value3.stream().map(x->x*x).collect(Collectors.toSet());
       System.out.println(result3);

//        //5 sorted() -The sorted method is used to sort the stream.
       ArrayList<Integer> value4=new ArrayList<Integer>();
       value4.add(121);
       value4.add(11);
       value4.add(1231);
       value4.add(232);
       List<Integer> result4=value4.stream().sorted().collect(Collectors.toList());
       System.out.println(result4);

       //6 reduce() - The reduce method is used to reduce the elements of a stream to a single value. The reduce method takes a BinaryOperator as a parameter.
       ArrayList<Integer> value5=new ArrayList<Integer>();
       value5.add(12);
       value5.add(121);
       value5.add(1);
       value5.add(10);
       int even=value5.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
       System.out.println("result:"+ even);

        System.out.println("result:"+ value);

        //Lambda Functions
        ArrayList<Integer> values=new ArrayList<Integer>();
        values.add(12);
        values.add(15);
        values.forEach((n)->{System.out.println(n);});
    }
}

