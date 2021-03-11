package com.hastiya.circlemenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CircleMenu circleMenu;
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        circleMenu = findViewById(R.id.circle_menu);
        constraintLayout = findViewById(R.id.constraint);

        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"), R.mipmap.list, R.mipmap.cancel)
                .addSubMenu(Color.parseColor( "#88bef5"), R.mipmap.home)
                .addSubMenu(Color.parseColor( "#83e85a"), R.mipmap.search)
                .addSubMenu(Color.parseColor( "#FF4B32"), R.mipmap.notification)
                .addSubMenu(Color.parseColor( "#ba53de"), R.mipmap.settings)
                .addSubMenu(Color.parseColor( "#ff8a5c"), R.mipmap.gps)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {

                    public void onMenuSelected(int index){
                        switch (index){
                            case 0;
                                Toast.makeText(MainActivity.this, "home", Toast.LENGTH_SHORT).show();
                                constraintLayout.setBackgroundColor(Color.parseColor("#ecfffb"));
                                break;

                            case 1;
                                Toast.makeText(MainActivity.this, "search", Toast.LENGTH_SHORT).show();
                                constraintLayout.setBackgroundColor(Color.parseColor("#96f7d2"));
                                break;

                            case 2;
                                Toast.makeText(MainActivity.this, "notification", Toast.LENGTH_SHORT).show();
                                constraintLayout.setBackgroundColor(Color.parseColor("#fac4a2"));
                                break;
                            case 3;
                                Toast.makeText(MainActivity.this, "settings", Toast.LENGTH_SHORT).show();
                                constraintLayout.setBackgroundColor(Color.parseColor("#d3cdef"));
                                break;
                            case 4;
                                Toast.makeText(MainActivity.this, "gps", Toast.LENGTH_SHORT).show();
                                constraintLayout.setBackgroundColor(Color.parseColor("#fff591"));
                                break;

                        }
                    }
                });

    }
}