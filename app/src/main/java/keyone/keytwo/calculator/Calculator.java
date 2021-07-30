package keyone.keytwo.calculator;

import android.os.Parcel;
import android.os.Parcelable;

public class Calculator implements Parcelable {

    private String mathSymbol = "";
    private int number = 0;
    private int result;

    Calculator() {
    }

    protected Calculator(Parcel in) {
        mathSymbol = in.readString();
        number = in.readInt();
        result = in.readInt();
    }

    public static final Creator<Calculator> CREATOR = new Creator<Calculator>() {
        @Override
        public Calculator createFromParcel(Parcel in) {
            return new Calculator(in);
        }

        @Override
        public Calculator[] newArray(int size) {
            return new Calculator[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mathSymbol);
        dest.writeInt(number);
        dest.writeInt(result);
    }
}
