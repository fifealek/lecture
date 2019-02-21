package lecture.lecture4.objectmethods;

import java.util.Objects;

public class KeyObject implements Cloneable {

    private int keyId;
    private String key;
    private ValueObject v;

    public KeyObject(final int keyId, final String key) {
        this.keyId = keyId;
        this.key = key;
    }

    public KeyObject(final int keyId, final String key, final ValueObject v) {
        this.keyId = keyId;
        this.key = key;
        this.v = v;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeyObject keyObject = (KeyObject) o;
        return keyId == keyObject.keyId &&
               Objects.equals(key, keyObject.key);
    }

    @Override
    public int hashCode() {
        //return Objects.hash(keyId, key);
        return this.keyId;
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        KeyObject keyObject = (KeyObject) super.clone();
        ValueObject valueObject = this.getV() != null ? (ValueObject) this.getV().clone() : null;
       if (valueObject != null) {System.out.println(valueObject.clone());};
        keyObject.setV(valueObject);
        return keyObject;
    }


    public int getKeyId() {
        return keyId;
    }

    public String getKey() {
        return key;
    }

    public ValueObject getV() {
        return v;
    }

    public void setV(final ValueObject v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return "KeyObject{" +
               "keyId=" + keyId +
               ", key='" + key + '\'' +
               ", v=" + v +
               '}';
    }
}
