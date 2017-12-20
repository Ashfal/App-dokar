package com.laptopapik.appdokartest;


import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.view.View;
import android.widget.SearchView;


public class HomeActivity extends AppCompatActivity {
    ViewPager mViewPager;
    TabPageAdapter mAdapter;
    TabLayout mTablayout;
    Toolbar mytoolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mytoolbar= findViewById(R.id.my_toolbar);
        setSupportActionBar(mytoolbar);
        getSupportActionBar().setTitle("Dokar Home");

        pagesetup();
    }

    private void pagesetup () {
        mViewPager = findViewById(R.id.container);
        mAdapter = new TabPageAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mAdapter);
        mTablayout = findViewById(R.id.tab1);
        mTablayout.setupWithViewPager(mViewPager);
        mTablayout.getTabAt(0).setIcon(R.drawable.ic_camera);
        mTablayout.getTabAt(1).setIcon(R.drawable.ic_home);
        mTablayout.getTabAt(2).setIcon(R.drawable.ic_group);
        mTablayout.getTabAt(3).setIcon(R.drawable.ic_notif);
        mTablayout.getTabAt(0).getIcon().setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_IN);
        mTablayout.getTabAt(1).getIcon().setColorFilter(Color.parseColor("#bfbfbf"), PorterDuff.Mode.SRC_IN);
        mTablayout.getTabAt(2).getIcon().setColorFilter(Color.parseColor("#bfbfbf"), PorterDuff.Mode.SRC_IN);
        mTablayout.getTabAt(3).getIcon().setColorFilter(Color.parseColor("#bfbfbf"), PorterDuff.Mode.SRC_IN);
        mTablayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager){
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                tab.getIcon().setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_IN);

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                tab.getIcon().setColorFilter(Color.parseColor("#bfbfbf"), PorterDuff.Mode.SRC_IN);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }

        });
        TabLayout.Tab tab = mTablayout.getTabAt(1);
        tab.select();

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.act_bar, menu);
        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) searchItem.getActionView();

        // Configure the search info and add any event listeners...

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_search:
                // User chose the "Favorite" action, mark the current item
                // as a favorite...
                return true;

            case R.id.action_settings:
                // User chose the "Favorite" action, mark the current item
                // as a favorite...
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }

}
