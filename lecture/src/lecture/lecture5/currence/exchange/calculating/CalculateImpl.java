package lecture.lecture5.currence.exchange.calculating;

import lecture.lecture5.currence.exchange.rates.CurrencyRate;

public class CalculateImpl implements Calculate {

    @Override
    public double calculate(final double amount, final CurrencyRate currencyRate, boolean reexchange) {
        return reexchange ? amount / currencyRate.getRate() : amount * currencyRate.getRate();
    }

}

