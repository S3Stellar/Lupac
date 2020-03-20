package com.naorfarag.lupac;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new AlarmsFragment(); // Fragment1 at position 0
            case 1:
                return new HomeFragment(); // Fragment2 at position 1
            case 2:
                return new SongsLibraryFragment(); // Fragment3 at position 2
        }
        return null; //does not happen
    }

    @Override
    public int getCount() {
        return 3; // Three fragments
    }
}