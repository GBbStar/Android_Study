package org.techtown.loopermessagetothread_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edit1;
    TextView text1;

    Handler handler = new Handler();

    ProcessThread thread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = findViewById(R.id.editTextTextPersonName);
        text1 = findViewById(R.id.textView);

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = edit1.getText().toString();
                Message message = Message.obtain();
                message.obj = input;

                thread.processHandler.sendMessage(message);
            }
        });

        thread = new ProcessThread();
    }

    class ProcessThread extends Thread{
        ProcessHandler processHandler = new ProcessHandler();
        public void run(){
            Looper.prepare();
            Looper.loop();
        }
        class ProcessHandler extends Handler{
            public void handleMessage(Message msg){
                final String output = msg.obj + "from Thread";
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        text1.setText(output);
                    }
                });
            }
        }
    }
}