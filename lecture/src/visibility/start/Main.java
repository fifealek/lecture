package visibility.start;

import visibility.fields.VisibleFields;
import visibility.fields.some.SubSomeVisibleFields;

public class Main {

    public static void main(String ...args) {
        VisibleFields visibleFields = new VisibleFields();
        //visibleFields.youCanSeeMeInPackageSubClasses=1;
        //visibleFields.youCanSeeMePackageAndClass=2;
        visibleFields.youCanMeSee=3;

        SubVisibleFields subVisibleFields = new SubVisibleFields();
        subVisibleFields.youCanMeSee=3;

        SubSomeVisibleFields subSomeVisibleFields = new SubSomeVisibleFields();


    }

}
