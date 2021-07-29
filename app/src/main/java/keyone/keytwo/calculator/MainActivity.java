package keyone.keytwo.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String expressionAndResult = "";
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

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

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonC:
                //
                break;
            case R.id.buttonEraseToTheLeft:
                //
                break;
            default:
                break;
        }

    }
}