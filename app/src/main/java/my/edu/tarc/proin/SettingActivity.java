package my.edu.tarc.proin;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

public class SettingActivity extends Activity {
    private Button btnSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        btnSetting = (Button)findViewById(R.id.buttonSetting);
        btnSetting.setTextColor(Color.WHITE);
    }
}
