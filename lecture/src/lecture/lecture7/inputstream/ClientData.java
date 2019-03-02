package lecture.lecture7.inputstream;

import java.io.Serializable;

public class ClientData implements Serializable {

    private static final long serialVersionUID = 8683452581122892199L;

    private int count;
    private String name;
    private String secondName;
    private int age;
    private Country country;

    public ClientData(final int count, final String name, final String secondName, final int age,
                      final Country country) {
        this.count = count;
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.country = country;
    }

    public int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public Country getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "ClientData{" +
               "count=" + count +
               ", name='" + name + '\'' +
               ", secondName='" + secondName + '\'' +
               ", age=" + age +
               ", country=" + country +
               '}';
    }
}
