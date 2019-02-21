package lecture.lecture5.currence.exchange;

public abstract class OfficeCurrencyExchange {

    //Change amount money for currency of country.
    public abstract double exchange(double amount, CountryCurrency countryCurrency);

    //Rechange amount money for currency of country.
    public abstract double reexchange(double amount, CountryCurrency countryCurrency);

}
