package keyone.keytwo.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class SettingsActivity extends AppCompatActivity implements View.OnClickListener {

    static final int LightTheme = 1;
    static final int NightTheme = 2;
    static final String KEY_SP = "sp";
    static final String KEY_CURRENT_THEME = "current_theme";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(getRealId(getCurrentTheme()));
        setContentView(R.layout.activity_settings);
        init();
    }

    private void init() {
        findViewById(R.id.radioButtonLight).setOnClickListener(this);
        findViewById(R.id.radioButtonNight).setOnClickListener(this);
        switch (getCurrentTheme()) {
            case 1:
                ((RadioButton) findViewById(R.id.radioButtonLight)).setChecked(true);
                break;
            case 2:
                ((RadioButton) findViewById(R.id.radioButtonNight)).setChecked(true);
                break;
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.radioButtonNight:
                setCurrentTheme(LightTheme);
                break;
            case R.id.radioButtonLight:
                setCurrentTheme(NightTheme);
                break;
        }
        recreate();
    }

    private void setCurrentTheme(int currentTheme) {
        SharedPreferences sharedPreferences = getSharedPreferences(KEY_SP, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(KEY_CURRENT_THEME, currentTheme);
        editor.apply();
    }

    private int getCurrentTheme() {
        SharedPreferences sharedPreferences = getSharedPreferences(KEY_SP, MODE_PRIVATE);
        return sharedPreferences.getInt(KEY_CURRENT_THEME, -1);
    }

    private int getRealId(int currentTheme) {
        switch (currentTheme) {
            case LightTheme:
                return R.style.myStyleLight;
            case NightTheme:
                return R.style.myStyleNight;
            default:
                return R.style.myStyleLight;
        }
    }
}