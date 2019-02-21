package lecture.lecture3.formatter;

public class PrintStudentTitleList {

    private DinamicFormatter dinamicFormatter = new DinamicFormatter();
    private String templatetitle;

    private String title = "Engligh Entermediate level\n".toUpperCase();
    private String name = "Ivan Ivanov \n".toUpperCase();


    private void printStudentName() {
        dinamicFormatter.printStrigUseTemplate("\n\n\n\n\n");
        dinamicFormatter.printStrigUseTemplate("%30s", title);
        dinamicFormatter.printStrigUseTemplate("\n");
        dinamicFormatter.printStrigUseTemplate("%20s", name);
        dinamicFormatter.printStrigUseTemplate("\n\n\n\n\n");
        dinamicFormatter.printStrigUseTemplate("%15s","book".toUpperCase());
    }

    public void printStudentList() {
        printStudentName();
    }

    public static void main(String... args) {
        PrintStudentTitleList printStudentTitleList = new PrintStudentTitleList();
        printStudentTitleList.printStudentList();
    }

}
