package lecture.lection2;

public enum EnumService {

    INNER_SERVICE("inner servise"),
    EXTERNAL_SERVISE("external service");
   // EXTERNAL_SERVISE("external service");

    private String name;
    EnumService(String string) {
     this.name=string;
    }
}
