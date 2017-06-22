package pl.akademiakodu.lukaszkolacz.services;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        INTENT SERVICE:

//        Intent service = new Intent(this, SimpleIntentService.class);
//        startService(service);
//        stopService(service);


//      SERVICE:

        Intent service = new Intent(this, SimpleService.class);
        startService(service);
    }
}
