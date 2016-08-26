package com.souban.coordinatorlayout;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.souban.coordinatorlayout.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding dataBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        FloatingActionButton floatBar = (FloatingActionButton) findViewById(R.id.float_bar);

        final BottomSheetBehavior behavior = BottomSheetBehavior.from(dataBinding.bottomSheet);

        floatBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "please click", Snackbar.LENGTH_SHORT)
                        .setAction("turn to scrollActivity", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                startActivity(new Intent(MainActivity.this, ScrollingActivity.class));
                            }
                        }).show();
                if (BottomSheetBehavior.STATE_HIDDEN == behavior.getState() || BottomSheetBehavior.STATE_COLLAPSED == behavior.getState()) {
                    behavior.setState(BottomSheetBehavior.STATE_EXPANDED);
                } else {
                    behavior.setState(BottomSheetBehavior.STATE_HIDDEN);
                }
            }
        });
    }
}
