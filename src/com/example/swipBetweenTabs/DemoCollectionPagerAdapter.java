package com.example.swipBetweenTabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by mark on 5/7/14.
 */
public class DemoCollectionPagerAdapter extends FragmentStatePagerAdapter{
    public DemoCollectionPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        //Fragment fragment = new Fragment();

        Fragment fragment  = new DemoObjectFragment();
        Bundle args = new Bundle();
        // Our object is just an integer :-P
        args.putInt(DemoObjectFragment.ARG_OBJECT, i + 1);
        fragment.setArguments(args);

        //return new DemoObjectFragment();

        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "OBJECT " + (position + 1);
    }
}
