package pl.akademiakodu.lukaszkolacz.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by Lukasz Kolacz on 22.06.2017.
 */

public class SimpleService extends Service{

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        for(int i = 0; i<=100; i++){
            Toast.makeText(this, "Jestem z service", Toast.LENGTH_SHORT).show();
        }
        stopSelf();

        return super.onStartCommand(intent, flags, startId);
    }
}
