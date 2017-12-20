package com.laptopapik.appdokartest;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;


/**
 * Created by Laptop Apik on 20/12/2017.
 */

public class TabPageAdapter extends FragmentPagerAdapter {
    public static int PAGE_COUNT = 4;
    public TabPageAdapter (FragmentManager fm ) {super(fm);};

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0 :
                return new FragmentSatu();
            case 1 :
                return new FragmentDua();
            case 2 :
                return new FragmentTiga();
            case 3 :
                return new FragmentEmpat();
        }

        return null;
    }

    @Override
    public int getCount() {

        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return super.getPageTitle(position);
    }

}
