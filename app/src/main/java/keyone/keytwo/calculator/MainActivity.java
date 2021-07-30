package keyone.keytwo.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    static String TAG = "calculator";

    TextView inputField;
    Button buttonC;
    Button buttonEraseToTheLeft;
    Button buttonDivision;
    Button button1;
    Button button2;
    Button button3;
    Button buttonMultiply;
    Button button4;
    Button button5;
    Button button6;
    Button buttonMinus;
    Button button7;
    Button button8;
    Button button9;
    Button buttonPlus;
    Button buttonPercent;
    Button button0;
    Button buttonComma;
    Button buttonEqual;

    Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListeners();
        calculator = new Calculator();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelable(TAG, calculator);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        calculator = savedInstanceState.getParcelable(TAG);
        setContent();
    }

    private void setContent() {
        inputField.setText(String.valueOf(calculator.calculateResult()));
    }

    private void initListeners() {
        buttonC.setOnClickListener(this);
        buttonEraseToTheLeft.setOnClickListener(this);
        buttonDivision.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonPercent.setOnClickListener(this);
        button0.setOnClickListener(this);
        buttonComma.setOnClickListener(this);
        buttonEqual.setOnClickListener(this);
    }

    private void initView() {
        inputField = findViewById(R.id.inputField);
        buttonC = findViewById(R.id.buttonC);
        buttonEraseToTheLeft = findViewById(R.id.buttonEraseToTheLeft);
        buttonDivision = findViewById(R.id.buttonDivision);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        buttonMinus = findViewById(R.id.buttonMinus);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonPercent = findViewById(R.id.buttonPercent);
        button0 = findViewById(R.id.button0);
        buttonComma = findViewById(R.id.buttonComma);
        buttonEqual = findViewById(R.id.buttonEqual);
    }

    public void onToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonC:
                inputField.setText("");
                calculator.setMathSymbol("C");
                break;
            case R.id.buttonEraseToTheLeft:
                onToast("EraseToTheLeft");
                calculator.setMathSymbol("eraseToTheLeft");
                break;
            case R.id.buttonDivision:
                inputField.setText(String.format("%s%s", inputField.getText(), "/"));
                calculator.setMathSymbol("/");
                break;
            case R.id.button1:
                inputField.setText(String.format("%s%s", inputField.getText(), button1.getText()));
                calculator.setNumber(1);
                break;
            case R.id.button2:
                inputField.setText(String.format("%s%s", inputField.getText(), button2.getText()));
                calculator.setNumber(2);
                break;
            case R.id.button3:
                inputField.setText(String.format("%s%s", inputField.getText(), button3.getText()));
                calculator.setNumber(3);
                break;
            case R.id.buttonMultiply:
                inputField.setText(String.format("%s%s", inputField.getText(), "*"));
                calculator.setMathSymbol("*");
                break;
            case R.id.button4:
                inputField.setText(String.format("%s%s", inputField.getText(), button4.getText()));
                calculator.setNumber(4);
                break;
            case R.id.button5:
                inputField.setText(String.format("%s%s", inputField.getText(), button5.getText()));
                calculator.setNumber(5);
                break;
            case R.id.button6:
                inputField.setText(String.format("%s%s", inputField.getText(), button6.getText()));
                calculator.setNumber(6);
                break;
            case R.id.buttonMinus:
                inputField.setText(String.format("%s%s", inputField.getText(), "-"));
                calculator.setMathSymbol("-");
                break;
            case R.id.button7:
                inputField.setText(String.format("%s%s", inputField.getText(), button7.getText()));
                calculator.setNumber(7);
                break;
            case R.id.button8:
                inputField.setText(String.format("%s%s", inputField.getText(), button8.getText()));
                calculator.setNumber(8);
                break;
            case R.id.button9:
                inputField.setText(String.format("%s%s", inputField.getText(), button9.getText()));
                calculator.setNumber(9);
                break;
            case R.id.buttonPlus:
                inputField.setText(String.format("%s%s", inputField.getText(), "+"));
                calculator.setMathSymbol("-");
                break;
            case R.id.buttonPercent:
                onToast("Percent");
                calculator.setMathSymbol("%");
                break;
            case R.id.button0:
                inputField.setText(String.format("%s%s", inputField.getText(), button0.getText()));
                calculator.setNumber(0);
                break;
            case R.id.buttonComma:
                inputField.setText(String.format("%s%s", inputField.getText(), ","));
                calculator.setMathSymbol(",");
                break;
            case R.id.buttonEqual:
                onToast("Equal");
                inputField.setText(String.valueOf(calculator.calculateResult()));
                break;
            default:
                break;
        }

    }
}