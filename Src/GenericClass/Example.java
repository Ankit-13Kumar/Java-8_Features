package GenericClass;

public class Example {

    public static void main(String[] args) {
        //We can pass any value in container
//        Box box=new Box("water");
//        System.out.println();


        Box<String> box=new Box<String>("Wow this is amazing");
        //Get value only
        System.out.println(box.getValue());
        //Get String Value
        System.out.println(box.Container.getClass().getName());

       Box<Integer> box1=new Box<Integer>(121);
       System.out.println(box1.getValue());
       System.out.println(box1.Container.getClass().getName());

       box.Container="String value";
       box1.Container=1234;

       Box<Boolean> box2=new Box<Boolean>(true);
       System.out.println(box2.getValue());

       box.performSomeTask();
       box1.performSomeTask();

    }
}
