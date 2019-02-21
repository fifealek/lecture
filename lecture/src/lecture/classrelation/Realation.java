package lecture.classrelation;


//Объявление публичного класса
// имя класса Realation
public class Realation {

    private int value;
    private String string;

    //конструктор без параметров
    public Realation() {
    }
    //Конструктор с параметрами
    //простой тип и обект строки
    public Realation(int t, String a) {
        this.value=t;
        this.string=a;
    }

    //метод
    //название add
    //v передоваемый простой тип в метод передаеться по значению
    public void add(int v) {

    }

    public String add(String a) {
       return string+a;
    }

    //изменение внутренего состояния обекта
    public void changeInnerObjectStat(String a,int p) {
        this.value=p;
        this.string=a;

    }

    @Override
    public String toString() {
        return "Realation{" +
               "value=" + value +
               ", string='" + string + '\'' +
               '}';
    }
}
