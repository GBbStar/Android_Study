package org.techtown.navigationdrawer;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Main2Activity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, FragmentCallback{

    private AppBarConfiguration mAppBarConfiguration;

    fragment1 f1;
    fragment2 f2;
    fragment3 f3;

    DrawerLayout drawer;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();


        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        f1 = new fragment1();
        f2 = new fragment2();
        f3 = new fragment3();

        getSupportFragmentManager().beginTransaction().add(R.id.container, f1).commit();
    }

    @Override
    public void onBackPressed() {
        if(drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.menu1){
            Toast.makeText(this,"첫번쨰", Toast.LENGTH_SHORT).show();
            onFragmentSelected(0, null);
        }
        else if (id == R.id.menu2){
            Toast.makeText(this,"두번쨰", Toast.LENGTH_SHORT).show();
            onFragmentSelected(1, null);
        }
        else if (id == R.id.menu3){
            Toast.makeText(this,"세번쨰", Toast.LENGTH_SHORT).show();
            onFragmentSelected(2,null);
        }

        drawer.closeDrawer(GravityCompat.START);

        return true;
    }

    @Override
    public void onFragmentSelected(int position, Bundle bundle) {
        Fragment curFragment = null;

        if (position == 0){
            curFragment = f1;
            toolbar.setTitle("1번 화면");
        }
        else if (position == 1){
            curFragment = f2;
            toolbar.setTitle("2번 화면");
        }
        else if (position == 2){
            curFragment = f3;
            toolbar.setTitle("3번 화면");
        }

        getSupportFragmentManager().beginTransaction().replace(R.id.container, curFragment).commit();
    }
}