package app.koki.com.intentservice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        Bundle firstData = getIntent().getExtras();

        if (firstData == null) {
            return;
        }
        String firstMessage = firstData.getString("firstMessage");
        final TextView secondText = (TextView)findViewById(R.id.secondText);
        secondText.setText(firstMessage);
    }
}
