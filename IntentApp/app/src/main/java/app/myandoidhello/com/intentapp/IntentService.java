package app.myandoidhello.com.intentapp;


import android.content.Intent;
import android.util.Log;

public class IntentService extends android.app.IntentService{

    private static final String TAG="app.myandoidhello.com.intentapp";

    public IntentService(String name) {
        super("IntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.i(TAG,"The service has started");
    }
}
