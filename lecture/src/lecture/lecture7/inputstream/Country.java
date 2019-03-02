package lecture.lecture7.inputstream;

import java.io.Serializable;

public class Country implements Serializable {
  private String countryName;

    public Country(final String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    @Override
    public String toString() {
        return "Country{" +
               "countryName='" + countryName + '\'' +
               '}';
    }
}
