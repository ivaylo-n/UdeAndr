package app.myandoidhello.com.sharedprefer;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText userInput;
    EditText passwordInput;
    TextView displayText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInput = (EditText)findViewById(R.id.usernameInput);
        passwordInput = (EditText)findViewById(R.id.passwordInput);
        displayText = (TextView) findViewById(R.id.displayText);
    }

    public void saveInfo(View view){
        SharedPreferences sharedpref = getSharedPreferences("userinfo", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedpref.edit();

        editor.putString("username",userInput.getText().toString());
        editor.putString("password",passwordInput.getText().toString());

        editor.apply();

        Toast.makeText(this,"Saved",Toast.LENGTH_LONG).show();
    }

    public void displayData(View view){

        SharedPreferences sharedpref = getSharedPreferences("userinfo", Context.MODE_PRIVATE);

        String name = sharedpref.getString("username","");
        String password = sharedpref.getString("password","");

        displayText.setText(name + " " + password);
    }

}
