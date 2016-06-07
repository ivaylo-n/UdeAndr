package app.myandoidhello.com.dataapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    EditText myInput;
    TextView myText;
    DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myInput = (EditText) findViewById(R.id.myInput);
        myText = (TextView ) findViewById(R.id.myText);

        dbHandler = new DBHandler(this,null,null,1);
        printDatabase();
    }

    public void printDatabase(){
        String dbstring = dbHandler.databaseToString();
        myText.setText(dbstring);
        myInput.setText("");
    }

    public void addButtonClick(View view){
        Products products = new Products(myInput.getText().toString());
        dbHandler.addProduct(products);
        printDatabase();
    }

    public void deleteButtonClick(View view){
        String inputText = myInput.getText().toString();
        dbHandler.deleteProduct(inputText);
        printDatabase();
    }
}
