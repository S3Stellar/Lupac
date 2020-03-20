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
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;
    private CircleIndicator circleIndicator;

    private HomeFragment hf = new HomeFragment();
    private AlarmsFragment af = new AlarmsFragment();
    private SongsLibraryFragment lf = new SongsLibraryFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;

        initializeId();
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);
        viewPager.setOffscreenPageLimit(3);
        addFragments();

        circleIndicator.setViewPager(viewPager);
        // Optional
        viewPagerAdapter.registerDataSetObserver(circleIndicator.getDataSetObserver());

        viewPager.setCurrentItem(Finals.HOME_PAGE);
    }



    // Full screen with notch (colors can be changed from colors.xml)
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS,
                    WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            //LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES - for notch with custom color
        }
    }

    public void initializeId(){
        viewPager = findViewById(R.id.view_pager);
        circleIndicator = findViewById(R.id.indicator);
    }

    private void addFragments() {
        viewPagerAdapter.addFragment(af, context.getResources().getString(Finals.TAB_TITLES[0]));
        viewPagerAdapter.addFragment(hf, context.getResources().getString(Finals.TAB_TITLES[1]));
        viewPagerAdapter.addFragment(lf, context.getResources().getString(Finals.TAB_TITLES[2]));
        viewPagerAdapter.notifyDataSetChanged();
    }
}
