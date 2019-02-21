package lecture.lecture4.objectmethods;

public class ValueObject implements Cloneable{

    private int value;
    private String valueString;

    public ValueObject(final int value, final String valueString) {
        this.value = value;
        this.valueString = valueString;
    }

//    @Override
//    public boolean equals(final Object o) {
//        if (this == o) {
//            return true;
//        }
//        if (o == null || getClass() != o.getClass()) {
//            return false;
//        }
//
//        ValueObject that = (ValueObject) o;
//
//        if (value != that.value) {
//            return false;
//        }
//        return valueString.equals(that.valueString);
//    }
//
//    @Override
//    public int hashCode() {
//        int result = value;
//        result = 31 * result + valueString.hashCode();
//        return result;
//    }

    public int getValue() {
        return value;
    }

    public String getValueString() {
        return valueString;
    }

    @Override
    public String toString() {
        return "ValueObject{" +
               "value=" + value +
               ", valueString='" + valueString + '\'' +
               '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
