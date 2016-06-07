package app.myandoidhello.com.checkboxapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.TextureView;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClick(View view){
        TextView textView = (TextView) findViewById(R.id.mytTextView);

        boolean checked =((CheckBox)view).isChecked();
        switch (view.getId()){

            case R.id.tea:
                if(checked)
                    textView.setText("Tea");
                break;
            case R.id.milk:
                if (checked)
                    textView.setText("Milk");
                break;
        }
    }
}
