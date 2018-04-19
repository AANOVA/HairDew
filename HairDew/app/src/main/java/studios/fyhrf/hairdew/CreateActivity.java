package studios.fyhrf.hairdew;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by fyhrf on 3/20/2018.
 */

public class CreateActivity extends AppCompatActivity {
Button bgnBldBttn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        beginBuildUI();
        beginBuildEvents();
    }

    public void beginBuildUI () {
        bgnBldBttn =findViewById(R.id.button_begin_build);
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
