package task20;

import java.math.BigDecimal;

public class Task1 {
    
}
//Currency Converter:
//Create a class CurrencyConverter that utilizes Java's BigDecimal wrapper class for precise currency calculations.

//Define exchange rates: Store exchange rates for a few currencies (e.g., USD, EUR, GBP) within the class (you can use static final BigDecimal fields for this).
class CurrencyConverter {
    public static final BigDecimal USD = BigDecimal.valueOf(1.0);
    public static final BigDecimal EUR = BigDecimal.valueOf(0.88);
    public static final BigDecimal GBP = BigDecimal.valueOf(0.76);
    public static final BigDecimal JPY = BigDecimal.valueOf(109.0);
    public static final BigDecimal CNY = BigDecimal.valueOf(6.5);
    public static final BigDecimal INR = BigDecimal.valueOf(74.0);

    //implement currency and getexcangerate
    public static BigDecimal getExchangeRate(String currency) {
        switch (currency) {
            case "USD":
                return USD;
            case "EUR":
                return EUR;
            case "GBP":
                return GBP;
            case "JPY":
                return JPY;
            case "CNY":
                return CNY;
            case "INR":
                return INR;
            default:
                return BigDecimal.ZERO;
        }
    }

    
    //Implement the convert method: Create a method convert that takes the amount to convert, the source currency
    //and the target currency as parameters. It returns the converted amount as a BigDecimal object.
    public static BigDecimal convert(BigDecimal amount, String sourceCurrency, String targetCurrency) {
            BigDecimal sourceRate = getExchangeRate(sourceCurrency);
            BigDecimal targetRate = getExchangeRate(targetCurrency);
            if (sourceRate.equals(BigDecimal.ZERO) || targetRate.equals(BigDecimal.ZERO)) {
                return BigDecimal.ZERO;
                }
                return amount.multiply(targetRate).divide(sourceRate);
                }
                //Test the convert method with some example inputs:
                public static void main(String[] args) {
                    CurrencyConverter converter = new CurrencyConverter();
                    System.out.println(converter);
                    BigDecimal amount = BigDecimal.valueOf(100.0);
                    String sourceCurrency = "USD";
                    String targetCurrency = "EUR";
                    BigDecimal convertedAmount = CurrencyConverter.convert(amount, sourceCurrency, targetCurrency);
                    System.out.println("Converted amount: " + convertedAmount);

                }

   
}

            


