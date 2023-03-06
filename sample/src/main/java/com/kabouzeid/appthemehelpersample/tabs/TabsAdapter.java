package com.kabouzeid.appthemehelpersample.tabs;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

/**
 * @author Aidan Follestad (afollestad)
 */
public class TabsAdapter extends FragmentStatePagerAdapter {

    public TabsAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return TabFragment.create(position + 1);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return String.format("TAB%d", position);
    }

    @Override
    public int getCount() {
        return 2;
    }
}
