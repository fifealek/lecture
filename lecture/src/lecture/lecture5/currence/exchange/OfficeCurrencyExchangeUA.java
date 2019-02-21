package lecture.lecture5.currence.exchange;

import lecture.lecture5.currence.exchange.calculating.Calculate;
import lecture.lecture5.currence.exchange.rates.CurrencyRate;

import java.util.Map;

public class OfficeCurrencyExchangeUA extends OfficeCurrencyExchange {

    private Calculate calculate;
    private Map<CountryCurrency, CurrencyRate> countryCurrencyRateMap;

    public OfficeCurrencyExchangeUA(final Calculate calculate,
                                    final Map<CountryCurrency, CurrencyRate> countryCurrencyRateMap) {
        this.calculate = calculate;
        this.countryCurrencyRateMap = countryCurrencyRateMap;
    }

    @Override
    public double exchange(final double amount, final CountryCurrency countryCurrency) {
        return calculate.calculate(amount, countryCurrencyRateMap.get(countryCurrency), Boolean.FALSE);
    }

    @Override
    public double reexchange(final double amount, final CountryCurrency countryCurrency) {
        return calculate.calculate(amount, countryCurrencyRateMap.get(countryCurrency), Boolean.TRUE);
    }
}
