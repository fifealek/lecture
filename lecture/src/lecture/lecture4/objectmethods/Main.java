package lecture.lecture4.objectmethods;

public class Main {

    public static boolean equals(Object o1, Object o2) {
        return o1.equals(o2);
    }

    public static void main(String... args) throws Exception {
        KeyObject keyObject = new KeyObject(10, "Description");
        KeyObject keyObject1 = new KeyObject(10, "Description");

        System.out.println(equals(keyObject, keyObject1));
        System.out.println(
                " keyObject hashCode : " + keyObject.hashCode() + " keyObject1 hashCode : " + keyObject1.hashCode());
        System.out.println(" keyObject : " + keyObject.toString());
        System.out.println(" keyObject1 : " + keyObject1.toString());
        System.out.println("Clone object " + keyObject.clone());

        ValueObject valueObject = new ValueObject(20, "Order1");
        ValueObject valueObject2 = new ValueObject(20, "Order1");
        KeyObject keyObject2 = new KeyObject(20, "Description2", valueObject);
        KeyObject keyObject3 = (KeyObject) keyObject2.clone();
        System.out.println("Clone object  keyObject3 : " + keyObject3);
        System.out.println(
                "Clone object hashcode  for valueObject : " + keyObject3.getV().hashCode() + " valueObject hashcode "
                + valueObject.hashCode());
        System.out.println("####################################");
        System.out.println(equals(valueObject, valueObject2));
        System.out.println(
                " valueObject hashCode : " + valueObject.hashCode() + " valueObject1 hashCode : " + valueObject2
                        .hashCode());
        System.out.println(" keyObject : " + valueObject.toString());
        System.out.println(" keyObject1 : " + valueObject2.toString());
    }
}
