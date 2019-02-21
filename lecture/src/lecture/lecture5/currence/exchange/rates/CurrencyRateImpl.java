package lecture.lecture5.currence.exchange.rates;

import lecture.lecture5.currence.exchange.CountryCurrency;

public class CurrencyRateImpl implements CurrencyRate {

    private double rate;
    private String description;
    private CountryCurrency countryCurrency;

    public CurrencyRateImpl(final double rate, final String description, final CountryCurrency countryCurrency) {
        this.rate = rate;
        this.description = description;
        this.countryCurrency = countryCurrency;
    }

    @Override
    public String description() {
        return this.description;
    }

    @Override
    public double getRate() {
        return this.rate;
    }
}
