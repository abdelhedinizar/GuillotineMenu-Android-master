package com.yalantis.guillotine.sample.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.yalantis.guillotine.animation.GuillotineAnimation;
import com.yalantis.guillotine.sample.R;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by Dmytro Denysenko on 5/4/15.
 */
public class MainActivity extends AppCompatActivity {
    private static final long RIPPLE_DURATION = 250;


    @InjectView(R.id.toolbar)
    Toolbar toolbar;
    @InjectView(R.id.root)
    FrameLayout root;
    @InjectView(R.id.content_hamburger)
    View contentHamburger;
    Button button;

    View guillotineMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        View view;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);
        ButterKnife.inject(this);


        if (toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setTitle(null);
        }

       guillotineMenu = LayoutInflater.from(this).inflate(R.layout.guillotine, null);
        root.addView(guillotineMenu);

GuillotineAnimation guillotineAnimation =      new GuillotineAnimation.GuillotineBuilder(guillotineMenu, guillotineMenu.findViewById(R.id.guillotine_hamburger), contentHamburger)
                .setStartDelay(RIPPLE_DURATION)
                .setActionBarViewForAnimation(toolbar)
                .setClosedOnStart(true)
                .build();
        button = (Button) guillotineMenu.findViewById(R.id.clickme);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Log.d("Nizar","ddmldsm");
            }
        });

    }

        }
