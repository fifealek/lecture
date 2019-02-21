package lecture.lecture5.currence.exchange.run;

import lecture.lecture5.currence.exchange.CountryCurrency;
import lecture.lecture5.currence.exchange.OfficeCurrencyExchange;
import lecture.lecture5.currence.exchange.OfficeCurrencyExchangeUA;
import lecture.lecture5.currence.exchange.calculating.Calculate;
import lecture.lecture5.currence.exchange.calculating.CalculateImpl;
import lecture.lecture5.currence.exchange.rates.CurrencyRate;
import lecture.lecture5.currence.exchange.rates.CurrencyRateImpl;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String ... args){

        double amount = 1000;
        Map<CountryCurrency, CurrencyRate> countryCurrencyCurrencyRateMap = new HashMap<>();
        CurrencyRate currencyRateUSA=new CurrencyRateImpl(28,"UA to USA",CountryCurrency.USA);
        CurrencyRate currencyRateGB=new CurrencyRateImpl(33,"UA to USA",CountryCurrency.GB);
        countryCurrencyCurrencyRateMap.put(CountryCurrency.USA,currencyRateUSA);
        countryCurrencyCurrencyRateMap.put(CountryCurrency.GB,currencyRateGB);
        Calculate calculate = new CalculateImpl();
        OfficeCurrencyExchange   officeCurrencyExchange = new OfficeCurrencyExchangeUA(calculate,countryCurrencyCurrencyRateMap);

        double exchageAmount = officeCurrencyExchange.exchange(amount,CountryCurrency.USA);
        System.out.println("amount : "+amount+" exchageAmount USA to UA : "+exchageAmount + " "+CountryCurrency.UA.name());

        double reexchageAmount = officeCurrencyExchange.reexchange(amount,CountryCurrency.USA);
        System.out.println("amount : "+amount+" reexchageAmount UA to USA : "+reexchageAmount + " "+CountryCurrency.USA.name());
    }

}
