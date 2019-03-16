package lecture.lection10.builder;

public class Country {
    private int population;
    private int countOfTown;
    private int countOfVillage;
    private int square;
    private String name;


    @Override
    public String toString() {
        return "Country{" +
                "population=" + population +
                ", countOfTown=" + countOfTown +
                ", countOfVillage=" + countOfVillage +
                ", square=" + square +
                ", name='" + name + '\'' +
                '}';
    }

    private Country(){}

    public static class Builder {
        private Country country;

        public Builder() {
            this.country = new Country();
        }

        public Builder withPopulation(final int population) {
            country.population = population;
            return this;
        }

        public Builder withCountOfTown(final int countOfTown) {
            country.countOfTown = countOfTown;
            return this;
        }

        public Builder withCountOfVillage(final int countOfVillage) {
            country.countOfVillage = countOfVillage;
            return this;
        }

        public Builder withSquare(final int square) {
            country.square = square;
            return this;
        }

        public Builder withName(final String name){
            country.name = name;
            return this;
        }

        public Country build(){
            return country;
        }
    }


}
