package GenericClass;

import Functional_Interface.StringLength;

public class Box<T> {
//    Object Container;
       T Container;

    public Box(T container){
        this.Container=container;
    }
    public Object getValue(){
        return this.Container;
    }

    public void performSomeTask(){
        if (Container instanceof String){
            System.out.println("length of:" + Container +"Is "+ (((String) this.Container).length()));
        }
        else if(Container instanceof Integer) {
            System.out.println("This is integer Value" + Container);
        }
    }

}
