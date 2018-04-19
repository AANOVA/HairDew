package studios.fyhrf.hairdew;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class MainLogin extends AppCompatActivity {
    public EditText userName;
    public EditText password;
    public Button login;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       login();


    }

    public void login () {
        //ui
        userName = findViewById(R.id.username_editText);
        password = findViewById(R.id.password_editText);
        login = findViewById(R.id.login_button);


        //events


    }
}
