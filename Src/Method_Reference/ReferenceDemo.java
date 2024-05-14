package Method_Reference;

public class ReferenceDemo {
    public static void main(String[] args) {
      System.out.println("Learning Method references");

      //Provide the implementations of workInterface
        //Anonymous class
      WorkInterface workInterface=()-> System.out.println("This is do task new method:");
      //calling doTask method
      workInterface.doTask();

      //Stuff using method reference getting body of static method do stuff using reference method
        //Static method ko refer kiya
        //ClassName::methodName
        WorkInterface workInterface1=Stuff::doStuff;
        //All body getting here which define in stuff
        workInterface1.doTask();


        //Thread
        WorkInterface workInterface2=Stuff::doStuff;
        workInterface2.doTask();
        Runnable runnable=Stuff::threadTask;
        Thread d=new Thread(runnable);
        d.start();


        //Non Static methods calling
        //Refering non static method
        //object::MethodName
              Stuff obj=new Stuff();
        Runnable runnable1=obj::printNumber;

        Thread t1=new Thread(runnable1);
        t1.start();

    }
}
