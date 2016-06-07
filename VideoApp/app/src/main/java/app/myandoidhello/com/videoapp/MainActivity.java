package app.myandoidhello.com.videoapp;

import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final VideoView myVideoView = (VideoView) findViewById(R.id.myVideoView);
        myVideoView.setVideoPath("http://clips.vorwaerts-gmbh.de/VfE_html5.mp4");
        myVideoView.start();
    }
}
