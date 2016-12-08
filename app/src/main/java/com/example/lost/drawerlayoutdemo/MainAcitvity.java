package com.example.lost.drawerlayoutdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.text.Layout;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

/**
 * Created by lost on 2016/12/8.
 */

public class MainAcitvity extends Activity {

    private DrawerLayout drawerLayout;
    private View mainLayout;
    private View rightLayout;
    private Button mainButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mainLayout = findViewById(R.id.main_layout);
        rightLayout = findViewById(R.id.drawer_right_layout);
        mainButton = (Button) findViewById(R.id.main_button);
    }

    public void click(View v) {
        drawerLayout.openDrawer(Gravity.RIGHT);
    }
}
