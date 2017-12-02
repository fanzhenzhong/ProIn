package my.edu.tarc.proin;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

public class CartActivity extends Activity {
    private Button btnCart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        btnCart = (Button)findViewById(R.id.buttonCart);
        btnCart.setTextColor(Color.WHITE);
    }
}
