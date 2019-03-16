package lecture.lection10.builder;

public class Run {
    public static void main(String ... args){

        Country.Builder builder =new Country.Builder();
        builder.withCountOfTown(100);
        builder.withCountOfVillage(10);
        builder.withName("test country");
        builder.withPopulation(100000);
        builder.withSquare(1000000);
        Country country = builder.build();
        System.out.println(country);
    }
}
