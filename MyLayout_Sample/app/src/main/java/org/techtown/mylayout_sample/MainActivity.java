package org.techtown.mylayout_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Layout1 lay1 = findViewById(R.id.layout1);
        lay1.setImage(R.drawable.ic_launcher_background);
        lay1.setName("황규빈");
        lay1.setMoblie("01034098600");

        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lay1.setImage(R.drawable.ic_launcher_foreground);
            }
        });
    }
}