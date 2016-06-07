package app.myandoidhello.com.radiobtnapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClicked(View view){
        TextView textView = (TextView)findViewById(R.id.MyTextView);
        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.radio_group);
        int id = radioGroup.getCheckedRadioButtonId();

        switch (id){
            case R.id.male:
                textView.setText("Male");
                break;
            case R.id.female:
                textView.setText("Female");
                break;
        }
    }
}
