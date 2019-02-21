package visibility.fields;

import visibility.fields.some.SubSomeVisibleFields;
import visibility.start.SubVisibleFields;

public class Main {

    public static void main(String ...args) {
        VisibleFields visibleFields = new VisibleFields();
        visibleFields.youCanSeeMeInPackageSubClasses=1;
        visibleFields.youCanSeeMePackageAndClass=2;
        visibleFields.youCanMeSee=3;

        SubVisibleFields subVisibleFields=new SubVisibleFields();
        subVisibleFields.youCanSeeMeInPackageSubClasses=0;

        SubSomeVisibleFields subSomeVisibleFields = new SubSomeVisibleFields();
        subSomeVisibleFields.youCanSeeMeInPackageSubClasses=0;

    }
}
