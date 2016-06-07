package app.myandoidhello.com.imageeffects;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView myImageView;
    Drawable studLogo;
    Bitmap bitmapImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myImageView = (ImageView) findViewById(R.id.myImageView);

        /* studLogo = ResourcesCompat.getDrawable(getResources(),R.drawable.flower,null);
        bitmapImage = ((BitmapDrawable)studLogo).getBitmap();

        Bitmap newphoto = invertImage(bitmapImage);
        myImageView.setImageBitmap(newphoto); */

        Drawable [] layers = new Drawable[2];
            layers[0] = ResourcesCompat.getDrawable(getResources(),R.drawable.sheep,null);
            layers[1] = ResourcesCompat.getDrawable(getResources(),R.drawable.transparen,null);
            LayerDrawable layerDrawable = new LayerDrawable(layers);
            myImageView.setImageDrawable(layerDrawable);


    }

    public static Bitmap invertImage(Bitmap original){

        Bitmap finalImage = Bitmap.createBitmap(original.getWidth(),original.getHeight(),original.getConfig());
        int A,R,G,B;
        int pixelcolor;
        int height = original.getHeight();
        int width =original.getWidth();

        for (int y=0; y < height; y++){
            for (int x=0;x<width;x++){
                pixelcolor=original.getPixel(x,y);
                A= Color.alpha(pixelcolor);
                R=255-Color.red(pixelcolor);
                G=255-Color.green(pixelcolor);
                B=255-Color.blue(pixelcolor);

                finalImage.setPixel(x,y,Color.argb(A,R,G,B));
            }
        }
            return finalImage;
    }

}
