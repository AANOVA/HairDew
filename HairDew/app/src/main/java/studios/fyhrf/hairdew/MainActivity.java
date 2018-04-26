package studios.fyhrf.hairdew;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.SearchView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button Create;
    final Context context = this;
    private Button Explore;
    private Button FAQ;
    private SearchView searchView;
    private float price = 0;
    TextView orderSummaryPrice;

    public CheckBox rawSheaButter;
    public CheckBox whiteSheaButter;
    public CheckBox jojobaOil;
    public CheckBox coconutOil;
    public CheckBox grapeseedOil;
    public CheckBox jamaicanBlackCastorOil;
    public CheckBox roseWater;
    public CheckBox vanilla;
    public CheckBox lavenderOil;
    public CheckBox peppermintOil;
    public CheckBox teaTreeOil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpUI();
        events();
    }

    private void setUpUI(){
        Create = findViewById(R.id.button_Create);
        Explore =  findViewById(R.id.button_Explore);
        FAQ = findViewById(R.id.button_FAQ);

    }

    private void events(){
        Create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0){
                Intent intent = new Intent(MainActivity.this, CreateActivity.class);
                startActivity(intent);
            }

        });

        Explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this, ExploreActivity.class);
                startActivity(intent);
            }
        });

        FAQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this, FAQActivity.class);
                startActivity(intent);
            }
        });

    }
    //This Method Loads the Apps Home page when user clicks on LogIn Button
    public void goToMainLogin(View view){
        button = (Button) findViewById(R.id.login_button);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(MainActivity.this, MainLogin.class);
                startActivity(intent);
                finish();

            }

        });

    }



    }


