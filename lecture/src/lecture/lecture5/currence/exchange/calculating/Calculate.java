package lecture.lecture5.currence.exchange.calculating;

import lecture.lecture5.currence.exchange.rates.CurrencyRate;

public interface Calculate {

    public double calculate(double amount, CurrencyRate currencyRate, boolean reexchange);


}
