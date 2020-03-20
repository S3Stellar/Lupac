package com.naorfarag.lupac;

import android.content.Context;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Adapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import me.relex.circleindicator.CircleIndicator;
import me.relex.circleindicator.CircleIndicator3;

public class MainActivity extends AppCompatActivity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));
        context = this;

        CircleIndicator indicator = findViewById(R.id.indicator);
        indicator.setViewPager(viewPager);

        // Optional
        adapter.registerDataSetObserver(indicator.getDataSetObserver());

        viewPager.setCurrentItem(Finals.HOME_PAGE);
    }

    // Full screen with notch (colors can be changed from colors.xml)
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            getWindow().setFlags(WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES,
                    WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES);
        }
    }
}
