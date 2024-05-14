package OptionalClass;

import java.util.Optional;

public class OptionalClass {

    //Return Optional Type
    public static Optional<String> getName(){
        String name="Ankit";
        return Optional.ofNullable(name);
    }

    public static void main(String[] args) {
        //Its used for ignore null value exception error.
        //Previously used if else to ignore null point exception.

//        String str=null;
        String str="Ankit Bro";
        if (str==null){
            System.out.println("This is null value");
        }
        else {
            System.out.println(str.length());
        }
          String str2=null;
        Optional<String> optional =Optional.ofNullable(str2);
        System.out.println("Optonal:"+ optional.isPresent());
        //System.out.println("Optonal:"+ optional.get());
        System.out.println("Optonal:"+ optional.orElse("Not present value"));


      //Optional Called
        Optional<String> optional5=getName();
        System.out.println("Optional Called: "+ optional5.orElse("Null Return"));
    }
}
