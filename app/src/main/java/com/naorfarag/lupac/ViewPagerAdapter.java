package com.naorfarag.lupac;


import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private List<String> tabsTitle = new ArrayList<>();
    private List<Fragment> fragmentList = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

  /*  @Override
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
    }*/

    @Override
    @Nullable
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabsTitle.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size(); // Three fragments
    }

    public void addFragment(Fragment fragment, String title) {
        fragmentList.add(fragment);
        tabsTitle.add(title);
    }
}