package lecture.lecture4.declarationclass;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String ... args) {

        int free = 3;

        String description = "description";

        int notFree =2;

        SimpleClass simpleClass =new ChildSimpleClass(free,description,notFree);
       // ChildSimpleClass childSimpleClass = new ChildSimpleClass(free,description,notFree);

        System.out.println("################################");
        SimpleClass simpleClass1 = new SubChildSimpleClass(free,description,notFree,'c');

        System.out.println(simpleClass.getFree());


        System.out.println(simpleClass1.getFree());

        System.out.println(simpleClass1.free);

        SubChildSimpleClass subChildSimpleClass =(SubChildSimpleClass)simpleClass1;
        System.out.println(subChildSimpleClass.getFree());
        System.out.println(subChildSimpleClass.getFree(1l));
        System.out.println(subChildSimpleClass.getFree("2"));

        ClassBlocks classBlocks = new ClassBlocks(simpleClass);

//
//        SimpleClass simpleClass2 =new SimpleClass(1,"2");;

      A a = new A();
      a.setA(1);
      a.setB("Df");

      a.getA();
      a.getB();

      List list =new ArrayList();
      list.add(subChildSimpleClass);
      list.add(simpleClass);
      if(list.get(0) instanceof SubChildSimpleClass) {
          ((SimpleClass)list.get(0)).getFree();
      };
    }
}
