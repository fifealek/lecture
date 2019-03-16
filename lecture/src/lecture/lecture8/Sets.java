package lecture.lecture8;

import java.util.Objects;

public class Sets {

    private int age;
    private String name;

    public Sets(int age, String name) {
        this.age = age;
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sets sets = (Sets) o;
        return age == sets.age &&
                Objects.equals(name, sets.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sets{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
