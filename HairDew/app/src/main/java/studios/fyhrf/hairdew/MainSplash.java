package studios.fyhrf.hairdew;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import java.util.Timer;

/**
 * Created by fyhrf on 3/17/2018.
 */

public class MainSplash extends AppCompatActivity{

    private final int LOAD_SPLASH = 3000;
    private Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

//        timer = new Timer();
//        TimerTask task = new TimerTask() {
//            @Override
//            public void run() {goToLogin();}
//        };
//        timer.schedule(task, LOAD_SPLASH);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                goToLogin();
                finish();
            }
        },2000);

    }

    private void goToLogin (){
        Intent intent = new Intent(this, MainSplash.class);
        startActivity(intent);
        finish();
    }
}
