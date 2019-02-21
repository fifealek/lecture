package lecture.lecture4.packegesandmodifiers;

import lecture.lecture4.packegesandmodifiers.showpackageaccess.Modifiers;

public class GetAccessForFields {

    public static void main(String ... args) {
        Modifiers modifiers = new Modifiers();


        //    Showing that protected, private and default modifiers is not visible in another package
        //    This information actual for method and constructors of class.



        //  modifiers.anInt; //private
        //  modifiers.string;//protected
        //  modifiers.vT;//default

        System.out.println(modifiers.youCanSeeMeAnyWhere);
    }

}
