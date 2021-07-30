package keyone.keytwo.calculator;

public class Calculator {

    private String mathSymbol = "";
    private int number = 0;
    private int result;

    public void setMathSymbol(String mathSymbol) {
        this.mathSymbol = mathSymbol;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int calculateResult() {
        // вычисление выражения
        if (mathSymbol.equals("*")) {
            result = number * number; // просто чтобы было что-нибудь, работает некорректно
        }
        return result;
    }
}
