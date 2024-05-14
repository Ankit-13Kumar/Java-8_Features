package Method_Reference.Constructer;

public class ConsMain {
    public static void main(String[] args) {

   System.out.println("Learning constructor reference:");

          //1st Way
//    ProviderInterface providerInterface=() -> {
//        return new Student(); //Constuctor called
//    };
          //2nd way
        //Constructor Reference
        //ClassName::new
        ProviderInterface providerInterface1=Student::new; //new means constructor


           Student student =providerInterface1.getStudent();
           student.display();

    }
}
