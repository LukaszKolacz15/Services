package pl.akademiakodu.lukaszkolacz.services;

import android.app.IntentService;
import android.content.Intent;
import android.os.Handler;
import android.widget.Toast;

/**
 * Created by Lukasz Kolacz on 21.06.2017.
 */

public class SimpleIntentService extends IntentService{

    Handler handler = new Handler();

    public SimpleIntentService() {
        super("TestWorker");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        handler.post(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(getApplicationContext(), "Witaj swiecie", Toast.LENGTH_LONG).show();
                handler.postDelayed(this, 5000);
            }
        });
    }
}
