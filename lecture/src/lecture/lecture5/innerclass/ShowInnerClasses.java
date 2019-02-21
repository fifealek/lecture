package lecture.lecture5.innerclass;

public class ShowInnerClasses {

    final private static String TYPE_CAR = "MAN";
    final private static double[] CAR_ARGS={70.5,10.5,16.5};
    private int a;

    private class InnerClass {

        private int count;
        private String aS;

        public InnerClass(final int count, final String aS) {
            this.count = count;
            this.aS = aS;
            ShowInnerClasses.this.a = count * count;
        }

        public int getCount() {
            return count;
        }

        public String getaS() {
            return aS;
        }

        @Override
        public String toString() {
            return "InnerClass{" +
                    "count=" + count +
                    ", aS='" + aS + '\'' +
                    '}';
        }
    }

    private class InnerDestination implements Destination {
        private int length;

        public InnerDestination(int length) {
            this.length = length;
        }

        @Override
        public int destination() {
            return length;
        }
    }

    protected InnerClass createInnerClass(int count, String aS) {
        return new InnerClass(count, aS);
    }

    private static class InnerStatic {
        private int anInt;

        public InnerStatic(final int anInt) {
            this.anInt = anInt;
        }

        public int getAnInt() {
            return anInt;
        }
    }

    //Anonymous class
    public Destination createDestination(final int v) {
        return new Destination() {
            @Override
            public int destination() {
                return v;
            }

        };
    }

    //local inner classes can hide implementetion
    private MiddleQuickness createLocalDestination(String car, double... args) {

        class DestinationClass extends MiddleQuickness implements Destination {
            private String cars;
            private double speed;
            private double actualTime;
            private double time;

            public DestinationClass(String car, double... args) {
                this.cars = car;
                this.speed = args[0];
                this.actualTime = args[1];
                this.time = args[2];
            }

            @Override
            public int destination() {

                return (int) Math.round(actualTime * speed);
            }

            @Override
            public double middleQuickness() {
                return destination() / time;
            }

            @Override
            public String toString() {
                return "DestinationClass{" +
                        "cars='" + cars + '\'' +
                        ", speed=" + speed +
                        ", actualTime=" + actualTime +
                        ", time=" + time +
                        '}';
            }
        }

        return new DestinationClass(car, args);
    }

    public static void main(String... args) {
        ShowInnerClasses showInnerClasses = new ShowInnerClasses();
        ShowInnerClasses.InnerClass innerClass = showInnerClasses.createInnerClass(10, "As");
        System.out.println(innerClass.getCount() + "   " + innerClass.getaS());
        System.out.println(showInnerClasses.a);

        ShowInnerClasses.InnerStatic innerStatic = new ShowInnerClasses.InnerStatic(12);
        System.out.println(innerStatic.getAnInt());

        ShowInnerClasses.InnerClass innerClass1 = showInnerClasses.new InnerClass(20, "As");

        System.out.println("Show inner class " + innerClass1);
        System.out.println(innerClass1.getCount());

        Destination innerDestination = showInnerClasses.new InnerDestination(100);

        System.out.println("Destination of town " + innerDestination.destination());
        Destination destination = showInnerClasses.createDestination(90);
        System.out.println(destination.destination());

        MiddleQuickness middleQuickness = showInnerClasses.createLocalDestination(TYPE_CAR,CAR_ARGS);
        System.out.println("middle quickness " + middleQuickness. middleQuickness() + " object data " + " "+middleQuickness);
    }
}
