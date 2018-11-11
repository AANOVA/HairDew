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

public String productName;
public float price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit);
        boolean [] array = getIntent().getBooleanArrayExtra("storedChecks");


        TextView storedChecks= findViewById(R.id.displayStoredChecks);
        storedChecks.setText();



    }
    public String orderSummaryMessage(String productName, String message, float price ){
        message = "Order Summary:";
        message+= "\nProduct(s): " + productName;
        message+= "\nTotal: $" +price;
        String orderSummary = message + "\nThank You!!!";
        return orderSummary;

    }


}