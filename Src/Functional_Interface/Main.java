package Functional_Interface;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Ankit");

//      MyInterface call1=new MyInterfaceImpl();
//      call1.sayHello();


        //No need implementation class direclty we can call
        //Anonymious class if 2 method is there then use annonymious class
//        MyInterface i = new MyInterface() {
//
//            @Override
//            public void sayHello() {
//                System.out.println("Interface is simple to learn");
//            }
//
//        };
        //Define below top down approach
        //i.sayHello();

//        MyInterface i2=new MyInterface() {
//            @Override
//            public void sayHello() {
//                System.out.println("Second interface");
//            }
//        };
//        i2.sayHello();

        //using labmda function using interface
        //{} removed only one interfcae is there
//        MyInterface i=() -> System.out.println("Hello Lambda Function");
//
//        i.sayHello();


        //adding number
//        AddNum i=(a,b)->a+b;
//        System.out.println("After Adding:" + i.add(5,8));
//    }
//

        //finding length
        StringLength i=(str)->str.length();
        System.out.println("Length:"+ i.length("Ankit"));

    }

}