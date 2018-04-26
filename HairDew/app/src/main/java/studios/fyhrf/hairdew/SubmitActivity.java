package studios.fyhrf.hairdew;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.List;


public class SubmitActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit);
        boolean [] array = getIntent().getBooleanArrayExtra("storedChecks");


        TextView storedChecks= findViewById(R.id.displayStoredChecks);
        storedChecks.setText(array.toString());



    }


}