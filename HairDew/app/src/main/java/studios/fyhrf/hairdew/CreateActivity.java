package studios.fyhrf.hairdew;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by fyhrf on 3/20/2018.
 */

public class CreateActivity extends AppCompatActivity {
Button bgnBldBttn;
TextView chooseYourBaseTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        beginBuildUI();
        beginBuildEvents();
    }

    public void beginBuildUI () {

        bgnBldBttn =findViewById(R.id.button_begin_build);
        chooseYourBaseTV = findViewById(R.id.chooseBase_text_view);

    }
    public void chooseYourBase(View view){
        Intent intent = new Intent(CreateActivity.this, ChooseBaseInfoActivity.class);
        startActivity(intent);
    }
    public void chooseYourOil(View view){
        Intent intent = new Intent(CreateActivity.this, ChooseOilInfoActivity.class);
        startActivity(intent);
    }

    public void chooseYourScent(View view){
        Intent intent = new Intent(CreateActivity.this, ChooseScentInfoActivity.class);
        startActivity(intent);
    }

    public void beginBuildEvents(){
        bgnBldBttn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view){
            Intent intent = new Intent(CreateActivity.this, BuildProductActivity.class);
            startActivity(intent);
        }
            });

    }


}
