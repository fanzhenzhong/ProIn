package my.edu.tarc.proin;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

public class ServicesActivity extends Activity {
    private Button btnServices;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);

        btnServices = (Button)findViewById(R.id.buttonServices);

        btnServices.setTextColor(Color.WHITE);



    }
}
