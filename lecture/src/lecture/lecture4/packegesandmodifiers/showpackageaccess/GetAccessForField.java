package lecture.lecture4.packegesandmodifiers.showpackageaccess;

public class GetAccessForField {

    public static void main(String ... args) {
        Modifiers modifiers = new Modifiers();


        //    Showing that protected,public and default modifiers is  visible in the same package
        //    This information actual for method and constructors of class.



         // modifiers.anInt; //private this modifier can see only own class

        System.out.println(modifiers.vT);//default visible
        System.out.println(modifiers.string);//protected visible
        System.out.println(modifiers.youCanSeeMeAnyWhere);//public visible
    }


}
