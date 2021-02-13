package org.techtown.thread_sample1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    int value = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BackgroundThread thread = new BackgroundThread();
                thread.start();
            }
        });
    }

    class BackgroundThread extends Thread{
        public void run(){
            for (int i=0; i<100; i++){
                try{
                    Thread.sleep(1000);
                }catch (Exception e){

                }
                value+=1;

            }
        }
    }
}