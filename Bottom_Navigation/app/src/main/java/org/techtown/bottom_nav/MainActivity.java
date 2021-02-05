package org.techtown.bottom_nav;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    fragment1 f1;
    fragment2 f2;
    fragment3 f3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        f1 = new fragment1();
        f2 = new fragment2();
        f3 = new fragment3();

        getSupportFragmentManager().beginTransaction().replace(R.id.container, f1).commit();

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.tab1:
                        Toast.makeText(getApplicationContext(), "첫번째 탭", Toast.LENGTH_SHORT).show();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, f1).commit();
                        return true;

                    case R.id.tab2:
                        Toast.makeText(getApplicationContext(), "두번째 탭", Toast.LENGTH_SHORT).show();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, f2).commit();
                        return true;

                    case R.id.tab3:
                        Toast.makeText(getApplicationContext(), "세번째 탭", Toast.LENGTH_SHORT).show();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, f3).commit();
                        return true;
                }

                return false;
            }
        });

    }
}