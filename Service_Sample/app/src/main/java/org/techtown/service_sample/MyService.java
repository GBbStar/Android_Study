package org.techtown.service_sample;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyService extends Service {
    private static final String TAG = "MyService";

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if(intent == null){
            return Service.START_STICKY;
        }
        else {
            processCommand(intent);
        }

        return super.onStartCommand(intent, flags, startId);

    }

    private void processCommand(Intent intent){
        String command = intent.getStringExtra("command");
        String name = intent.getStringExtra("name");



        Intent showIntent = new Intent(getApplicationContext(), MainActivity.class);
        showIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_SINGLE_TOP | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        showIntent.putExtra("comman", "show");
        showIntent.putExtra("name", name+"from Service");
        startActivity(showIntent);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
