package studios.fyhrf.hairdew;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public void text (Bundle savedInstanceState) {

        TextView textView = new TextView(this);
        textView.setText("wow!");

        setContentView(textView);
    }
}
