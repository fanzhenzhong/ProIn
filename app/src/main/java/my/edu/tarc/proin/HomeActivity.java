package my.edu.tarc.proin;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class HomeActivity extends Activity {
    private boolean check = false;
    private Button btnProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnProduct = (Button)findViewById(R.id.buttonProduct);
        btnProduct.setTextColor(Color.WHITE);



    }


}
